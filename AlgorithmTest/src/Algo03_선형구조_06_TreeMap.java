import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Algo03_선형구조_06_TreeMap {

	
	public static void main(String[] args) {


		//TreeMap생성 (key기준으로 오름차순 정렬됨) 
//		TreeMap<String, String> m = new TreeMap<>(); //대소문자 구별된 오름차순 정렬 {A=AAA, B=BBB, E=EEE, ab=ab, c++=c++c++, d=ddd}
//		TreeMap<String, String> m = new TreeMap<>(Comparator.reverseOrder()); //대소문자 구별된 내림차순 정렬 {d=ddd, c++=c++c++, ab=ab, E=EEE, B=BBB, A=AAA}
//		SortedMap<String, String> m = new TreeMap<>(Comparator.reverseOrder()); //SortedMap를 상속받아 자동정렬이 가능한 것
		SortedMap<String, String> m = new TreeMap<>(String.CASE_INSENSITIVE_ORDER); //대소문자 구별하지 않은 오름차순 정렬 {A=AAA, ab=ab, B=BBB, c++=c++c++, d=ddd, E=EEE}
		m.put("A", "AAA");
		m.put("ab", "ab");
		m.put("B", "BBB");
		m.put("c++", "c++c++");
		m.put("d", "ddd");
		m.put("E", "EEE");
		
		//A:65 a:97
		System.out.println(m);
		
		
		
	}//end main

}//end class
