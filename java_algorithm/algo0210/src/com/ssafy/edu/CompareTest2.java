package com.ssafy.edu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CompareTest2 {

	public static class Point implements Comparable<Point>{
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(Point p2) {
			// 원점으로 부터 거리
						double l1=Math.sqrt(x*x+y*y);
						double l2=Math.sqrt(p2.x*p2.x+p2.y*p2.y);
						int re=Double.compare(l1, l2);
						if(re==0) {
							int x1=Math.abs(x);
							int x2=Math.abs(p2.x);
							int rx=Integer.compare(x1, x2);//0,1,-1
							if(rx==0) {
								int y1=Math.abs(y);
								int y2=Math.abs(p2.y);
								int ry=Integer.compare(y1, y2);
								if(ry==0) {
									return 0;
								}else return ry;
							}else return rx;
						}else return re;
		}
	}
	
	public static void main(String[] args) {
		
		PriorityQueue<Point> points=new PriorityQueue<>();
		points.add(new Point(1,2));
		points.add(new Point(3,4));
		points.add(new Point(2,1));
		points.add(new Point(4,3));
		points.add(new Point(1,5));
		for(Point p: points) {
			System.out.println(p.x+" "+p.y);
		}
		System.out.println("------------------------");
		
		while(!points.isEmpty()) {
			Point p=points.poll();
			System.out.println(p.x+" "+p.y);
		}
	}

}