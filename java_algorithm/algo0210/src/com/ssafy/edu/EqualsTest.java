package com.ssafy.edu;

import java.util.ArrayList;
import java.util.HashSet;








public class EqualsTest {		// 아우터에는 static class없다.

	public static class Point{		// 메모리의 static 영역은 곧 heap영역이다.
		int x;						// 같은 pkg에서 쓸수 있다.
		int y;
		
		// 생성자 - source - Generate Constructor using Field
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		// 생성자 - source - Generate hashcode() and equals()
		// 부모주소를 볼땐 다른데, 
		@Override		// equals 오버라이딩
		public int hashCode() {	// 찍히지 않는 , 주소를 한 곳으로 모아주는 트릭
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			Point other = (Point) obj;		// point일때마 캐스팅
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		HashSet<Point> hs = new HashSet<>();
		hs.add(new Point(1,2));
		hs.add(new Point(1,2));		// 19~26Line : Equals Override때문에 같기때문에 안들어감
		hs.add(new Point(1,2));		// 같기때문에 안들어감
		hs.add(new Point(2,3));
		
		System.out.println(hs.size());
		
		ArrayList<Point> s =new ArrayList<>();
		s.add(new Point(1,2));
		s.add(new Point(2,3));
		Point p3 = new Point(1,2);
		System.out.println(s.get(0).equals(p3));
		System.out.println(s.contains(p3));
		Point p4 = s.get(0);
		System.out.println(s.contains(p4));
	}

}
