class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;
	RunnableDemo(String name){
		threadName = name;
		System.out.println("creating"+threadName);
	}
	public void run() {
		System.out.println("Running"+threadName);
		try {
			int n = 10; 
        for (int i = 0; i < n; i++) {
				System.out.println("Thread:--"+threadName  +  Thread.currentThread().getId()+"is present");
				Thread.sleep(100);
			}
		} catch(InterruptedException e){
			System.out.println("Thread"+threadName+"interrupted");
		}
		System.out.println("Thread"+threadName+"Exiting");
	}
	public void start() {
		System.out.println("Starting"+threadName);
		if(t==null) {
			t = new Thread(this,threadName);
			t.start();
		}
	}
}
class MultithreadI{

	public static void main(String[] args) {
	RunnableDemo R1 = new RunnableDemo("Teacher");
	R1.start();
	RunnableDemo R2 = new RunnableDemo("Student");
	R2.start();
	
}
}
