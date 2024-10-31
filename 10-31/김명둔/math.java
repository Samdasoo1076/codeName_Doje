package test22;

import java.util.Scanner;

public class math {
	static Scanner sc = new Scanner(System.in);
	static int Array1[] = new int[7];
	static int count = 0;
	static int AddValue;
	static int MinusValue;
	static int MultValue;
	static int DivisionValue;
	static int Value;
	static boolean Cmd = true;

	public static void Add() {
		AddValue = Array1[0];
		for (int i = 1; i < count; i++) {
			AddValue += Array1[i];
		}
	}

	public static void Minus() {
		MinusValue = Array1[0];
		for (int i = 1; i < count; i++) {
			MinusValue -= Array1[i];
		}

	}

	public static void Mult() {
		MultValue = Array1[0];
		for (int i = 1; i < count; i++) {
			MultValue *= Array1[i];
		}

	}

	public static void Division() {
		DivisionValue = Array1[0];
		for (int i = 1; i < count; i++) {
			DivisionValue /= Array1[i];
		}

	}

	public static void Input(int count2) {
		if (Array1.length < count2) {
			System.out.println("최대 입력 가능한 숫자의 개수는 7개 입니다.");
		} else {
			for (int i = 0; i < count2; i++) {
				System.out.println((i + 1) + "번째 수를 입력하세요.");
				Array1[i] = sc.nextInt();
				count++;
			}
		}
	}

	public static void Input2() {
		System.out.println("숫자 몇개 입력?");
		int count2 = sc.nextInt();

		System.out.println("연산자 선택) 1.덧셈 2.뺄셈 3.나눗셈 4.곱셈");

		int calculation = sc.nextInt();

		SC(count2, calculation);
	}

	public static void SC(int Num, int Num2) {

		Input(Num);

		switch (Num2) {
		case 1:
			Add();
			break;
		case 2:
			Minus();
			break;
		case 3:
			Division();
			break;
		case 4:
			Mult();
			break;
		}
	}

	public static void Output() {
		Value += MultValue + DivisionValue + AddValue + MinusValue;

		for (int i = 0; i < Array1.length; i++) {
			Array1[i] = 0;
		}

		MultValue = 0;
		DivisionValue = 0;
		AddValue = 0;
		MinusValue = 0;

		System.out.println("값 : " + Value);
	}

	public static void main(String[] args) {

		Input2();

		Output();
		System.out.println("이 값에 이어 연산을 더 하시겠습니까?) 1.yes 2.no");
		while (Cmd) {
			System.out.println("1.yes 2.no");
			int Cmd2 = sc.nextInt();
			switch (Cmd2) {
			case 1:
				Input2();
				Output();
				break;
			case 2:
				System.out.println("종료");
				Cmd = false;
				sc.close();
				break;

			default:
				System.out.println("1과 2중에 골라주세요.");
				break;
			}
		}
	}
}
