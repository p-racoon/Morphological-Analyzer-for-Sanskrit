package parser1;

public class Verb {
	public static String str;// the Verb only
	public static int x;// <Tense> <Person> <Plural>
	//public int flag;
	/*Verb(String str)
	{
		this.str=str;अपठत्
	}*/
	public int start(String str1)
	{
		str=str1;
		//System.out.println(this.str);
		//System.out.println(str);
		//flag=0;
		x=0;
		/*if(flag==0)new VPast().start();
		if(flag==0)new VPresent().start();
		if(flag==0)new VFuture().start();*/
		new VPast().start();
		new VPresent().start();
		new VFuture().start();
		/*
		 * System.out.println(pa);
		 * System.out.println(pr);
		 * System.out.println(fu);
		 */
		return x;
	}
	public void pos(int y)
	{
		if(y>x)
			{x=y;/*flag=1*/;System.out.println("pos"+y+" mein se"+x);}
	}
	/*
	 * Remove this psvm after its done
	 */
	public static void main(String args[])
	{
		/*long startTime = System.nanoTime();
		//code
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");*/
		long startTime = System.nanoTime();
		Verb ob=new Verb();
		System.out.println(ob.start("पठिष्यामः"));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
	}
}
