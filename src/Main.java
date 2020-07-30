import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int getNumber(String[] ss,String s){
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].equals(s)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.next().split("");
        String[] s2 = sc.next().split("");

        Arrays.stream(sc.next()
                .split(""))
                .map(x->s2[getNumber(s1,x)])
                .forEach(System.out::print);
        System.out.println();
        Arrays.stream(sc.next()
                .split(""))
                .map(x->s1[getNumber(s2,x)])
                .forEach(System.out::print);
    }
}
