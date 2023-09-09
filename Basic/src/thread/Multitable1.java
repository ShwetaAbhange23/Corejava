package thread;
class MultiTablenew {
	 synchronized void displayMulti(int n) throws InterruptedException  {
		for (int i=1;i<=10;i++) {
			System.out.println(n +"*"+ i+ "=" + n*i);
		Thread.sleep(1000);
		}
	}
	 synchronized void displayPower(int n) throws InterruptedException  {
		     int temp=1;
			for (int i=1;i<=10;i++) {			
				System.out.println(n +"^"+ i+ "=" + temp*n);
				temp=temp*n;
			Thread.sleep(1000);
			}
		}
}
 
class Multi11 extends Thread {
	MultiTablenew m1;

	public Multi11(MultiTablenew m) {
		super();
		this.m1 = m;
	}
	public void run() {
		try {
			m1.displayMulti(5);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}
class Multi22 extends Thread {
	MultiTablenew m1;

	public Multi22(MultiTablenew m) {
		super();
		this.m1 = m;
	}
	public void run() {
		try {
			m1.displayPower(2);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}
public class Multitable1 {

	public static void main(String[] args) {
		MultiTablenew m=new MultiTablenew();
		Multi11 mm=new Multi11(m);
		mm.start();

		Multi22 mm2=new Multi22(m);
		mm2.start();
	}

}
