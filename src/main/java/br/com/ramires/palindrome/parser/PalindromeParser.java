package main.java.br.com.ramires.palindrome.parser;

import main.java.br.com.ramires.palindrome.exception.PalindromeParserException;

public interface PalindromeParser {

	static PalindromeParser instance = null;
	static PalindromeParser getInstance() {
		return( instance );
	}
	public Object parser(Object objectToParser) throws PalindromeParserException;
}
