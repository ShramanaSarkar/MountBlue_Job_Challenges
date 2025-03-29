import java.io.*;
import java.util.*;

class Result2 {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int count1=0, count2=0;
        int hscore= scores.getFirst();
        int lscore= scores.getFirst();
        for (int num: scores){
            if (num>hscore){
                hscore=num;
                count1++;
            } else if (num<lscore) {
                lscore=num;
                count2++;
            }
        }
        List<Integer> score=new ArrayList<>();
        score.add(count1);
        score.add(count2);
        return score;
    }
}

public class BreakingTheRecords {
    public static void main(String[] args) throws IOException {

        int n = 9;

        List<Integer> scores = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);

        List<Integer> result = Result2.breakingRecords(scores);

        System.out.println("The output is: "+result);
    }
}