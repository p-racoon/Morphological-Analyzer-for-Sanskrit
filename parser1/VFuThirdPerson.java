package parser1;

public class VFuThirdPerson extends VFuture{
	char s[]=str.toCharArray();
	int l=s.length;
	void start()
	{
		vFuThrstp();
	}
	
	void vFuThrstp()
	{
		/*if(flag==0)vFuThSing();
		if(flag==0)vFuThDual();
		if(flag==0)vFuThPlu();*/
		vFuThSing();
		vFuThDual();
		vFuThPlu();
	}
	void vFuThSing(){
		// अपठत्
		if(s.length>6 && s[l-6]==2367 && s[l-5]==2359 && s[l-4]==2381 && s[l-3]==2351 && s[l-2]==2366 && s[l-2]==2350 && s[l-1]==2367)
			pos(331);
	}
	void vFuThDual(){
		if(s.length>7 && s[l-7]==2367 && s[l-6]==2359 && s[l-5]==2381 && s[l-4]==2351 && s[l-3]==2366 && s[l-2]==2357 && s[l-1]==2307)
			pos(332);
	}
	void vFuThPlu(){
		if(s.length>7 && s[l-7]==2367 && s[l-6]==2359 && s[l-5]==2381 && s[l-4]==2351 && s[l-3]==2366 && s[l-2]==2350 && s[l-1]==2307)
			pos(333);
	}
}

