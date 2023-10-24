package chap05_array;

public class _06_ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		
		// 1. 얕은 복사
		int[] copyArr = arr;
		
		// 배열명을 출력하면 참조형 변수라 주소값이 출력된다.
		System.out.println(arr);
		System.out.println(copyArr);
		System.out.println(arr == copyArr);
		
		// 얕은 복사는 같을 메모리에 저장된 배열을 사용하기 때문에 값의 변경도
		// 서로에게 영향을 끼친다.
		arr[0] = 100;
		
		System.out.println(copyArr[0]);
	}

}
