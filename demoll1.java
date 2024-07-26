package collect;

import java.util.LinkedList;

public class demoll1 {

	public static void main(String[] args)
	{
		LinkedList  ll= new LinkedList();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		
	}

}

/*
Output
[40, 30, 20, 10]
40
[30, 20, 10]
30
[20, 10]
20
[10]
10
[]

 */


