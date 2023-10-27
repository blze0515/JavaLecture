package chap20_multithread;

public class _03_JoinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 6; i <= 10; i++) {
					System.out.println(i);
				}
			}
		};
		
		t1.start();
		
		try {
			// join() 메소드는 join() 메소드가 실행되는 시점에 동작중인
			// 스레드를 일시 정지 상태로 만드는 메소드
			// 메인스레드가 일시정지되고 t1이 실행상태가 된다.
			// t1의 run 메소드가 모두 작업이 끝나면 메인스레드가 다시 실행된다.
			t1.join();
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		// 메인스레드의 작업
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

}
