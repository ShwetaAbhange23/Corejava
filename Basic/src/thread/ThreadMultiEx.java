package thread;

class Multiplication implements Runnable {

	@Override
	public void run() {
		int num = 2;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + num + i);
		}
	}

}

class Fibonacci implements Runnable {

	@Override
	public void run() {
		int num = 12;
		int a = 0, b = 1, c = 0;
		for (int i = 1; i <= num; i++) {

			c = a + b;
			System.out.print(c);
			a = b;
			b = c;
		}

	}

}

class EvenOdd extends Thread {
	public void run() {
		int num = 4;
		if (num % 2 == 0) {
			System.out.println("Num is even:" + num);
		} else {
			System.out.println("num is odd:" + num);
		}
	}
}

public class ThreadMultiEx {

	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		Thread t = new Thread();
		t.start();
		Fibonacci f = new Fibonacci();
		Thread t1 = new Thread();
		t1.start();
		EvenOdd e = new EvenOdd();
		Thread t2 = new Thread();
		t2.start();
	}
}
