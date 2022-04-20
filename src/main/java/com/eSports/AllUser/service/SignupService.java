package com.eSports.AllUser.service;

import java.io.UnsupportedEncodingException;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.eSports.AllUser.model.User;
import com.eSports.AllUser.model.VerificationCode;
import com.eSports.AllUser.ripository.UserSignupRepository;
import com.eSports.AllUser.ripository.VerificationCodeRepository;

@Service
public class SignupService {

	private static final Logger log = LoggerFactory.getLogger(SignupService.class);
	
	@Autowired
	private UserSignupRepository signupRepository;
	@Autowired
	private VerificationCodeRepository codeRepository;
	@Autowired
	public JavaMailSender mailSender;
	@Autowired
	public ServiceUrl serviceUrl;
	
	public User saveUser(User user)
	{
		return signupRepository.save(user);
	}
	
	public VerificationCode saveVerificationCode(VerificationCode code)
	{
		return codeRepository.save(code);
	}
	
	public void sendVerificationMail(VerificationCode code ,User user, String requestUrl) throws UnsupportedEncodingException, MessagingException
	{
		String subject = "please verify your registration";
		String senderName = "eSports-Arena Team";
		String content = "Dear" + user.getUserName();
		content+="please click the below link to verify<br>"
				+"<h3><a href='"+requestUrl+"/verify/"+code.getCode()+"'>Click here to Verify</a></h3>";
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
		messageHelper.setFrom("sovonsingha0@gmail.com", senderName);
		messageHelper.setTo(user.getEmail());
		messageHelper.setSubject(subject);
		messageHelper.setText(content, true);
		mailSender.send(mimeMessage);
		
	}
	
	public boolean verifymail(String verify_code)
	{
		Optional<VerificationCode> verCode = Optional.ofNullable(codeRepository.findVerificationCodeByCode(verify_code));
		if(verCode.isPresent())
		{
			Optional<User> optionalUser = signupRepository.findById(verCode.get().getUserId());
			if(optionalUser.isPresent())
			{
				User user = optionalUser.get();
				log.debug("   User :   ", user.toString());
				user.setEmailVerified(true);
				signupRepository.save(user);
				return true;
			}
		}
		return false;
			
	}
	
}
