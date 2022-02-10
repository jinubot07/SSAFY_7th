package com.ssafy.edu.first;

import java.util.Scanner;

public class OddMagicSquare {
    //은닉화 -en capsul ation  
	private int[][] magic;  //선언   기본int,double,boolean,   참조 [], String,Object
	//private int[] m= {1,2,3};  //정적배열 
	private int len; //'\u0000'
	
	public OddMagicSquare( int len) {
		this.magic = new int[len][len]; //{0,0,0}
		this.len = len;
	}
	// 오버로딩
	public OddMagicSquare() {
		this(3);
	}

	public void make() {
		int x = 0;
		int y = len/2;
		magic[x][y] = 1;
		for (int i=2; i <= len*len; i++) {
			int tempX=x;
			int tempY=y;
			if(x-1<0) {
				x = len-1;
			}else {
				x--;
			}
			
			if(y-1<0) {
				y=len-1;
			}else {
				y--;
			}
			
			if(magic[x][y]!=0) {
				x=tempX+1;
				y=tempY;
			}
			magic[x][y]=i;
		}
	}

	public void print() {
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.printf("%d\t",magic[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("홀수를 입력하세요");
		Scanner scann=new Scanner(System.in);
		int len=scann.nextInt();
		OddMagicSquare odd=new OddMagicSquare(len);
		//OddMagicSquare odd2=new OddMagicSquare(5);
		//System.out.println(odd);
		//System.out.println(odd.hashCode());
		//System.out.println(odd.getClass());
		//System.out.println(odd.equals(odd2));
		odd.print();
	}

}

