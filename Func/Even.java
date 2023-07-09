package Func;

public class Even {
    public static boolean isEven(int n){
        return n%2==0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(isEven(11));
    }
}
