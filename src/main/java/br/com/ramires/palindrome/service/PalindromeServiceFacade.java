package main.java.br.com.ramires.palindrome.service;

public interface PalindromeServiceFacade {

	static PalindromeServiceFacade instance = null;
	static PalindromeServiceFacade getInstance() {
		return( instance );
	}
	public void run(Object argument);
}
