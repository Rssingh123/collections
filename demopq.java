package collect;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class demopq {

	public static void main(String[] args)
	{
       PriorityQueue pq = new PriorityQueue();
		
       pq.add(120);
       pq.add(60);
       pq.add(160);
       pq.add(30);
	   pq.add(80);
	   pq.add(140);
	   pq.add(180);

		
		System.out.println(pq);

	}

}

/*
PriorityQueue
[30, 60, 140, 120, 80, 160, 180]
 */



