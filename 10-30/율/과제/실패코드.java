package NUM;

import java.util.*;

public class num {
 
	public static void main(String[] args) {
		Number number = new Number();
		Scanner sc = new Scanner(System.in);
		
        System.out.println("계산할 두숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.println("입맛대로 고르세요[ + - * /]");
        String st = sc.next();
        
        switch(st) {
        case "+":
        	number.plus(num1, num2);
            return;
        case "-":
            return;
        case "*":
            return;
        case "/":
            return;
        default:
        
        }
    }
}

public class Number{
	void plus(int num1, int num2) {//더하기
        int num3 = num1 + num2;
    }

    void minus(int num1, int num2) {//빼기

    }

    void multiply(int num1, int num2) {//곱하기

    }
    void divide(int num1, int num2) {//나누기

    }
}
/*
이러한 코드를 도전하였지만 최율의 머리로는 도저히 다음 단계로 나아가는
기미가 보이지 않아 급하게 내가 만들수 있는 계산기를 만들었다
=> num.java
*/


