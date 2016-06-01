package main.java.br.com.ramires.palindrome.domain;

import java.util.LinkedList;
import java.util.List;

import main.java.br.com.ramires.palindrome.entity.PalindromeEntity;

public class PalindromeGatewayImpl implements PalindromeGateway {

	private LinkedList<Object> dataList;
	public PalindromeGatewayImpl() {
		this.dataList = new LinkedList<Object>();
	}
	public void addData(Object data) {
		PalindromeEntity palindromeEntity = new PalindromeEntity((long)data);
		this.dataList.add(palindromeEntity);
	}
	public List<Object> getDataList() {
		return( this.dataList );
	}
	public void setDataList(LinkedList<Object> newDataList) {
		this.dataList = newDataList;
	}
}
