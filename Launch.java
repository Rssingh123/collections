package collect;

import java.util.ArrayList;

public class Launch {

	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
	//	al.add(2, 99);
		al.set(2, 99);
		System.out.println(al);

	}

}

/*
 #Output
 add
[10, 20, 30, 40, 50]
[10, 20, 99, 30, 40, 50]

set
[10, 20, 30, 40, 50]
[10, 20, 99, 40, 50]

 
 
 */



