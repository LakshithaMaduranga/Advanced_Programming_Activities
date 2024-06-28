import java.util.Scanner;

public class Activity2 {
    public void employeeDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");

        String name = sc.next();

        System.out.println("Enter age of employee: ");

        int age = sc.nextInt();

        System.out.println("Enter salary of the employee: ");

        double salary = sc.nextDouble();

        System.out.println("Enter employee grade: ");

        String grade = sc.next();
        System.out.println("Employee name:"+ name);
        System.out.println("Employee age:"+ age);
        System.out.println("Employee salary:"+ salary);
        System.out.println("Employee grade:"+ grade);
    }
}
