package text;

import java.util.Scanner;

public class text11_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력");
        int number = sc.nextInt();
        System.out.println("두 번째 숫자를 입력");
        int number1 = sc.nextInt();
        System.out.println("기호를 입력");
        char sign = sc.next().charAt(0);

        int result;


        if (sign == '+') {
            result = number + number1;
            System.out.println(result);
        } else if (sign == '-') {
            result = number - number1;
            System.out.println(result);
        } else if (sign == '*') {
            result = number * number1;
            System.out.println(result);
        } else if (sign == '/') {
            result = number / number1;
            System.out.println(result);
        } else {
            System.out.println("오류");
        }



    }

}