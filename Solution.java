package Experiment5;
class See {
    public static void printHello() {
        System.out.println("HI");
    }
    
    private int num1 = 10;
    private int num2 = 20;
}
public class Solution extends See {

    public static void main(String[] args) {
        Solution s2=new Solution();
        int sum=s2.num1+s2.num2;
        System.out.println(sum);
    }
}
