package p1;

import java.util.Date;




interface I
{
	 void today(String msg);
}




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		I ref=(msg)->
		{
			
			//Date d=new Date();
			
			//System.out.println("hello  " +new Date().toString());
			
Date d=new Date();
			
			System.out.println("today is  " +d.toString() +" "+ msg);
			
		};
		
		
	ref.today("hi");
		
		
	}

}
