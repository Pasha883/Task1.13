package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if(Character.isLowerCase(c)) {
            System.out.println(Character.toUpperCase(c));
        }
        else{
            System.out.println(Character.toLowerCase(c));
        }
    }
}
