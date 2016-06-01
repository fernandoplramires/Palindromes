package main.java.br.com.ramires.palindrome.business;

public interface PalindromeBusinessCore {

	static PalindromeBusinessCore instance = null;
	static PalindromeBusinessCore getInstance() {
		return( instance );
	}

	public Object generateResults(Object inputData);
}
