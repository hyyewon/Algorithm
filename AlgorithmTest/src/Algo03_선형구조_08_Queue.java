import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;
/*
 * Queue
 * -FIFO (First In First Out)
 * 
 * -enqueue
 * -dequeue
 * 
 * 삽입 (enqueue)								삭제(dequeue)
 * ------------>				------------>
 * 				rear(tail)					front(head)
 * 
 * 삽입(저장) 관련 메서드
 * 가. add(값) : 저장시 문제가 발생되면 예외가 발생됨.
 * 	 offer(값) : 저장시 문제가 발생되면 false 리턴.
 * 
 * 삭제 관련 메서드
 * 나. remove() : 삭제시 값이 없으면 예외 발생.
 * 	   poll() : 삭제시 값이 없으면 null 리턴.
 * 
 * -peek() : Stack과는 달리 가장 앞에 있는 front 값을 반환 / 어떤 값이 삭제될 것인지 알 수 있음.
 * 
 * 
 */
public class Algo03_선형구조_08_Queue {

	
	public static void main(String[] args) {

		Queue<String> q = new LinkedList<>();
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("D");
		q.offer("E");
		System.out.println(q); //[A, B, C, D, E]
		System.out.println("peek:"+q.peek()); //가장 처음에 위치한 값(front값)
		
		String str = q.remove();
		System.out.println(str+" "+q); //A [B, C, D, E]
		
		str = q.poll();
		System.out.println(str+" "+q); //B [C, D, E]
		
		
		
	}//end main

}//end class
