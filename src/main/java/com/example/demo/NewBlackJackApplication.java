package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.t.controller.BlackJackController;

@SpringBootApplication
public class NewBlackJackApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewBlackJackApplication.class, args);
		BlackJackController con = new BlackJackController();
		con.startApplication();
	}

}
