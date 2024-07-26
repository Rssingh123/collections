package collect;

import java.util.LinkedList;

public class demoll {

	public static void main(String[] args) {
		LinkedList  ll= new LinkedList();
	//	ll.add(10);
	//	ll.add(20);
	//	ll.add(30);
	
		System.out.println(ll);
	//	System.out.println(ll.getFirst());
		System.out.println(ll.peekFirst());
		System.out.println(ll);



	}

}


/*
Output
[10, 20.5, 30, 40, Java]

[50, 40, 10, 20, 30, 60, 70]
50 // first element 
70 // last element

[50, 40, 10, 20, 30, 60, 70]
50
70
50
[50, 40, 10, 20, 30, 60, 70]
50
[40, 10, 20, 30, 60, 70]
70
[40, 10, 20, 30, 60, 70]
70
[40, 10, 20, 30, 60]



 */



