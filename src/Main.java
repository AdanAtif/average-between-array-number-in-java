import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count of numbers: ");
        int count =scanner.nextInt();
        int number,sum=0;
        float average=0;
        for (int i=0;i<count;i++){
            number =scanner.nextInt();
            sum += number;
        }
        average =sum/count;
        System.out.println("average "+average);

        scanner.close();
    }
}