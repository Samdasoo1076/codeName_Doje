package 계산기;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산기");
        
        System.out.print("숫자를 입력하세여: ");
        int i = sc.nextInt();

        System.out.print("연산자 (+, -, *, / 중 하나를 입력하세요): ");
        char op = sc.next().charAt(0);

        System.out.print("다음 숫자를 입력하세요: ");
        int num = sc.nextInt();

        int ii = 0;
        boolean bl = true;
 
        switch (op) {
            case '+':
            	ii = i + num;
                break;
            case '-':
            	ii = i - num;
                break;
            case '*':
            	ii = i * num;
                break;
            case '/':
                if (i != 0) {
                	ii = i / num;
                } else {
                    System.out.println("0은 안됩니다!!!!!!!!");
                    bl = false;
                }
                break;
            default:
                System.out.println("+, -, *, / 중 하나를 입력하세요.");
                bl = false;
        }

        // 결과 출력
        if (bl) {
            System.out.println("결과: " + ii);
        }

        sc.close();

	}

}
