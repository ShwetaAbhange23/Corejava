package thread;
class Thread1 implements Runnable{
	public void run() {
		int num=20;
		System.out.println("Thread1");
		for(int i=2;i<=num;i++) {
			System.out.println(i);
		}
	}
}
public class TreadUsingInterface {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread t = new Thread(t1);
		t.start();
		Thread1 t2 = new Thread1();
		Thread t3 = new Thread(t2);
		t3.start();
	}

}
