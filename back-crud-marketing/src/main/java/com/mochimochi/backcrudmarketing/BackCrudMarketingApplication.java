package com.mochimochi.backcrudmarketing;

import com.mochimochi.backcrudmarketing.model.TipoUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mochimochi.backcrudmarketing.model.Evento;
import com.mochimochi.backcrudmarketing.model.User;
import com.mochimochi.backcrudmarketing.repository.EventoRepository;
import com.mochimochi.backcrudmarketing.repository.UserRepository;

@SpringBootApplication
public class BackCrudMarketingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackCrudMarketingApplication.class, args);
	}




	}



