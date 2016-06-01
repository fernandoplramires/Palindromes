package main.java.br.com.ramires.palindrome.formatter;

import main.java.br.com.ramires.palindrome.domain.PalindromeGateway;
import main.java.br.com.ramires.palindrome.entity.PalindromeEntity;

public class PalindromeFormatterImpl implements PalindromeFormatter {

	static PalindromeFormatter instance = null;
	public static PalindromeFormatter getInstance() {
		if (instance == null) {
			instance = new PalindromeFormatterImpl();
		}
		return( instance );
	}

	public void printOut(Object outputData) {

		for (Object interator: ((PalindromeGateway) outputData).getDataList()) {

			PalindromeEntity data = (PalindromeEntity) interator;
			StringBuilder lineResult = new StringBuilder("");
			if (data.isHavePalindrome == true) {

				lineResult.append(String.format("%05d", data.iniNumber));
				lineResult.append(PalindromeFormatterConfig.successSeparator);
				lineResult.append(String.format("%03d", data.countOfInterations));
				lineResult.append(PalindromeFormatterConfig.successSeparator);
				lineResult.append(data.endNumber.toString());
			}
			else {

				lineResult.append(String.format("%05d", data.iniNumber));
				lineResult.append(PalindromeFormatterConfig.notFoundSeparator);
				lineResult.append(PalindromeFormatterConfig.notFoundResult);
			}
			System.out.println(lineResult.toString());
		}
	}
}
