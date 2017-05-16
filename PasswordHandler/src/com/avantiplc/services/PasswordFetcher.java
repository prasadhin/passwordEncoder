package com.avantiplc.services;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordFetcher {
	
	 public String getEncodedPassword(String password){
		 PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	     String encodedPassword = passwordEncoder.encode(password);
	     return encodedPassword;
	    }

	public static void main(String[] args) {
		
		String passwordToBeSet=args[0];		
		PasswordFetcher pf = new PasswordFetcher();
		String encodedPassword = pf.getEncodedPassword(passwordToBeSet);
	    System.out.println("Password requested ="+passwordToBeSet);
	    System.out.println("Encoded Password="+encodedPassword);
	}

}
