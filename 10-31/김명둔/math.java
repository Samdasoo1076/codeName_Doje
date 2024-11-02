package test22;

import java.util.Scanner;

public class math {

	private final static int max_num = 7;
	static Scanner sc = new Scanner(System.in);
	private static int addresult;
	private static int minusresult;
	private static int multiplyresult;
	private static int divideresult;
	private static int result;

	public static void add(int[] array, int number) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= number; i++) {
			addresult += array[i];
		}
		result();
	}

	public static void minus(int[] array, int number) {
		// TODO Auto-generated method stub
		minusresult = array[0];
		for (int i = 1; i <= number; i++) {
			minusresult -= array[i];
		}
		result();
	}

	public static void multiply(int[] array, int number) {
		// TODO Auto-generated method stub
		multiplyresult = array[0];
		for (int i = 1; i <= number; i++) {
			multiplyresult *= array[i];
		}
		result();
	}

	public static void divide(int[] array, int number) {
		// TODO Auto-generated method stub
		divideresult = array[0];
		for (int i = 1; i <= number; i++) {
			divideresult /= array[i];
		}
		result();
	}

	public static void result() {
		// TODO Auto-generated method stub
		int Value = addresult + minusresult + multiplyresult + divideresult;
		System.out.println("값 : " + Value);
		addresult = 0;
		minusresult = 0;
		multiplyresult = 0;
		divideresult = 0;
	}

	public static void input() {
		// TODO Auto-generated method stub

		int[] array = new int[max_num];
		int count2 = 0;
		System.out.println("몇개의 숫자를 입력하실건가요? : ");
		int count = sc.nextInt();

		if (count < max_num) {

			for (int i = 0; i < count; i++) {
				System.out.println((i + 1) + "번째 숫자를 입력해주세요.");
				int number = sc.nextInt();
				array[i] = number;
				count2 = i;
			}
			System.out.println("연산자를 선택해주세요.");
			System.out.println("1. 덧셈(+)");
			System.out.println("2. 뺄셈(-)");
			System.out.println("3. 곱셈(*)");
			System.out.println("4. 나눗셈(/)");
			int sign = sc.nextInt();
			switch (sign) {
			case 1:
				add(array, count2);
				break;
			case 2:
				minus(array, count2);
				break;
			case 3:
				multiply(array, count2);
				break;
			case 4:
				divide(array, count2);
				break;
			}
		} else {
			System.out.println("최대 입력 숫자의 개수는 7개 입니다.");
		}
	}

	public static void main(String[] args) {

		boolean cmd = true;
		while (cmd) {

			System.out.println("[ 계산기 메뉴 ]");
			System.out.println("1. 시작");
			System.out.println("2. 종료");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				input();
				break;
			case 2:
				System.out.println(" 계산기를 종료합니다.");
				cmd = false;
				return;
			default:
				System.out.println("1과 2중에서 택하십시오.");
				System.out.println("[ 계산기 메뉴 ]");
				System.out.println("1. 시작");
				System.out.println("2. 종료");
				choice = sc.nextInt();
				break;
			}
		}
	}
}
