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
import java.util.Stack;
import java.util.TreeMap;

public class Algo03_선형구조_07_Stack2_API이용 {

	
	public static void main(String[] args) {

		//API
		Stack<Integer> x = new Stack<>();
		x.push(5);
		x.push(4);
		x.push(3);
		x.push(2);
		x.push(1);
		
		System.out.println(x); //[5, 4, 3, 2, 1]
		//값을 제거하고 제거된 값을 반환
		int n = x.pop(); 
		System.out.println(n+" "+x); //1 [5, 4, 3, 2]
		
		//Looks at the object at the top of this stack
		System.out.println("top값(스택에서 최상위 값)" + x.peek());
		
		
	}//end main

}//end class
