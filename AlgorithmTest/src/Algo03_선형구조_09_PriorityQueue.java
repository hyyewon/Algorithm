
import java.util.PriorityQueue;

public class Algo03_선형구조_09_PriorityQueue {

	
	public static void main(String[] args) {

		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(5);
		q.add(98);
		q.add(35);
		q.add(54);
		q.add(55);
		q.add(17);
		
		System.out.println(q); //[5, 54, 17, 98, 55, 35] 랜덤하게 저장됨. 따라서 정렬된 값은 확인 불가
		
		//삭제될 때 정렬되어 삭제됨
		for(int i=0;i<5;i++) {
			System.out.println(q.poll());
		}

		
	}//end main

}//end class
