public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = calculator.getInt();
        int num2 = calculator.getInt();
        char operation = calculator.getOperation();
        int result = calculator.calc(num1, num2, operation);


        System.out.println("Результат обчислення дорівнює" + result);

    }
}
