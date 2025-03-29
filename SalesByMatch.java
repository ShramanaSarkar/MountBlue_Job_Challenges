
import java.io.*;
import java.util.*;

class Result1 {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pairCount=0;
        HashMap<Integer, Integer> hashMap= new HashMap<>();
        for (int num :ar){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
            if (hashMap.get(num)%2==0){
                pairCount++;
            }
        }
        return pairCount;
    }

}

public class SalesByMatch {
    public static void main(String[] args) throws IOException {
        int n = 7;

        List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 40, 10);


        int result = Result1.sockMerchant(n, ar);

        System.out.println("The output is: " + result);
    }
}
