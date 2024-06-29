import java.util.Scanner;

public class StudentMarks {
    public void mark() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student  A mark: ");
        int A = sc.nextInt();
        System.out.println("Enter Student B mark: ");
        int B = sc.nextInt();
        if (B < A) {
            System.out.println("Student A mark is grater than Student mark B");

        } else if (A != B) {
            System.out.println("Student A mark is not equal Student mark B");

        } else if (A <= B) {
            System.out.println("Student A mark is less than or equal Student mark B");

        }
    }
}

