public class ArrayExample {
    public static void main(String[] args) {
    	
        int[] numbers = new int[5]; 
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("배열 요소 출력:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        String[] fruits = {"Apple", "Banana", "Cherry"};

        System.out.println("\n과일 배열 출력:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
