package week3DSAQues;

public class Factorial {
    int factorial(int n){
        if (n==0){
            return 1;
        }

        int choti=factorial(n-1);
        int badi=choti*n;
        return badi;
    }

    public static void main(String args[]){
        Factorial f=new Factorial();
        System.out.println(f.factorial(3));
    }
}
