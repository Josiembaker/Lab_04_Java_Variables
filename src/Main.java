/**
 * Josie Baker baker5jm@mail.uc.edu
 */

public class Main
{
    public static void main(String[] args)
    {
      /*  int age = 0;
        double salary = 0.0;
        String nme = "josie";
        boolean done = false;
      */

        int intOperandA = 5;
        int intOperandB = 45;
        int intSum = 0;
        int intProduct = 0;
        int intQuotient = 0; //division
        int intDifference = 0;
        int intModulo = 0; //remainder

        intSum = intOperandA + intOperandB;
        System.out.println(" The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println(" The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB;
        System.out.println(" The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient );

        intDifference =  intOperandA - intOperandB;
        System.out.println(" The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intModulo = intOperandA % intOperandB;
        System.out.println(" The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        double doubleOperandA = 5.5;
        double doubleOperandB = 45.34;
        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleQuotient = 0; //division
        double doubleDifference = 0;
        double doubleModulo = 0; //remainder

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println(" The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println(" The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println(" The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient );

        doubleDifference =  doubleOperandA - doubleOperandB;
        System.out.println(" The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println(" The modulo of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}