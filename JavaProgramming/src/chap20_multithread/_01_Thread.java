package chap20_multithread;

public class _01_Thread {
	
	// 메인스레드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Thread 선언
		Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i = 1; i <= 5; i++) {
						System.out.println(i);
						
						try {
							Thread.sleep(500);
						} catch(InterruptedException ie) {
							System.out.println(ie.getMessage());
						}
					}
				}
		});
		
		// 서브스레드의 실행
		t.start();
		
		// 메인스레드의 작업
		for(int i = 6; i <= 10; i++) {
			System.out.println(i);
			
			//Thread.sleep(): 밀리초 단위로 지정하고 현재 진행되는 스레드를 지정한 시간만큼
			//멈춤. 스레드가 멈추게 되면 다음 스레드가 진행된다.
			try {
				Thread.sleep(500);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
		
	}

}
