package collect;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args)
	{
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);
		
		
		ArrayList b= new ArrayList();
		b.add(20);
		b.add(40);
		System.out.println(b);
		
		
		al.retainAll(b);
		System.out.println(al);

		
		
	}

}

/*
 # Output
[10, 20, 30, Raju, true, 99.9]
[10, 20, 99, 30, Raju, true, 99.9]

[10, 20, 30, Raju, true, 99.9]
[10, 20, 99, 30, Raju, true, 99.9]
[100, 200, 300, 400]
[10, 20, 99, 30, Raju, true, 99.9, 100, 200, 300, 400]

[10, 20, 30, Raju, true, 99.9]
[10, 20, 99, 30, Raju, true, 99.9]
[100, 200, 300, 400]
[10, 20, 99, 30, Raju, true, 99.9, 100, 200, 300, 400]
[10, 20, 100, 200, 300, 400, 99, 30, Raju, true, 99.9, 100, 200, 300, 400]

[10, 20, 30, 40, 50]
[10, 20, 40, 50]
[10, 20, 40]
[20, 40]
[10]
[]


 */
