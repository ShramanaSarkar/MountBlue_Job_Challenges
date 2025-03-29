import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */
    public static int simpleArraySum(List<Integer> ar) {

        // Write your code here
        int sum = 0;
        for (Integer integer : ar) {
            sum = sum + integer;
        }
        return sum;
    }
}

public class SimpleArraySum {

    public static void main(String[] args) throws IOException {

        List<Integer> ar = Arrays.asList(1, 2, 3, 4, 5);

        int result = Result.simpleArraySum(ar);

        System.out.println("The output is: " + result);
    }
}