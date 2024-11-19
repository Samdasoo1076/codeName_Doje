import java.util.Scanner;

public class AdvancedArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int numStudents = scanner.nextInt();

        double[] scores = new double[numStudents];

        System.out.println("\n학생들의 점수를 입력하세요:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("학생 " + (i + 1) + "의 점수: ");
            scores[i] = scanner.nextDouble();
        }

        double total = 0;
        for (double score : scores) {
            total += score;
        }
        double average = total / numStudents;

        System.out.printf("\n평균 점수: %.2f\n", average);
        System.out.println("평균 이상의 점수를 받은 학생들:");
        for (int i = 0; i < numStudents; i++) {
            if (scores[i] >= average) {
                System.out.printf("학생 %d: %.2f점\n", i + 1, scores[i]);
            }
        }

        scanner.close();
    }
}
