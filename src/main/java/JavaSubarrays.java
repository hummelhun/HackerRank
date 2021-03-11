import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubarrays{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int l= scanner.nextInt();
        int[] t= new int[l];
        for (int i = 0; i < l; i++) {
            t[i]=scanner.nextInt();
        }

        int sum =0;
        int counter=0;

        for (int k = 0; k < t.length; k++) {
            for (int i = 0; i < t.length; i++) {
                for (int j = k; j < t.length - i; j++) {
                    sum+=t[j];

                }
                if (sum<0){
                    counter++;
                }
                sum=0;
            }
        }
        System.out.println(counter);

    }
}
