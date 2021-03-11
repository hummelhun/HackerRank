import java.io.*;
import java.util.*;

public class JavaList{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");

        List<Integer> l = new ArrayList<>();
        for (String s : str) {
            l.add(Integer.parseInt(s));
        }

        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <q; i++) {
            String s = sc.nextLine();
            if (s.contains("Insert")){
                l.add(sc.nextInt(), sc.nextInt());
                sc.nextLine();
            }else{
                l.remove(sc.nextInt());
                sc.nextLine();
            }
        }

        for (Integer integer : l) {
            System.out.println(integer+" ");
        }
    }
}