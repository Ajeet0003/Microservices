package com.learn;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.property.MessageConstant;
import com.java.property.ReadProperty;

@SpringBootApplication
public class LearnApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Properties properties=new Properties();
		
			try {
				Properties read=new Properties();
				
				File messageFile=new File(ReadProperty.class.getResource("/message.properties").toURI());
				read.load(new FileInputStream(messageFile));
				
				properties=read;
				assignToConstant();
				
			} catch (Exception e) {
				// TODO: handle exception

				e.printStackTrace();
			}
		}

		private static void assignToConstant() {
			try {
				MessageConstant.FILE_NOT_EXIST_ERROR=ReadProperty.properties.getProperty("error.filenotexist");
			
				System.out.println(MessageConstant.FILE_NOT_EXIST_ERROR);
			
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}


