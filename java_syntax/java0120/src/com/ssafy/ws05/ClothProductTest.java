package com.ssafy.ws05;

public class ClothProductTest {
	
	public static void main(String[] args) {
		// 4. 배열 단원에 + 객체 배열 개념 -> 생성된 것X
		ClothProduct[] clothes=new ClothProduct[5];
		clothes[0] = new ClothProduct(2022012001,"루이비통","아주 싼 손수건",2000000,20);
		clothes[1] = new ClothProduct(2022012002,"루이비통","조금 비싼 핸드백",10000000,10);
		
		for(ClothProduct cp : clothes) {
			System.out.println(cp);
		}
	}
}
