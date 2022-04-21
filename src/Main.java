import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GenericStack<Integer> stack = new GenericStack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
