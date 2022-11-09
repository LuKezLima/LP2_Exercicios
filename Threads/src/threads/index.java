package threads;

public class index implements Runnable {
	public void run() {

		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + i);
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		
		Thread thread = Thread.currentThread();
		System.out.println("thread atual -> " + thread.getName());
		System.out.println("está rodando: " + thread.isAlive());

	}

	public static void main(String[] args) throws Exception {
		Thread thread = new Thread(new index());
		thread.start();
		
		Thread thread2 = new Thread(new index());
		thread2.start();
        thread.join(10000);
		System.out.println("Thread atual: " + thread.getName());
		System.out.println("Thread atual " + thread2.getName());
		System.out.println("rodando: " + thread.isAlive());
		System.out.println("rodando: " + thread2.isAlive());
	}
}