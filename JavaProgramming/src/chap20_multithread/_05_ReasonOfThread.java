package chap20_multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _05_ReasonOfThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 동시에 2000명이 1억건의 데이터를 조회하게 되면
		// DB 데드락이 걸릴 가능성이 매우 높아진다.
		// 여러명의 사용자가 동시에 작업을 진행할 때
		// 사용자별로 스레드를 생성해서 분산처리(병렬처리)해줘서
		// DB에 무리가 가지 않게 해준다.
		Thread t = new Thread() {
			@Override
			public void run() {
				getDataList();
				
				try {
					Thread.sleep(10000);
				} catch(InterruptedException ie) {
					System.out.println(ie.getMessage());
				}
			}
		};
		
		t.start();
	}
	
	// 1. 1억건의 데이터를 조회해오는 메소드
	public static List<Map<String, String>> getDataList() {
		return new ArrayList<Map<String, String>>();
	}
}
