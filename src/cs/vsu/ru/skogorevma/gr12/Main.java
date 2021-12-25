package cs.vsu.ru.skogorevma.gr12;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static double sumOfSequence(int t) {
        double prevN2 = 1;
        double prevN = 0.3;
        double currN;
        double s = 0;
        if ((t==1))  {
            s=prevN2;
        } else if ((t==2)){
            s=prevN2+prevN;
        } else if (t>=3) {
            s = prevN2 + prevN;
            for (int i = 3; i <= t; i++) {
                currN = (i + 1) * prevN2;
                prevN2 = prevN;
                prevN = currN;
                s += +currN;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter t: ");
        int t = scan.nextInt();
        System.out.println(sumOfSequence(t));
    }
}
