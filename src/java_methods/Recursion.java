public class Recursion {
    public static void main(String[] args) {
        //recursion
        System.out.println(fibonacci(7));
    }
    //recursion method fibonacci
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}