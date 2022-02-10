package com.ssafy.ws07.step3;

public class BookTest {

	public static void main(String[] args) {
		// 싱글톤 디자인 패턴
		IBookManager manager=BookManagerImpl.getInstance();
		// 자기자신은 생성 못하기 때문에, 부모를 생성
		manager.add(new Book("21424", "java Pro", "김하나", "jaen.kr", 15000, "Java 기본문법",20));
		manager.add(new Book("21425", "java Pro2", "김하나", "jaen.kr", 25000, "Java 응용",20));
		manager.add(new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링",15));
		manager.add(new Magazine("45678", "월간 알고리즘", "홍길동", "jaen.kr", 10000, "1월 알고리즘",2021,1,3));
		System.out.println("*********도서 전체 목록***********");
		print(manager.getList());
		System.out.println("*********일반 도서 목록***********");
		print(manager.getBooks());
		System.out.println("*********잡지 목록***********");
		print(manager.getMagazines());
		System.out.println("*********도서 제목 포함 목록***********");
		print(manager.searchByTitle("java"));
		System.out.println("도서 가격 총합: "+manager.getTotalPrice());
		System.out.println("도서 가격 평균: "+manager.getPriceAvg());
		
		try {
			manager.buy("35355", 5);
			manager.sell("35355",50);
		} catch (ISBNNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("**************도서 목록**************");
		print(manager.getList());
	}
	public static void print(Book[] bs) {
		for (Book b: bs) {
			System.out.println(b);
		}
	}
}