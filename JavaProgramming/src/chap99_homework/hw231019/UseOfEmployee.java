package chap99_homework.hw231019;

import java.util.Scanner;

import chap99_homework.hw231019.employee.ContractEmployee;
import chap99_homework.hw231019.employee.Employee;
import chap99_homework.hw231019.employee.RegularEmployee;
import chap99_homework.hw231019.employee.TempEmployee;

public class UseOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{new RegularEmploayee(), new ContractEmployee(), 
		// new TempEmployee(),...... } 
		//empArr[0].eno, empArr[0].showEmployInfo();
		Employee[] empArr = new Employee[100];
		
		String str = new String("aaa");
		str.charAt(0);
		str.length();
		
		Employee emp;
		emp = new RegularEmployee(0, str, 0, 0, 0);
		emp.showEmployeeInfo();
		
		getEmployee(new RegularEmployee(0, str, 0, 0, 0));
		
		String[] strArr = new String[100];
		
		Scanner sc = new Scanner(System.in);
		
		int eno = 0;
		String name = "";
		int pay = 0;
		int bonus = 0;
		int hireYear = 0;
		int workDay = 0;
		int index = 0;
		
		/*
		 * *** 메뉴 선택***
		 * 1. 정규직 저장
		 * 2. 임시직 저장
		 * 3. 계약직 저장
		 * 4. 전체 정보 출력
		 * 5. 월급 계산 출력 
		 * 6. 프로그램 종료
		 * 
		 * 1. 선택 시
		 * 사번을 입력하세요.
		 * 1
		 * 이름을 입력하세요.
		 * 홍길동
		 * 급여를 입력하세요.
		 * 3000
		 * 보너스를 입력하세요.
		 * 300
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 2. 선택 시
		 * 사번을 입력하세요.
		 * 2
		 * 이름을 입력하세요.
		 * 임꺽정
		 * 급여를 입력하세요.
		 * 2800
		 * 근무년수를 입력하세요.
		 * 7
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 3. 선택 시
		 * 사번을 입력하세요.
		 * 3
		 * 이름을 입력하세요.
		 * 장길산
		 * 급여를 입력하세요.
		 * 250
		 * 근무일수를 입력하세요.
		 * 20
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 4. 선택 시
		 * empArr에 저장된 내용 모두 출력
		 * showEmployeeInfo() 사용해서 출력
		 * 
		 * 5. 선택 시
		 * 검색할 사원의 사번을 입력하세요.
		 * 1
		 * 1번 사원의 정보를 showEmployeeInfo() 사용해서 출력
		 * 
		 * 6. 선택 시
		 * 프로그램을 종료합니다.
		 * 
		 * 다른 번호가 입력되면
		 * 잘못 선택하셨습니다.
		 * 다시 메뉴 표출
		 */
		
		while(true) {
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 정규직 입력");
			System.out.println("2. 임시직 입력");
			System.out.println("3. 계약직 입력");
			System.out.println("4. 전체 정보 출력");
			System.out.println("5. 월급 정보 출력");
			System.out.println("6. 프로그램 종료");
			
			int userNum = sc.nextInt();
			sc.nextLine();
			
			switch(userNum) {
				case 1:
					System.out.println("사번을 입력하세요.");
					eno = sc.nextInt();
					sc.nextLine();
					
					System.out.println("이름을 입력하세요.");
					name = sc.nextLine();
					
					System.out.println("급여를 입력하세요.");
					pay = sc.nextInt();
					sc.nextLine();
					
					System.out.println("보너스를 입력하세요.");
					bonus = sc.nextInt();
					sc.nextLine();
					
					empArr[index++] = new RegularEmployee(eno, 
							name, pay, userNum, bonus);
					break;
				case 2:
					System.out.println("사번을 입력하세요.");
					eno = sc.nextInt();
					sc.nextLine();
					
					System.out.println("이름을 입력하세요.");
					name = sc.nextLine();
					
					System.out.println("급여를 입력하세요.");
					pay = sc.nextInt();
					sc.nextLine();
					
					System.out.println("근무년수를 입력하세요.");
					hireYear = sc.nextInt();
					sc.nextLine();
					
					empArr[index++] = new TempEmployee(eno, 
							name, pay, userNum, hireYear);
					break;
				case 3:
					System.out.println("사번을 입력하세요.");
					eno = sc.nextInt();
					sc.nextLine();
					
					System.out.println("이름을 입력하세요.");
					name = sc.nextLine();
					
					System.out.println("급여를 입력하세요.");
					pay = sc.nextInt();
					sc.nextLine();
					
					System.out.println("근무일수를 입력하세요.");
					workDay = sc.nextInt();
					sc.nextLine();
					
					empArr[index++] = new ContractEmployee(eno, 
							name, pay, userNum, workDay);
					break;
				case 4:
					for(int i = 0; i < index; i++) {
						empArr[i].showEmployeeInfo();
						System.out.println("--------------");
					}
					break;
				case 5:
					System.out.println("검색할 사원의 사번을 입력하세요.");
					eno = sc.nextInt();
					sc.nextLine();
					
					for(int i = 0; i < index; i++) {
						if(empArr[i].getEno() == eno) {
							empArr[i].showEmployeeInfo();
							System.out.println("--------------");
						}
					}
					
					break;
				case 6:
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					System.exit(0);
				default:
					System.out.println("잘못 입력하셨습니다.");
					continue;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
	
	public static Employee getEmployee(Employee emp) {
		return new RegularEmployee(1, "aaa", 1, 1, 1);
	}

}
