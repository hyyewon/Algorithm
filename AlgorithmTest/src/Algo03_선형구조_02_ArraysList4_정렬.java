import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
class Person{
	String username;
	int score;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String username, int score) {
		this.username = username;
		this.score = score;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", score=" + score + "]";
	}
	
	
	
}//end class
public class Algo03_선형구조_02_ArraysList4_정렬 {

	
	public static void main(String[] args) {

		/*
		 * 배열의 유틸리티 클래스 : Arrays클래스
		 * 컬렉션의 유틸리티 클래스 : Collections 클래스
		 */
		//가. 기본형 데이터 정렬
		List<Integer> x = new ArrayList<Integer>(); //다형성
		x.add(3);
		x.add(13);
		x.add(23);
		x.add(4);
		x.add(5);
		
		//정렬
		Collections.sort(x); //오름차순
		Collections.sort(x,Comparator.reverseOrder()); //내림차순
		System.out.println(x);
		

		//나.참조형 데이터 정렬
		List<Person> list = Arrays.asList(new Person("홍길동1",100),
				  new Person("홍길동2",80),
				  new Person("홍길동3",90),
				  new Person("홍길동4",85),
				  new Person("홍길동5",70));
		
		Collections.sort(list,Comparator.comparing(Person::getScore)); //오름차순
		Collections.sort(list,Comparator.comparing(Person::getScore,Comparator.reverseOrder())); //내림차순
		System.out.println(list);
		
	}//end main

}//end class
