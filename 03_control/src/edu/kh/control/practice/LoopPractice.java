package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {

		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요. 단, 입력한 수는 1보다 크거나 같아야 합니다. 만일
		 * 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요. ex. 1이상의 숫자를 입력하세요 : 4 1 , 2 , 3 ,
		 * 4 1이상의 숫자를 입력하세요 : 0 1이상의 숫잘를 입력해주세요.
		 * 
		 */
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = 1; i <= num; ++i) {

				System.out.print(i + " ");

			}

		} else {
			System.out.print("1이상의 숫잘를 입력해주세요.");

		}

	}

	public void practice2() {

		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요. 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 */
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num >= 1) {
			for (int i = num; i > 0; --i) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}

	}

	public void practice3() {

		/*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		 * 
		 * 정수를 하나 입력하세요 : 8 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		 */
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; ++i) {
			System.out.print(i);

			sum = sum + i;// 이걸 잘 기억하자....

			if (i != num) {
				System.out.print(" + ");
			}

		}

		System.out.print(" = " + sum);

	}

	public void practice4() {

		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를
		 * 입력해주세요“를 출력하세요.
		 * 
		 * 
		 * 
		 */

		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		if(num1 < 0) { 
			System.out.print("1 이상의 숫자를 입력해주세요");
			System.out.print("\033[H\033[2J");
			System.out.flush(); 
			practice4(); 
			} 
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {

			if (num1 > num2) {
				for (int i = num2; i <= num1; ++i) {
					System.out.print(i + " ");
				}

			}
			if (num1 < num2) {
				for (int i = num1; i <= num2; ++i) {
					System.out.print(i + " ");
				}
			}

		} else {
			System.out.print("1 이상의 숫자를 입력해주세요");

		}

	}

	public void practice5() {

		/*
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요. 예) ===== 4단 ===== 4 * 1 = 4 4 * 2 = 8 4 * 3 = 12 4
		 * * 4 = 16 4 * 5 = 20 4 * 6 = 24 4 * 7 = 28 4 * 8 = 32 4 * 9 = 36
		 * 
		 */
		System.out.print("단입력 : ");
		int dan = sc.nextInt();

		System.out.print("======" + dan + "단========");
		System.out.println();

		for (int i = 1; i <= 9; ++i) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);

		}

	}

	public void practice6() {

		/*
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요. 단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를
		 * 출력하세요.
		 */
		System.out.print("단을 입력하시요 : ");
		int dan = sc.nextInt();

		for (int i = dan; i <= 9; ++i) {
			System.out.print("========" + i + "단========");
			System.out.println();

			for (int i2 = 1; i2 <= 9; ++i2) {
				System.out.printf("%d * %d = %d\n", i, i2, i * i2);
			}

		}

	}

	public void practice7() {
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 * 
		 * 
		 * 정수 입력 : 4
		 *
		 **
		 ***
		 *****/

		// -행(row)은 입력한 input 만큼
		// 열(col)은 현재행(row)만큼 반복

		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		char ch = '*';

		for (int i = 1; i <= num; i++) { //

			for (int i2 = 1; i2 <= i; i2++) {
				System.out.print(ch);
			}
			System.out.println();// 이위치가 중요하다

		}
	}

	public void practice8() {

		/*
		 * 메소드 명 : public void practice9(){} 다음과 같은 실행 예제를 구현하세요.
		 * 
		 * ex. 정수 입력 : 4
		 ****
		 ***
		 **
		 *
		 */

		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {

			for (int i2 = 0; i2 < i; ++i2) {
				System.out.print('*');
			}
			System.out.println();

		}

	}

	public void practice9() {

		/*
		 * 메소드 명 : public void practice10(){} 다음과 같은 실행 예제를 구현하세요.
		 * 
		 * ex. 정수 입력 : 3
		   *
		   **
		   ***
		   **
		   *
		   *
		  */

	
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
		    
			for (int i2=0; i2 < i; i2++) {
				System.out.println("*");
			
			
			}
		}
	
	
	
	
	
	
	}
}
