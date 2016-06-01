package main.java.br.com.ramires.palindrome.service;

import main.java.br.com.ramires.palindrome.business.PalindromeBusinessCore;
import main.java.br.com.ramires.palindrome.business.PalindromeBusinessCoreImpl;
import main.java.br.com.ramires.palindrome.domain.PalindromeGateway;
import main.java.br.com.ramires.palindrome.exception.PalindromeParserException;
import main.java.br.com.ramires.palindrome.formatter.PalindromeFormatter;
import main.java.br.com.ramires.palindrome.formatter.PalindromeFormatterImpl;
import main.java.br.com.ramires.palindrome.parser.PalindromeParser;
import main.java.br.com.ramires.palindrome.parser.PalindromeParserImpl;

public class PalindromeServiceFacadeImpl implements PalindromeServiceFacade {

	private PalindromeParser inputFormatter;
	private PalindromeBusinessCore businessCore;
	private PalindromeFormatter outputFormatter;

	public static PalindromeServiceFacade instance;
	public static PalindromeServiceFacade getInstance() {
		if (instance == null) {
			instance = new PalindromeServiceFacadeImpl();
		}
		return( instance );
	}

	PalindromeServiceFacadeImpl() {

		inputFormatter = PalindromeParserImpl.getInstance();
		businessCore = PalindromeBusinessCoreImpl.getInstance();
		outputFormatter = PalindromeFormatterImpl.getInstance();
	}

	public void run(Object argument) {

		try {
			PalindromeGateway inputData = (PalindromeGateway) inputFormatter.parser(argument);
			PalindromeGateway outputData = (PalindromeGateway) businessCore.generateResults(inputData);
			outputFormatter.printOut(outputData);
		}
		catch (PalindromeParserException e) {
			System.out.println(e.getMessage());
		}
	}
}
