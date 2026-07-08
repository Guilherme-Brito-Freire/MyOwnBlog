package com.guilhermebritofreire.my_own_blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MyOwnBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyOwnBlogApplication.class, args);
	}

}
