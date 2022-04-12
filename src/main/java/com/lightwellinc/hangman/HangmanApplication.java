package com.lightwellinc.hangman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class HangmanApplication
{

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(HangmanApplication.class, args);
		game();
	}

	public static void game() throws IOException, InterruptedException {
		GetApi api = new GetApi();
		String word = api.GetApi();
		System.out.println(word);
	}

}
