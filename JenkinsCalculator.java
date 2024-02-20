/**
 * The Calculator class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division on two float operands.
 */
public class JenkinsCalculator {

    /**
     * The function "addition" takes two float operands and returns their sum.
     * 
     * @param operand_1 The first operand for addition. It is a float data type.
     * @param operand_2 The second operand in the addition operation.
     * @return The sum of operand_1 and operand_2.
     */
    float addition(float operand_1, float operand_2){
        return(operand_1 + operand_2);
    }

    /**
     * The function "substraction" takes two float operands and returns their difference.
     * 
     * @param operand_1 The first operand for the subtraction operation.
     * @param operand_2 The second operand in the subtraction operation.
     * @return the result of subtracting operand_2 from operand_1.
     */
    float substraction(float operand_1, float operand_2){
        return(operand_1 - operand_2);
    }

    /**
     * The function "multiplication" takes two float operands and returns their product.
     * 
     * @param operand_1 The first operand of the multiplication operation. It is a floating-point
     * number.
     * @param operand_2 The second operand in the multiplication operation.
     * @return The product of operand_1 and operand_2 is being returned.
     */
    float multiplication(float operand_1, float operand_2){
        return(operand_1 * operand_2);
    }

    /**
     * The division function takes two float operands and returns their quotient.
     * 
     * @param operand_1 The first operand of the division operation.
     * @param operand_2 The second operand in the division operation.
     * @return the result of dividing operand_1 by operand_2.
     */
    float division(float operand_1, float operand_2){
        return(operand_1 / operand_2);
    }


    public static void main(String[] args){
        float operand_1 = 10;
        float operand_2 = 5;
        JenkinsCalculator calc = new JenkinsCalculator();
        float add_result = calc.addition(operand_1, operand_2);
        System.out.println("Result of Addition is: " + add_result);
        float sub_result = calc.substraction(operand_1, operand_2);
        System.out.println("Result of Substraction is: " + sub_result);
        float mul_result = calc.multiplication(operand_1, operand_2);
        System.out.println("Result of Multiplication is: " + mul_result);
        float div_result = calc.division(operand_1, operand_2);
        System.out.println("Result of Division is: " + div_result);
    }
}