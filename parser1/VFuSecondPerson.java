package parser1;

public class VFuSecondPerson extends VFuture{
	char s[]=str.toCharArray();
	int l=s.length;
	void start()
	{
		vFuSecondp();
	}
	
	void vFuSecondp()
	{
		/*if(flag==0)vFuSeSing();
		if(flag==0)vFuSeDual();
		if(flag==0)vFuSePlu();*/
		vFuSeSing();
		vFuSeDual();
		vFuSePlu();
	}
	void vFuSeSing(){
		//apathat अपठत्
		if(s.length>6 && s[l-6]==2367 && s[l-5]==2359 && s[l-4]==2381 && s[l-3]==2351 && s[l-2]==2360 && s[l-1]==2367)
			pos(321);
	}
	void vFuSeDual(){
		if(s.length>6 && s[l-6]==2367 && s[l-5]==2359 && s[l-4]==2381 && s[l-3]==2351 && s[l-2]==2341 && s[l-1]==2307)
			pos(322);
	}
	void vFuSePlu(){
		if(s.length>6 && s[l-5]==2367 && s[l-4]==2359 && s[l-3]==2381 && s[l-2]==2351 && s[l-1]==2341)
			pos(323);
	}

}
