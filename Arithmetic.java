import java.util.Scanner;
class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        System.out.print("Enter the choice(+,-,*,/,%):");
        String op = sc.next();
        switch(op)
        {
            case "+":
                System.out.println("Addition="+(a + b));
                break;
            case "-":
                System.out.println("Subtraction="+(a - b));
                break;
            case "*":
                System.out.println("Multiplication="+(a * b));
                break;
            case "/":
                if(b!=0)
                  System.out.println("Division="+(a / b));
                else
                   System.out.println("Cannot divided by zero");
                break;
            case "%":
                 if(b!=0)
                   System.out.println("Modulo="+(a % b));
                 else
                   System.out.println("Cannot divided by zero");
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}