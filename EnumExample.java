package enumerated;


enum Mobile
{
	APPLE,SAMSUNG,HTC
	
	
	
	int price;
	
	Mobile()
	{
		this.price=8000;
	}
	
	Mobile(int realprice)
	{
		this.price=realprice;
		
		
		
	}
	
	
	
	
}







public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Mobile.HTC);
		
		
		
		Mobile[] allmobiles =Mobile.values();
		
		System.out.println(Mobile.values());
		
		
	}

}
