package com.ssafy.ws04;

public class TrumpCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] suits= {"♠","◆","♥","♣"};
		String [] value = {"A","2","3","4","5","6","7",
   			               "8","9","T","J","Q","K"};
		
		for(int i=0; i<suits.length; i++) {
			for(int j=0; j<value.length; j++) {
				System.out.printf("%s%s",suits[i],value[j]);
				if(j>=0 && j<value.length-1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}	
	}

}
