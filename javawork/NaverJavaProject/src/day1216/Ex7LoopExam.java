package day1216;

import java.util.Scanner;

public class Ex7LoopExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  1. 지수승구하기  2. 팩토리알 구하기 3.원의 넓이 구하기  4. 종료
		 *  while 반복문에서 위의 메뉴가 나오면 번호를 입력하고 해당 데이타를 입력후
		 *  결과값을 출력하시오
		 *  switch 문
		 *  1번 : 두수 x,y 를 이	입력후 x의 y승(for문)을 구하여 출력하시오
		 *  2번 : 숫자 n 을 입력후 n!값을 구하시오(for문)
		 *  3번 : 반지름 r을 입력하면 원의 넓이를 구해서 출력(반지름*반지름*Math.PI)
		 *  그 이외의 값이 들어오면  "종료합니다" 출력후 프로그램을 종료하시오
		 */
		Scanner sc=new Scanner(System.in);
		int x,y,result;//1번에 필요한 변수
		int n,fact=1;//2번에 필요한 변수
		int r,area; //3번에 필요한 변수
		int menu; //번호 입력받을 변수
		
		Loop:
		while(true)
		{
			System.out.println("1. 지수승구하기  2. 팩토리알 구하기 3.원의 넓이 구하기  4. 종료");
			menu=sc.nextInt();
			switch(menu)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default:
					
			}
		}
	}

}









