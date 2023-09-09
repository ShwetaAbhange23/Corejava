package thread;
class ThreadP extends Thread{
	public void run() {
		System.out.println("Thread1 running");
	}
}
public class ThreadPriorityEx {

	public static void main(String[] args) {
		ThreadP tp = new ThreadP();
		System.out.println("Thread name:"+tp.getName());
		System.out.println("Thread Priority:"+tp.getPriority());
		ThreadP tp1 = new ThreadP();
		tp1.setPriority(9);
		System.out.println("Thread name:"+tp1.getName());
		System.out.println("Thread Priority1:"+tp1.getPriority());
		ThreadP tp2 = new ThreadP();
		tp2.setPriority(Thread.NORM_PRIORITY);
		System.out.println("Priority Thread:"+tp2.getName());
	
	}

}
