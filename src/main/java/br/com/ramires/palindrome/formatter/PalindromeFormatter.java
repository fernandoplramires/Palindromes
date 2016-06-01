package main.java.br.com.ramires.palindrome.formatter;

public interface PalindromeFormatter {

	static PalindromeFormatter instance = null;
	static PalindromeFormatter getInstance() {
		return( instance );
	}
	void printOut(Object outputData);
}
