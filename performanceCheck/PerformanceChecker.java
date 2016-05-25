package performanceCheck;
import java.io.*;

import parser1.Verb;
import parser2.*;

public class PerformanceChecker {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		PerformanceChecker obj=new PerformanceChecker();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(obj.startPerformanceChecker(br.readLine()));
	}
	public String startPerformanceChecker(String str)
	{
		String finalOutput="";

		long startTime = System.nanoTime();
		VerbDFA ob2=new VerbDFA();
		//finalOutput+="\n "+ob2.start(str)+ "\n";
		ob2.start(str);
		long endTime = System.nanoTime(); 
		finalOutput+="DFA Took "+(endTime - startTime) + " ns \n";
		
		startTime = System.nanoTime();
		Verb ob1=new Verb();
		//System.out.println(ob.start(str));
		//finalOutput+=" "+ob1.start(str)+ "\n";
		ob1.start(str);
		endTime = System.nanoTime(); 
		finalOutput+="Recursive Descent parser Took "+(endTime - startTime) + " ns";
		
		return finalOutput;
	}

}
