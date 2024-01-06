import java.util.Scanner;
class ComplexNumber<T extends Number> {
    private T real;
    private T imaginary;

    ComplexNumber(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    T getReal() {
        return real;
    }

    T getImaginary() {
        return imaginary;
    }

    static <T extends Number> ComplexNumber<T> add(ComplexNumber<T> num1, ComplexNumber<T> num2) {
        return new ComplexNumber(num1.getReal().doubleValue() + num2.getReal().doubleValue(),
                num1.getImaginary().doubleValue() + num2.getImaginary().doubleValue());
    }
    static <T extends Number> ComplexNumber<T> subtract(ComplexNumber<T> num1, ComplexNumber<T> num2) {
        return new ComplexNumber(num1.getReal().doubleValue() - num2.getReal().doubleValue(),
                num1.getImaginary().doubleValue() - num2.getImaginary().doubleValue());
    }
    static <T extends Number> ComplexNumber<T> multiply(ComplexNumber<T> num1, ComplexNumber<T> num2) {
        double realResult = num1.getReal().doubleValue() * num2.getReal().doubleValue()
                - num1.getImaginary().doubleValue() * num2.getImaginary().doubleValue();

        double imagResult = num1.getReal().doubleValue() * num2.getImaginary().doubleValue()
                + num1.getImaginary().doubleValue() * num2.getReal().doubleValue();

        return new ComplexNumber(realResult, imagResult);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("type the real number of the first complex:");
        int real1 = getIntInput(input);

        System.out.println("type the imaginary number of the first complex:");
        int imaginary1 = getIntInput(input);

        System.out.println("type the real number of the second complex:");
        int real2 = getIntInput(input);

        System.out.println("type the imaginary number of the second complex:");
        int imaginary2 = getIntInput(input);

        ComplexNumber<Integer> complex1 = new ComplexNumber<>(real1, imaginary1);
        ComplexNumber<Integer> complex2 = new ComplexNumber<>(real2, imaginary2);

        ComplexNumber<Integer> addition = ComplexNumber.add(complex1, complex2);
        System.out.println("Addition result : " + addition.getReal() + " + " + addition.getImaginary() + "i");

        ComplexNumber<Integer> subtraction = ComplexNumber.subtract(complex1, complex2);
        System.out.println("Subtraction result : " + subtraction.getReal() + " + " + subtraction.getImaginary() + "i");

        ComplexNumber<Integer> multiplication = ComplexNumber.multiply(complex1, complex2);
        System.out.println("Multiplication result : " + multiplication.getReal() + " + " + multiplication.getImaginary() + "i");    }

    private static int getIntInput(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("sorry...invalid input try to enter a number");
            }
        }
    }

    }

