package Func;

public class Palindrome {
    public static boolean isPalindrome(int n){
        int real = n;
        int sum = 0;

        while(n>0){
            int lastDigit = n%10;
            sum = sum*10 + lastDigit;
            n /= 10;
        }

        return real == sum;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(111));
        System.out.println(isPalindrome(112));
    }
}