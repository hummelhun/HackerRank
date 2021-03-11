import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<ArrayList<Integer>> t = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            t.add(new ArrayList<Integer>());
            String[] str = sc.nextLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                t.get(i).add(Integer.parseInt(str[j]));
            }
        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < t.get(i).size(); j++) {
//                System.out.print(t.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        int q= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            try {
                System.out.println(t.get(x).get(y));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
            sc.nextLine();
        }

    }
}