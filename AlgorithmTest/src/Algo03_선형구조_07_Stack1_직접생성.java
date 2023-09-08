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

class MyStack{
	
	int top; //pointer - 스택의 최상단
	int size;
	int [] stack;
	
	public MyStack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	//저장 : top 증가하고, 값 저장
	public void push(int n) {
		++top;
		stack[top]=n; //top번째 배열에 n저장
		System.out.println(stack[top]+"push");
	}
	
	//삭제 : 값 제거 후 top 감소
	public void pop() {
		System.out.println(stack[top]+"pop");
		stack[top--]=0; //top위치에 0을 저장하고 top값 감소시킴
	}
	
	//현재 top에 있는 값 반환
	public int peek() {
		return stack[top];
	}
	
}//end class

public class Algo03_선형구조_07_Stack1_직접생성 {

	
	public static void main(String[] args) {

		MyStack x = new MyStack(5); //5이상 저장하면 조건체크해서 저장못하게 하도록 만들기
		x.push(5);
		x.push(4);
		x.push(3);
		x.push(3);
		x.push(1);
		
		System.out.println(Arrays.toString(x.stack));
		System.out.println(x.peek());
		
		for(int i=0;i<x.size;i++) {
			x.pop();
		}
		
		
	}//end main

}//end class
