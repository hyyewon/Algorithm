import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algo03_선형구조_01_배열2_Arrays {

	
	public static void main(String[] args) {

		//Arrays 클래스
		//1. 리스트 생성
		List<String> list = Arrays.asList("A","B"); //Arrays 클래스를 이용하여 리스트 생성
		
		//2. 임의의 값으로 채우기
		String [] name = {"A","B","C"};
		Arrays.fill(name, "X");
		System.out.println("2.임의의 값으로 채우기: "+Arrays.toString(name)); //[X, X, X]

		Arrays.fill(name,0,2, "A");
		System.out.println("2.일부분 임의의 값으로 채우기: "+Arrays.toString(name)); //[A, A, X]
		
		//3. 배열값 비교
		int [] n = {1,2,3};
		int [] n2 = {1,2,3};
		System.out.println("3. 배열값 비교: "+Arrays.equals(n, n2)); // true
		
		//4. 정렬
//		int [] n3 = {6,2,7,36,74}; //기본형
		Integer [] n3 = {6,2,7,74,36}; //Comparator.reverseOrder() 사용위해 참조형으로 변경
		Arrays.sort(n3); //기본은 오름차순
		Arrays.sort(n3,Comparator.reverseOrder()); //내림차순
		//Comparator.reverseOrder() 사용하기 위해서는 클래스타입이어야 된다.
		System.out.println("4. 정렬: "+Arrays.toString(n3));
		
		//5. 특정 값의 위치 검색
		int [] n4 = {6,2,7,74,36};
		int idx = Arrays.binarySearch(n4, 74);
		System.out.println("5. 특정 값의 위치 검색: "+idx); //3
		
		//6. 배열 크기 변경
		//배열은 크기 변경이 안되지만, Arrays를 이용하면 크기 변경 가능
		int [] n5 = {1,2,3};
		n5 = Arrays.copyOf(n5, 5);
		System.out.println("6. 배열 크기 변경: "+Arrays.toString(n5)); //[1, 2, 3, 0, 0]
		
		//7.배열에서 스트림 생성
		int [] n6 = {1,2,3};
		Arrays.stream(n6).forEach(System.out::println);
		
		
	}//end main

}//end class
