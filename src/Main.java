import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.size());
        stack.push(40);
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.clear();
        System.out.println(stack.size());
    }

}
