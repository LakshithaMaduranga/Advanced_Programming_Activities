import java.util.Scanner;

public class NarrowCasting {

    public void narrowCasting() {
         int maxScore = 500;
         int percentage=100;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value: ");

        int num = input.nextInt();
        if (0 < num && num <= maxScore) {
            int score = ((num / maxScore) * percentage);
            System.out.println("Final Score percentage is: " + (float) score);
        } else {
            System.out.println("Enter correct score!");

        }
    }


}



