import java.util.*;

//calculator for performing operation by switch method 
public class qus3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, Result;
        System.out.println("plese enter two number");

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("please select symbol[+ , - , * , / , %]");
        String sym = sc.next();
        switch (sym) {
            case "+":
                Result = n1 + n2;
                System.out.println("addition is " + Result);
                break;
            case "-":
                Result = n1 - n2;
                System.out.println("subtraction is " + Result);
                break;
            case "*":
                Result = n1 * n2;
                System.out.println("multiplication is " + Result);
                break;
            case "/":
                Result = n1 / n2;
                System.out.println("division is " + Result);
                break;
            case "%":
                Result = n1 % n2;
                System.out.println("remainder is " + Result);
                break;

            default:
                System.out.println("plese select valid symbol ");
                break;
        }

    }
}
