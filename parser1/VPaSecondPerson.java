package parser1;

public class VPaSecondPerson extends VPast{
	char s[]=str.toCharArray();
	int l=s.length;
	void start()
	{
		 vPaSecondp();
	}
	void vPaSecondp()
	{
		/*if(flag==0)vPaSeSing();
		if(flag==0)vPaSeDual();
		if(flag==0)vPaSePlu();*/
		vPaSeSing();
		vPaSeDual();
		vPaSePlu();
	}
	void vPaSeSing(){
		if(s.length>3 && s[0]==2309 && s[l-2]==2336 && s[l-1]==2307)
			 pos(121);
	}
	void vPaSeDual(){//अपठत्
		if(s.length>4 && s[0]==2309 && (s[l-3]==2340 && s[l-2]==2350 && s[l-1]==2381)||(s[l-2]==2340 && s[l-1]==2350))
			pos(122);
		 
	}
	void vPaSePlu(){
		if(s.length>2 && s[0]==2309 && s[l-1]==2340)
			pos(123);
		 
	}
}
