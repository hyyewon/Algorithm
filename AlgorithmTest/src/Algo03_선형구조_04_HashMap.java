import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Algo03_선형구조_04_HashMap {

	
	public static void main(String[] args) {


		//HashMap생성
		Map<String, String> m = new HashMap<String, String>();
		m.put("A", "AAA");
		m.put("B", "BBB");
		m.put("C", "CCC");
		
		//iterate
		//1.m.forEach(Consumer)
		m.forEach((key,value)->System.out.println(key+"="+value)); //m으로 받았기 때문에 key와 value 둘다 넘어옴
		System.out.println();
		
		//2.key값.forEach(Consumer)
		m.keySet().forEach(key->System.out.println(key+"="+m.get(key))); //key만 넘어옴
		
		
		
	}//end main

}//end class
