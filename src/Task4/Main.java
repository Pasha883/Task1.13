package Task4;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Vector <String> vec = new Vector<>();

        String s = "";


        for (int i = 0; i < str.length(); i++) {


            if (str.charAt(i) != ' ') {
                s += str.charAt(i);
            }
            else{
                vec.add(s);

                s = "";
            }

            if(i == str.length()-1){
                vec.add(s);
            }
        }

        int max = 0;
        String maxx = "";

        for(String s1 : vec) {
            if (s1.length() > max) {
                max = s1.length();
                maxx = s1;
            }
        }

        System.out.println(maxx);
        System.out.println(max);
    }
}
