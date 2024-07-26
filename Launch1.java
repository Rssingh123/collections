package collect;

import java.util.ArrayList;

public class Launch1 {

	public static void main(String[] args)
	{
		ArrayList al= new ArrayList();
	//	System.out.println(al.size()); //0
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		ArrayList b = (ArrayList)al.clone();
		System.out.println(b);
	

	}

}

/*
 0
[10, 20, 30, 40, 50]
5
[10, 20, 30, 40, 50]

[10, 20, 30, 40, 50]
true
false
[10, 20, 30, 40, 50]
true
class java.util.ArrayList

clone
[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50]


 */



