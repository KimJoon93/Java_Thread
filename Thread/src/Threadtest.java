
public class Threadtest extends Thread{
	
	private int index = -1;

	public Threadtest(int index) {
		this.index = index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start main method");
		
		for (int i = 0; i < 5; i++) {
			Threadtest threadtest = new Threadtest(i);
			threadtest.start();	//start method 실행하면 run method 실행
		}
		
		System.out.println("End main method");
		
	}

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
	System.out.println("Start가 먼저!");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Run이 먼저!");
	}
	
	
	

}
