import java.util.Scanner;

public class AdvancedArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("�л� ���� �Է��ϼ���: ");
        int numStudents = scanner.nextInt();

        double[] scores = new double[numStudents];

        System.out.println("\n�л����� ������ �Է��ϼ���:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("�л� " + (i + 1) + "�� ����: ");
            scores[i] = scanner.nextDouble();
        }

        double total = 0;
        for (double score : scores) {
            total += score;
        }
        double average = total / numStudents;

        System.out.printf("\n��� ����: %.2f\n", average);
        System.out.println("��� �̻��� ������ ���� �л���:");
        for (int i = 0; i < numStudents; i++) {
            if (scores[i] >= average) {
                System.out.printf("�л� %d: %.2f��\n", i + 1, scores[i]);
            }
        }

        scanner.close();
    }
}
