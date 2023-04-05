import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator made using Java");

        //Variable declaration
        String input;
        double answer = 0;
        char symbol = '+';
        boolean isValid = true;

        Scanner scanner = new Scanner(System.in);

        while(true && isValid)
        {
            System.out.print("Enter the calculation you want to perform using the format ( 5+6 ): ");
            input = scanner.next();

            String temp = "";
            input += "=";
            answer = 0;
            symbol = '+';

            for(int i=0;i<input.length();i++)
            {
                char c = input.charAt(i);

                if(Character.isDigit(c)) {
                    temp += c;
                }
                else
                {
                    switch (symbol)
                    {
                        case '+':
                            answer += Integer.parseInt(temp);
                            break;
                        case '-':
                            answer -= Integer.parseInt(temp);
                            break;
                        case '*':
                            answer *= Integer.parseInt(temp);
                            break;
                        case '/':
                            answer /= Integer.parseInt(temp);
                            break;
                        default:
                            System.out.println("Wrong input string");
                            isValid = false;
                            break;
                    }
                    symbol = c;
                    temp = "";
                }

                if(!isValid)
                    break;
            }

            if(isValid)
                System.out.println(input + "" + (int)answer);

            System.out.println("Do you want another calculation?");
            if("no".equals(scanner.next()))
                break;
        }
    }
}