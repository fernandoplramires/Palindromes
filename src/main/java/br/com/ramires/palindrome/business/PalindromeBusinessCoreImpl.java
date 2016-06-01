package main.java.br.com.ramires.palindrome.business;

import java.math.BigInteger;
import java.util.LinkedList;

import main.java.br.com.ramires.palindrome.domain.PalindromeGateway;
import main.java.br.com.ramires.palindrome.domain.PalindromeGatewayImpl;
import main.java.br.com.ramires.palindrome.entity.PalindromeEntity;

public class PalindromeBusinessCoreImpl implements PalindromeBusinessCore {

	static PalindromeBusinessCore instance = null;
	public static PalindromeBusinessCore getInstance() {
		if (instance == null) {
			instance = new PalindromeBusinessCoreImpl();
		}
		return( instance );
	}

	public Object generateResults(Object inputData) {
		PalindromeGateway inputDatas = (PalindromeGateway) inputData;
		LinkedList<Object> newDataList = new LinkedList<Object>();
		for(Object interator: inputDatas.getDataList()) {
			PalindromeEntity data = (PalindromeEntity) interator;
			newDataList.add(checkPalindrome(data));
		}
		PalindromeGateway outputData = new PalindromeGatewayImpl();
		outputData.setDataList(newDataList);
		return( outputData );
	}

	private PalindromeEntity checkPalindrome(PalindromeEntity data) {
		for (int counter = 0; counter < 100; counter++) {
			data.endNumber = data.endNumber.add(this.toPalindromeNumber(data.endNumber));
			if (this.isPalindrome(data.endNumber.toString()) == true){
				data.countOfInterations = counter + 1;
				data.isHavePalindrome = true;
				break;
			}
		}
		return( data );
	}
	private BigInteger toPalindromeNumber(BigInteger number) {
		return(new BigInteger(new String(new StringBuilder(number.toString()).reverse().toString())));
	}
	private boolean isPalindrome(String str) {
		return( str.equals(new StringBuilder(str).reverse().toString()) );
	}
}
