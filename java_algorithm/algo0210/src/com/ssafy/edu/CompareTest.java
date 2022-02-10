package com.ssafy.edu;

import java.util.ArrayList;
import java.util.HashSet;

public class CompareTest {		// 아우터에는 static class없다.

	public static class Point{		// 메모리의 static 영역은 곧 heap영역이다.
		int x;						// 같은 pkg에서 쓸수 있다.
		int y;
		
		// 생성자 - source - Generate Constructor using Field
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
		
	public class PointComp implements Comparator<Point>{

		@Override
		public int compare(Point p1, Point p2)) {
			double l1 = Math.sqrt(p1.x*p1.x+p1.y*p1.x);
			double l2 = Math.sqrt(p2.x*p2.x+p2.y*p2.x);
			int re = Double.compare(l1, l2);
			if(re==0) {
				int x1 = Math.abs(p1.x);
				int x2 = Math.abs(p2.x);
				int rx = Integer.compare(x1, x2);
				if(ry==0) {
					return 0;
				}else return ry;
			}else return rx;
		}else return re;
	}

	
	public static void main(String[] args) {
		
		ArrayList<Point> s =new ArrayList<>();
		points.add(new Point(1,2));
		points.add(new Point(3,4));
		points.add(new Point(2,1));
		points.add(new Point(4,3));
		points.add(new Point(1,5));

		for(Point p:points) {
			System.out.println(p.x+" "+p.y);
		}
		
		System.out.println("---------------------------");
		
		points.sort(new PointCompare);
		for(Point p:points) {
			System.out.println(p.x+" "+p.y);
		}
	}

}
