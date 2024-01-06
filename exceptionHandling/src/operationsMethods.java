public class operationsMethods {
    public double addition(double a,double b){
        System.out.println("the addition result is ");
        return a+b;
    }
    public double positiveSubtractionResult(double a,double b) throws exceptionOnOperations {
        System.out.println("the subtraction result is ");
        if(a<b){
            throw new exceptionOnOperations("a is negative we want positive result");
        }
        return a-b;
    }
    public double division(double a,double b) throws exceptionOnOperations {
        System.out.println("the division result is ");
        if (b==0){
            throw new exceptionOnOperations("Cannot divide by zero");

        }
        return a/b;
    }

}
