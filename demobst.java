package collect;

import java.util.TreeSet;

public class demobst {

	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add(120);
		ts.add(60);
		ts.add(160);
		ts.add(30);
		ts.add(80);
		ts.add(140);
		ts.add(180);
		
		System.out.println(ts);
		

		System.out.println(ts.ceiling(50));
		System.out.println(ts.floor(50));
		System.out.println(ts.higher(50));
		System.out.println(ts.lower(50));
		System.out.println(ts.ceiling(80));
		System.out.println(ts.higher(80));
		System.out.println(ts.floor(80));
		System.out.println(ts.lower(80));

		

	}

}

/*
TreeSet
[30, 60, 80, 120, 140, 160, 180]
60
30
60
30
80
120
80
60


 */









