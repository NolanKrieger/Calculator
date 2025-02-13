import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){

        Scanner mainScan = new Scanner(System.in);

        System.out.println("Enter two whole numbers");

        int first = mainScan.nextInt();
        int second = mainScan.nextInt();

        System.out.println(first + second);

    }
}