package com.ticketbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.ticketbooking.service.TicketService;

@SpringBootApplication
@PropertySource("classpath:endpoints.properties")
public class TicketBookingAppMySqlApplication implements CommandLineRunner {

	@Autowired
	private TicketService ticketService;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingAppMySqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
