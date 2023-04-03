import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator made using Java");

        //Variable declaration
        int firstNumber;
        int secondNumber;
        char symbol;
        double answer;
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter first Number:");
            firstNumber = scanner.nextInt();

            System.out.print("Enter second Number");
            secondNumber = scanner.nextInt();

            System.out.print("Enter Symbol:");
            symbol = scanner.next().charAt(0);

            switch (symbol)
            {
                case '+':
                    answer = firstNumber + secondNumber;
                    break;
                case '-':
                    answer = firstNumber - secondNumber;
                    break;
                case '*':
                    answer = firstNumber * secondNumber;
                    break;
                case '/':
                    answer = firstNumber / secondNumber;
                    break;
                default:
                    answer = 0;
                    System.out.println("Wrong symbol entered");
            }

            System.out.println(firstNumber +"" +symbol +""+secondNumber + "=" + answer);

            System.out.println("Do you want another calculation?");
            if("no".equals(scanner.next()))
                break;
        }
    }
}