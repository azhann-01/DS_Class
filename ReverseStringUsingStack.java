import java.util.Scanner;

public class ReverseStringUsingStack {
    static final int MAX = 100;
    static char[] stack = new char[MAX];
    static int top = -1;

    static void push(char p) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = p;
        }
    }

    static char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0';
        }
        return stack[top--];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int l = str.length();
        char[] result = new char[l];

        for (int i = 0; i < l; i++) {
            push(str.charAt(i));
        }

        for (int i = 0; i < l; i++) {
            result[i] = pop();
        }

        System.out.println("Reversed String is: " + new String(result));

        sc.close();
    }
}