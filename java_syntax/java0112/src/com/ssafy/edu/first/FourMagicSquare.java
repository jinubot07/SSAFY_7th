package com.ssafy.edu.first;

public class FourMagicSquare {
    //은닉화 -en capsul ation  
	private int[][] magic;  //선언   기본int,double,boolean,   참조 [], String,Object
	//private int[] m= {1,2,3};  //정적배열 
	private int len; //'\u0000'
	
	public FourMagicSquare( int len) {
		this.magic = new int[len][len]; //{0,0,0}
		this.len = len;
	}
	// 오버로딩
	public FourMagicSquare() {
		this(4);
	}

	public void make() {
		makeA();
		makeR();
	}
	
	//색칠한 곳 바꾸기
	private void makeR() {
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				//색칠 안한 부분은
				//magic[i][j] = 16-(i*n+j)
			}
		}
		
	}
	
	//1~16설정
	private void makeA() {
		//1<--2>
		//m[i/col][i%col] = n[i] : 1차원 배열을 2차원 배열로 바꾸는 방법 - [아나칼][아모칼]
		//n[i*col+j] = m[i][j]   : 2차원 배열을 1차원 배열로 바꾸는 방법 - [아칼제이]
		/*for (int i=1; i<n*n; i++) {
			magic[i/n][i%n] = i+1;
		} */
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				
			}		
		}
	}
	
	public void print() {
		for (int i=0;i<len;i++) {
			for (int j=0;j<len;j++) {
				System.out.printf("%d\t",magic[i][j]);
			}
			System.out.println();
		}
	}
}