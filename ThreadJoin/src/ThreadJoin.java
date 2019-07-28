
public class ThreadJoin extends Thread{
		
	public ThreadJoin() {
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "시작");
		
		ThreadJoin threadJoin = new ThreadJoin();
		threadJoin.start();
		
		System.out.println(Thread.currentThread().getName() + "끝");		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Thread 1");
		Thread2();
	}
	
	public void Thread2(){
		System.out.println("Thread 2");		
		Thread3();
	}
	public void Thread3(){
		System.out.println("Thread 3");		
		
	}
	

}
