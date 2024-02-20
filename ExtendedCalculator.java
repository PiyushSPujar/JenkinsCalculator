
class ExtendedCalculator extends JenkinsCalculator {

    
    float square(float operand_1){
        return(operand_1 * operand_1);
    }

    float cube(float operand_1){
         return(operand_1 * operand_1 * operand_1);    
    }
 
    public static void main(String[] args){
        float operand_1 = 10;
        float operand_2 = 5;
        JenkinsCalculator calc = new JenkinsCalculator();
        ExtendedCalculator ex = new ExtendedCalculator();
        float add_result = calc.addition(operand_1, operand_2);
        System.out.println("Result of Addition is: " + add_result);
        float sub_result = calc.substraction(operand_1, operand_2);
        System.out.println("Result of Substraction is: " + sub_result);
        float mul_result = calc.multiplication(operand_1, operand_2);
        System.out.println("Result of Multiplication is: " + mul_result);
        float div_result = calc.division(operand_1, operand_2);
        System.out.println("Result of Division is: " + div_result);
        float squ_result = ex.square(operand_1);
        System.out.println("Result of Square is: " + squ_result);
        float cube_result = ex.cube(operand_1);
        System.out.println("Result of Cube is: " + cube_result);
    }
    
}
