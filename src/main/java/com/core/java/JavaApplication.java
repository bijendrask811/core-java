package com.core.java;


import com.core.builder.pattern.ExecuteBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {

		//Builder Patter
		ExecuteBuilder builder = new ExecuteBuilder();
		builder.executeBuilder();
	}

}
