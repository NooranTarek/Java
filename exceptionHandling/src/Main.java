import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Check if there are enough arguments

            double number1 = input.nextDouble();
            double number2 = input.nextDouble();
            operationsMethods operation = new operationsMethods();
            double resultOfAddition = operation.addition(number1,number2);
            System.out.println(resultOfAddition);
        //    double resultOfSubtraction = operation.positiveSubtractionResult(number1,number2);
           // System.out.println(resultOfSubtraction);
            double resultOfDivision = operation.division(number1,number2);
            System.out.println(resultOfDivision);
        } catch (exceptionOnOperations exp) {
            System.out.println("sorry there is an error  " + exp.getMessage());
        }finally {
            System.out.println("Finally FINSHEDDDD");
        }
    }}