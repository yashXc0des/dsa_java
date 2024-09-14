package recurssion;

public class video27 {
    public static void printseriesreverse(int n){
        if(n==0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printseriesreverse(n-1);
    }
    public static void printseries(int n,int a){
        if(a==n){
            System.out.println(a);
            return;
        }
        System.out.println(a);
        printseries(n,a+1);
    } 
    public static void printseriesnew(int n){
        if(n==0){
            return;
        }
        
        printseriesnew(n-1);
        System.out.println(n);
    } 
 
    public static void printseriesboth(int n){
        if(n==0){
            return;
        }
        System.out.println(n); 
        printseriesboth(n-1);
        System.out.println(n);
    } 
    public static int factorial(int n,int sum){
        if(n<=1){
         return sum;
        }
        sum*=n;
        return factorial(n-1, sum);
    }
    public static int factorialbetter(int n){
        if(n<=1){
        return 1 ;
        }
        return n * factorialbetter(n-1);
    }
    public static int sumofdigits(int n){
        if(n<=0){
            return n;
        }
        return n %10+sumofdigits(n/10);
    }
    public static int productofdigits(int n){
        if(n<10){
            return n;
        }
        return n %10*productofdigits(n/10);
    }
    public static int reverseanumber(int n){
        int sum =0;
        static int rev1(int n){

        }
        
    }


    public static void main(String[] args) {
        //printseriesboth(10);
        System.out.println(factorialbetter(3)
        ); 
        //System.out.println(sumofdigits(2345));   
        //System.out.println(productofdigits(123450));
        System.out.println(reverseanumber(12345));
    }
    

    
}
