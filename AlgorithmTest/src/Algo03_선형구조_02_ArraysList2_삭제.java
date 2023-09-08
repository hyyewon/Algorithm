import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algo03_선형구조_02_ArraysList2_삭제 {

	
	public static void main(String[] args) {

		//ArrayList 삭제
		List<String> x = new ArrayList<String>(); //다형성
		x.add("C");
		x.add("C++");
		x.add("Java");
		x.add("Kotlin");
		x.add("Python");
		x.add("SQL");
		
		String str = x.remove(5); //idx 이용한 삭제
		System.out.println(str); //SQL
		
		boolean b = x.remove("Kotlin"); //value 이용한 삭제
		System.out.println(b); //true
		
		boolean bb = x.removeIf(s->s.startsWith("C")); //C로 시작하는 값 삭제
		System.out.println(bb); //true
		System.out.println(x); //[Java, Python]
		
		//삭제할 값을 List에 저장하고 이 List값을 이용해서 삭제
		List<String> x2 = new ArrayList<String>(); //다형성
		x2.add("Java");
		
		x.removeAll(x2);
		System.out.println(x); //[Python]

		
		
	}//end main

}//end class
