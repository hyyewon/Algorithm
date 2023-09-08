import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algo03_선형구조_02_ArraysList {

	
	public static void main(String[] args) {

		//ArrayList 생성
		List<Integer> x = new ArrayList<Integer>(); //다형성
		x.add(3);
		x.add(13);
		x.add(23);
		
		System.out.println(x);
	
		List<Integer> x2 = new ArrayList<Integer>(); //다형성
		x2.add(7);
		x2.add(15);
		x2.add(8);
		
		//ArrayList에 ArrayList저장 (x에 x2저장)
		x.addAll(x2);
		System.out.println(x);
		
		
		
	}//end main

}//end class
