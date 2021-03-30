package collectiontest;

import java.util.HashSet;

public class Teacher {
	
	int id;
	String sub;
	String name;
	
	

	public Teacher(int id, String sub, String name) {
		super();
		this.id = id;
		this.sub = sub;
		this.name = name;
	}



	public static void main(String[] args) {
		
		HashSet<Teacher> hs = new HashSet<Teacher> ();
		hs.add(new Teacher(11,"m1","kumar"));
		hs.add(new Teacher(12,"electronics1","ram"));
		hs.add(new Teacher(13,"m3","ajith"));
		hs.add(new Teacher(14,"vlsi","vijay"));
		hs.add(new Teacher(15,"DE","surya"));
		hs.add(new Teacher(16,"circuit","vignesh"));
		hs.add(new Teacher(17,"ss","subash"));
         
		for(Teacher s : hs)
		
		{
			System.out.println(s.id+ " "+ s.sub+" "+s.name);
		}
		
		
		// TODO Auto-generated method stub

	}

}
