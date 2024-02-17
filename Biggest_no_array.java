import java.util.*;


public class Greatest_in_arr{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array_list = new int[20];

        System.out.print("Enter the array count(max:20) : ");
        int size_of_array = scanner.nextInt();

        System.out.println("Enter array elements on by one : ");
        for(int arr_count = 0; arr_count < size_of_array; arr_count++)
        {
            System.out.print("Array element "+ (arr_count+1) +" :");
            array_list[arr_count] = scanner.nextInt();
        }

        System.out.print("Array elements are : ");
        for(int arr_count = 0; arr_count < size_of_array ; arr_count++)
        {
            System.out.print(array_list[arr_count] + " ");
            
        }
        System.out.println();
        int greatest_element = Arrays.stream(array_list).max().getAsInt();

        System.out.println("Greatest element of array : "+ greatest_element);

        scanner.close();
    }
}
