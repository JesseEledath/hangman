package com.lightwellinc.hangman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.lang.model.element.Element;
import java.awt.Desktop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class HangmanApplication {

	public static void main(String[] args) throws IOException {
		String word = "sample";
		int strikes =0;
		Boolean word_complete= false;
		SpringApplication.run(HangmanApplication.class, args);
		createIndexFile(word);

	}
	public static void createIndexFile(String word)  throws IOException {
		HangmanUI ui = new HangmanUI();
		ui.loadPage(word);
//		System.out.println("Lets Play");
//		System.out.println("Enter Letters");
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			str.append("_ ");
		}
		String dash = str.toString();
//		System.out.println(str.toString());
//		Scanner sn = new Scanner(System.in);
//		 char a = sn.next().charAt(0);

		File f = new File("./src/main/resources/static/index.html");
		if (f.delete()) {

			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			bw.write("<html><h1>Hangman</h1>");
			bw.write("<body> <p cols=75 rows=10> Guess Word !! " + dash);
			bw.write("</p>");
			bw.write("<form >" );
			bw.write("<input id=chr  type=\"text\" maxlength=\"1\" size=\"1\">");
			bw.write(" <%=request.getParameter(\"chr\") %>");
			bw.write("</form>");
			bw.write("</body></html>");
			bw.close();

		}
//		System.out.println(a);
	}




}
