package main.java.br.com.ramires.palindrome.entity;

import java.io.Serializable;
import java.math.BigInteger;

public class PalindromeEntity implements Serializable {

	private static final long serialVersionUID = -159055958972324745L;

	public long iniNumber;
	public BigInteger endNumber;
	public int countOfInterations;
	public boolean isHavePalindrome;

	public PalindromeEntity(long iniNumber) {
		this.iniNumber = iniNumber;
		this.endNumber = BigInteger.valueOf(iniNumber);
		this.countOfInterations = -1;
		this.isHavePalindrome = false;
	}

	public long getIniNumber() {
		return iniNumber;
	}
	public void setIniNumber(long iniNumber) {
		this.iniNumber = iniNumber;
	}
	public BigInteger getEndNumber() {
		return endNumber;
	}
	public void setEndNumber(BigInteger endNumber) {
		this.endNumber = endNumber;
	}
	public int getCountOfInterations() {
		return countOfInterations;
	}
	public void setCountOfInterations(int countOfInterations) {
		this.countOfInterations = countOfInterations;
	}
	public boolean isHavePalindrome() {
		return isHavePalindrome;
	}
	public void setHavePalindrome(boolean isHavePalindrome) {
		this.isHavePalindrome = isHavePalindrome;
	}
}
