import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static int  getInt(){
        System.out.println("Введіть будь-ласка число");
        int num;
        if (scanner.hasNextInt()){
            num = scanner.nextInt();
        }
        else{
            System.out.println("Error, ви ввели не ціле число");
            scanner.next();
            num = getInt();

        }
    return num;
    }

    public static char getOperation(){
        System.out.println("Operations + / - / * / /");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }
        else{
            System.out.println("Error, ви не ввели потрібний знак");
            scanner.next();
            operation = getOperation();

        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+' :
              result = num1 + num2;
              break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            default:
                System.out.println("Error, операція не розпізнана");
                result = calc( num1,  num2,  operation);
        }
        return result;
    }
}
