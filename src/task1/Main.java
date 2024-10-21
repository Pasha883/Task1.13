package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(str.matches("-?\\d+")){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
