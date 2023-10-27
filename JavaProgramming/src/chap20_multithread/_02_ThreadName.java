package chap20_multithread;

public class _02_ThreadName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 현재 동작중인 스레드 객체 얻어오기
		Thread thread1 = Thread.currentThread();
		
		System.out.println(thread1.getName() + " 동작 중");
		
		for(int i = 0; i < 3; i++) {
			Thread thread2 = new Thread() {
				@Override
				public void run() {
					System.out.println(this.getName() + " 동작 중");
				}
			};
			
			// 스레드를 대기큐에 등록
			// 먼저 큐에 등록된 스레드가 작업이 끝나면 실행되면서 run() 메소드를 호출
			thread2.start();
		}
		
		Thread thread3 = new Thread() {
			@Override
			public void run() {
				System.out.println(this.getName() + " 동작 중");
			}
		};
		
		// 스레드의 이름 변경
		thread3.setName("No3-Thread");
		thread3.start();
		
		
		
		
		
		
		
		
	}

}
