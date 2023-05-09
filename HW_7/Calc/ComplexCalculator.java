import java.util.Scanner;

public class ComplexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое комплексное число (в формате a + bi): ");
        ComplexNum num1 = readComplexNum(scanner.nextLine());
        System.out.print("Введите второе комплексное число (в формате a + bi): ");
        ComplexNum num2 = readComplexNum(scanner.nextLine());
        System.out.print("Выберите операцию (+, -, *, /): ");
        String op = scanner.nextLine();
        scanner.close();
        Operation operation;
        switch (op) {
            case "+":
                operation = new Addition();
                break;
            case "-":
                operation = new Subtraction();
                break;
            case "*":
                operation = new Multiplication();
                break;
            case "/":
                operation = new Division();
                break;
            default:
                System.out.println("Операция не распознана");
                return;

        }

        ComplexNum result = operation.execute(num1, num2);
        System.out.println("Результат: " + result);

    }

    private static ComplexNum readComplexNum(String input) {
        String[] parts = input.split("s*[+-]s*");
        double real = Double.parseDouble(parts[0]);
        double imaginary = 0;
        if (input.contains("i")) {
            imaginary = Double.parseDouble(parts[1].replace("i", ""));
            if (input.contains("-")) {
                imaginary = -imaginary;
            }
        }
        return new ComplexNum(real, imaginary);
    }
}