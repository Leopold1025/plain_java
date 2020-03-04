package algorithm;

/**
 * 斐波那契数列
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(f(7));
    }

    /**
     * 计算出数列中第(n+1)个数的值
     * @param n
     * @return
     */
    public static int f(int n){
        if (n==1 || n==2){
            return 1;
        } else {
            return f(n-1) + f(n-2);
        }
    }
}
