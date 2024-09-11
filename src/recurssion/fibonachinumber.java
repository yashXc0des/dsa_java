package recurssion;

public class fibonachinumber {
    public static void Fibonachinumber(int n){
        if(n==1){
            System.out.println(0);
            return;
        }
        if(n==2){
            System.out.println(1);
            return;
        }
        int a=0;
        int b=1;
        for(int i=0;i<=n-2;i++){
            int c=a+b;
            int temp=b;
            a=temp;
            b=c;

        }
        System.out.println(a);
    }
    public static int reccfactorial(int n){
        if(n<2){
            return n;
        }
        return reccfactorial(n-1)+reccfactorial(n-2);
    }
    public static int fibonachigoldenratio(int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2), n)-Math.pow(((1-Math.sqrt(5))/2), n))/Math.sqrt(5.0));
    }
    public static void main(String[] args) {
       Fibonachinumber(5);
       for (int i = 0; i < 10; i++) {
        System.out.println(fibonachigoldenratio(i));
       }
    }

    
}
