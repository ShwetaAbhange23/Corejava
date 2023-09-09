package thread;
class ThreadOne extends Thread{
	public void run() {
		System.out.println("Thread1");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}
class ThreadTwo extends Thread{
	public void run() {
		System.out.println("Thread2");
		for(int i=10;i<=15;i++) {
			System.out.println(i);
		}
	}
}

public class ThreadUsingInheritance {

	public static void main(String[] args) {
	 ThreadOne t = new ThreadOne();
	 t.start();
	 ThreadTwo t1 = new ThreadTwo();
	 t1.start();
	}

}
