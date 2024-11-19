import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface StudentManager {
    void addStudent(String name, double score); 
    double calculateAverage();                
    List<Student> getAboveAverageStudents();  
}

class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

class StudentManagerImpl implements StudentManager {
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(String name, double score) {
        students.add(new Student(name, score));
    }

    @Override
    public double calculateAverage() {
        double total = 0;
        for (Student student : students) {
            total += student.getScore();
        }
        return total / students.size();
    }

    @Override
    public List<Student> getAboveAverageStudents() {
        double average = calculateAverage();
        List<Student> aboveAverageStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() >= average) {
                aboveAverageStudents.add(student);
            }
        }
        return aboveAverageStudents;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManagerImpl();
        
        System.out.print("학생 수를 입력하세요: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("학생 이름: ");
            String name = scanner.next();
            System.out.print("학생 점수: ");
            double score = scanner.nextDouble();
            manager.addStudent(name, score);
        }

        double average = manager.calculateAverage();
        System.out.printf("\n평균 점수: %.2f\n", average);

        System.out.println("평균 이상의 점수를 받은 학생들:");
        for (Student student : manager.getAboveAverageStudents()) {
            System.out.printf("%s: %.2f점\n", student.getName(), student.getScore());
        }

        scanner.close();
    }
}
