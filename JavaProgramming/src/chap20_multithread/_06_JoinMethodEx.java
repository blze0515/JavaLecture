package chap20_multithread;

import chap20_multithread.thread.PrintNum;

public class _06_JoinMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNum pn = new PrintNum();
		
		pn.printNum(10);
		
		System.out.println("main스레드 종료");
	}

}
