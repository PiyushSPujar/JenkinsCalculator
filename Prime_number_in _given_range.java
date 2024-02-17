
import java.util.*;

// import iterator_twoava.util.Arrays;
// import iterator_twoava.util.Scanner;
public class Prime_number_in _given_range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lower_boundary, upper_boundary, iterator_one, iterator_two, flag;

        System.out.print("Enter lower boundary of interval : ");
        lower_boundary = scanner.nextInt();

        System.out.print("Enter upper boundary of interval : ");
        upper_boundary = scanner.nextInt();

        System.out.printf("Prime between %d and %d are : ", lower_boundary, upper_boundary);

        for (iterator_one = lower_boundary; iterator_one <= upper_boundary; iterator_one++) {

            if (iterator_one == 1 || iterator_one == 0)
                continue;

            flag = 1;

            for (iterator_two = 2; iterator_two <= iterator_one / 2; ++iterator_two) {
                if (iterator_one % iterator_two == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1)
                System.out.print(iterator_one + " ");
        }
        System.out.println();
    }
}
