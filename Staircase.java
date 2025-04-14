
import java.io.*;
import java.util.*;


class Result4 {
    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    public static void staircase(int n) {
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){
                if( i+j>=n+1 ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}

public class Staircase {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1-10");
        int n = sc.nextInt();

        System.out.println("Staircase: ");
        Result4.staircase(n);


    }
}