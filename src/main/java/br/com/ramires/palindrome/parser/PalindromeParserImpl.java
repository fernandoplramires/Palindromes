package main.java.br.com.ramires.palindrome.parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

import main.java.br.com.ramires.palindrome.domain.PalindromeGateway;
import main.java.br.com.ramires.palindrome.domain.PalindromeGatewayImpl;
import main.java.br.com.ramires.palindrome.exception.PalindromeParserException;

public class PalindromeParserImpl implements PalindromeParser {

	static PalindromeParser instance = null;
	public static PalindromeParser getInstance() {
		if (instance == null) {
			instance = new PalindromeParserImpl();
		}
		return( instance );
	}

	public Object parser(Object objectToParser) throws PalindromeParserException {

		String line = "";
		String filePath = "";
		BufferedReader reader = null;
		PalindromeGateway inputData = new PalindromeGatewayImpl();
		Pattern linePattern = Pattern.compile(PalindromeParserConfig.lineRegexExpression);
		try {
			String[] arguments = (String[]) objectToParser;
			if (arguments.length > 0) {
				filePath = arguments[0];
			}
			reader = new BufferedReader(new FileReader(filePath));
			while ((line = reader.readLine()) != null) {
				if (linePattern.matcher(line).find()) {
					inputData.addData(new Long(line));
				}
			}
		}
		catch (FileNotFoundException e) {
			throw new PalindromeParserException(PalindromeParserConfig.exceptionFileNotFoundLine);
		}
		catch (IOException e) {
			throw new PalindromeParserException(PalindromeParserConfig.exceptionGenericIOLine);
		}
		finally {
			if (reader != null) {
				try {
					reader.close();
				}
				catch (IOException e) {
					throw new PalindromeParserException(PalindromeParserConfig.exceptionGenericIOLine);
				}
			}
		}
		return( inputData );
	}
}
