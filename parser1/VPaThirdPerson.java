package parser1;

public class VPaThirdPerson extends VPast{
	char s[]=str.toCharArray();
	int l=s.length;
	void start()
	{
		 vPaThirdp();
	}
	void vPaThirdp()
	{
		/*if(flag==0) vPaThSing();
		if(flag==0) vPaThDual();
		if(flag==0) vPaThPlu();*/
	}
	
	void vPaThSing()
	{
		//अपठत्
		if(s.length>2 && s[0]==2309 && (s[l-2]==2350 && s[l-1]==2381)||(s[l-1]==2350))
			pos(131);
	}
	void vPaThDual()
	{
		if(s.length>2 && s[0]==2309 && s[l-2]==2366 && s[l-1]==2357)
			pos(132);
	}
	void vPaThPlu()
	{
		if(s.length>2 && s[0]==2309 && s[l-2]==2366 && s[l-1]==2350)
			pos(133);
		 
	}
}
