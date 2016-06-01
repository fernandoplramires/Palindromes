package main.java.br.com.ramires.palindrome.domain;

import java.util.LinkedList;
import java.util.List;

public interface PalindromeGateway {

	public void addData(Object data);
	public List<Object> getDataList();
	public void setDataList(LinkedList<Object> newDataList);
}
