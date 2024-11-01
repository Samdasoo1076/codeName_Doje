public class num {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("계산할 두숫자를 입력하세요: ");
        System.out.println("1번 숫자");
        int num1 = sc.nextInt();
        System.out.println("2번 숫자");
        int num2 = sc.nextInt();
        
        System.out.println("입맛대로 고르세요[ + - * /]");
        String st = sc.next();
        
        switch(st) {
        case "+":
        	int number1 = num1 + num2;
        	System.out.println(num1 + "+" + num2 + "=" + number1 );
            return;
        case "-":
        	int number2 = num1 - num2;
        	System.out.println(num1 + "-" + num2 + "=" + number2 );
            return;
        case "*":
        	int number3 = num1 * num2;
        	System.out.println(num1 + "*" + num2 + "=" + number3 );
            return;
        case "/":
        	int number4 = num1 / num2;
        	System.out.println(num1 + "/" + num2 + "=" + number4 );
            return;
        default:
        	System.out.println("그런거는 없어여");
        	return;
        
        }
    }
}
