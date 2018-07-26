package lab1;

public class GCD {

    public static int gcd(int a, int b) {
        int min = findMinOfTwo(a,b);
        if(a % min == 0 && b % min == 0)
            return min;
        int commonFactor = 1;
        for(int i = 2; i < min/2; i++){
            if(a % i == 0 && b % i == 0){
                commonFactor = i;
            }
        }
        return commonFactor;
    }

    public static int findMinOfTwo(int a, int b) {
        return a > b ? b : a;
    }

    public static void main(String... args){
        System.out.println(gcd(6,30));
    }
}
