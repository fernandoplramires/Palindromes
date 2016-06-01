package main.java.br.com.ramires.palindrome.controller;

import main.java.br.com.ramires.palindrome.service.PalindromeServiceFacadeImpl;

public class PalindromeController {

	public static void main(String[] args) {

		PalindromeServiceFacadeImpl.getInstance().run(args);
	}
}
