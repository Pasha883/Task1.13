import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        str = str.replaceAll("\\s", "");

        if(str.length() > 1) {
            if(str.length() % 2 == 0) {
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);

                    if (!stack.isEmpty()) {
                        if (stack.peek() == c) {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    } else {
                        stack.push(c);
                    }
                }
            }
            else {
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);

                    if (!stack.isEmpty() && i != str.length() / 2) {
                        if (stack.peek() == c) {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    } else if (stack.isEmpty()) {
                        stack.push(c);
                    }
                }
            }
        }

        if(!stack.isEmpty()) {
            System.out.println("no");
            return;
        }
        System.out.println("yes");
    }
}