package com.jass.EsportsManagementDAO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jass.EsportsManagementDAO.entities.Game;
import com.jass.EsportsManagementDAO.services.GameService;
import com.jass.EsportsManagementDAO.services.GameServiceImplement;

@SpringBootApplication
public class EsportsManagementDAOApplication {

	public static void main(String[] args) {
		ApplicationContext context = 
				SpringApplication.run(EsportsManagementDAOApplication.class, args);
		
		//GameService service = context.getBean(GameServiceImplement.class);
	}

}
