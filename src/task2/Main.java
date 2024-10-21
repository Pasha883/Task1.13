package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = s.length();

        s =  s.replace(" ", "");

        n -= s.length();

        System.out.println(1 + n);
    }
}
