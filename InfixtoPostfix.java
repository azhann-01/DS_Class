import java.util.*;

public class InfixtoPostfix {

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == ' ')
                continue;

            if (Character.isDigit(ch)) {
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    result.append(exp.charAt(i));
                    i++;
                }
                result.append(" ");
                i--;
            }

            else if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                    result.append(" ");
                }

                if (!stack.isEmpty())
                    stack.pop();
            }

            else {
                while (!stack.isEmpty()
                        && stack.peek() != '('
                        && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                    result.append(" ");
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine();

        System.out.println("Postfix: " + infixToPostfix(infix));

        sc.close();
    }
}