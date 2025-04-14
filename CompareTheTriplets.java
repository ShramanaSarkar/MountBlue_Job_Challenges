// Compare the Triplets
        import java.util.*;
        import java.util.stream.*;


class Result5 {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    // This function compares two lists of integers and returns a list of two integers
    public static List compareTriplets(List<Integer> a, List<Integer> b) {
        int alicescore=0;
        int bobscore=0;
        for(int i=0; i<a.size(); i++){
            if (a.get(i)>b.get(i)){
                alicescore++;
            }else if (a.get(i)<b.get(i)){
                bobscore++;
            }
        }
        List result= new ArrayList();
        result.add(alicescore);
        result.add(bobscore);
        return result;
    }

}

public class CompareTheTriplets {
    public static void main(String[] args) {
        // Example input
        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);

        // Call the compareTriplets function
        System.out.println(Result5.compareTriplets(a, b));

    }

}