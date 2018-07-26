package lab1;

public class FibonacciSolution {

    public static int recursiveFibonacci(int n){
        if(n == 1 || n == 0)
            return 1;
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }

    public static void main(String... args){
        System.out.println(recursiveFibonacci(5));
    }

    public static int iteratoveFibonacci(int n){
        int total = 0;
        int prev = 1;
        for(int i = 0; i < n;i++){
            int temp = prev;
            total+=prev;
        }
    }
}