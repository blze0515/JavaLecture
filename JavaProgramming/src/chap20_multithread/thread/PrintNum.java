package chap20_multithread.thread;

public class PrintNum {
	public void printNum(int num) {
		//Thread t1, t2
		//t1 1 ~ num 까지 출력
		//t2 num + 1~num*2 까지 출력
		//t1, t2 대기큐에 등록
		//join()메소드로 t2가 먼저 실행되도록
		
		Thread main = Thread.currentThread();
		System.out.println(main.getName());
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= num; i++) {
					System.out.println(i);
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = num + 1; i <= num * 2; i++) {
					System.out.println(i);
				}
			}
		};
		
		
		t2.start();
		
		try {
			t2.join();
			t1.start();
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		
		
		
		
		
		
		
	}
}
