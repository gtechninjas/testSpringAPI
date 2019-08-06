package com.complexity.tool;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApiApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiApplication.class, args);
		String filePath = "C:\\Users\\diaalk\\Desktop\\Test.java";
		File file = new File(filePath);
		ReadLine readLine = new ReadLine();
		try {
			readLine.readLines(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
