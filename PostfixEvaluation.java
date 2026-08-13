import java.util.*;

public class PostfixEvaluation {

    static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        String[] tokens = exp.split("\\s+");

        for (String token : tokens) {

            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            }

            else {
                int b = stack.pop();
                int a = stack.pop();

                switch (token.charAt(0)) {
                    case '+':
                        stack.push(a + b);
                        break;

                    case '-':
                        stack.push(a - b);
                        break;

                    case '*':
                        stack.push(a * b);
                        break;

                    case '/':
                        stack.push(a / b);
                        break;

                    case '%':
                        stack.push(a % b);
                        break;

                    case '^':
                        stack.push((int) Math.pow(a, b));
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter postfix expression: ");
        String postfix = sc.nextLine();

        System.out.println("Result: " + evaluatePostfix(postfix));

        sc.close();
    }
}