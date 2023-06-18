import java.util.Scanner;

public class Question1 {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        } 
        int lo = 2, hi = x / 2;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long sq = 1L * mid * mid;
            if (sq > x) 
                hi = mid - 1;
            else if (sq < x)
                lo = mid + 1;
            else 
                return mid;
        }
        return hi;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value::");
        int x=s.nextInt();
        Question1 q=new Question1();
        q.mySqrt(x);
    }
}