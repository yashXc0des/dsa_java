package recurssion;

public class factiorial {
    public static int factorialofnumber(int n){
        int factsum=1;
        while(n>0){
            factsum*=n;
            n--;
        }
        return factsum;
    }
    public static int factorialrecc(int a,int factsum){
        if(a==1){
            return factsum;
        }
           return a* factorialrecc(a-1, factsum);
    }

    public static void main(String[] args) {
        System.out.println(factorialofnumber(4));
        System.out.println(factorialrecc(4, 1));
    }
    
}
