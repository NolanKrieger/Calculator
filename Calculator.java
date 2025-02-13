import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){

        Scanner mainScan = new Scanner(System.in);

        System.out.println("Enter two whole numbers");

        int first = mainScan.nextInt();
        int second = mainScan.nextInt();

        System.out.println(first + second);

        System.out.println("Would you like to perform addition or subtraction?");

        String firstChoice = mainScan.nextLine();

        if(firstChoice.toLowerCase().equals("addition")){
            System.out.println(first + second);
        }else if(firstChoice.toLowerCase().equals("subtraction")){
            System.out.println(first - second);
        }

     

        System.out.println("Would you like to perform multiplication or division?");

        String secondChoice = mainScan.nextLine();


        if(secondChoice.toLowerCase().equals("multiplication")){
            System.out.println(first * second);
        }else if(secondChoice.toLowerCase().equals("division")){
            if(second == 0){
                System.out.println("Error: Divide by Zero");
                return;
            }
            System.out.println((double)first / second);
        }

    }
}