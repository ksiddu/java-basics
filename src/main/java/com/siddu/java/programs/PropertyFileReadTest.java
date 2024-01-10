package com.siddu.java.programs;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReadTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("src/test/resources/config.properties");
		
		Properties pr = new Properties();
		pr.load(fr);
		
		System.out.println(pr.getProperty("user"));
		System.out.println(pr.getProperty("password"));

	}

}
