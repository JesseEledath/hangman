package com.lightwellinc.hangman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class HangmanApplication
{

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(HangmanApplication.class, args);
		String word = game();
		System.out.println(word);
	}

	public static String game() throws IOException, InterruptedException {
		GetApi api = new GetApi();
		String word = api.GetApi();
		return word;
	}

}
