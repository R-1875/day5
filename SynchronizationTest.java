package streamline;

class Callme
{
	 //void call(String msg) throws InterruptedException 
	synchronized void call(String msg) throws InterruptedException 
	{
		System.out.print("["+msg);
		
		
		Thread.currentThread().sleep(2000);
		
		System.out.println("] ");
		
		
	}
}

class Caller implements Runnable
{
	
	Thread tref;
	
	String realmsg;
	
	Callme target;
	
	Caller(Callme trg,String data)
	{
		this.target=trg;
		this.realmsg=data;
		this.tref=new Thread(this);
		
		tref.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			target.call(realmsg);
		} catch (Exception e){}
		
		
	}
	
	
}

public class SynchronizationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Callme target=new Callme();
		Caller obj1=new Caller(target,"hello");
		Caller obj2=new Caller(target,"synchronised");
		Caller obj3=new Caller(target,"world");
	}

}
