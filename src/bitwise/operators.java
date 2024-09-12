package bitwise;

public class operators {
    public static void main(String[] args) {
        // int a =10;
        // int b=a>>1;
        // int c =a<<1;
        // System.out.println(isevenorod(41));
        // int[] arr={2,3,4,1,2,1,3,6,4};
        // System.out.println(duplicates(arr));
        // System.out.println(ans(arr));
       // System.out.println(nthbite(3, 0));
    //    System.out.println(decimalToBinary(5));
    //    System.out.println(setIthbit(8, 1));
    //    //System.out.println(printithbit(8, 3));
    //    System.out.println(resetIthbit(9, 4));
    System.out.println(resetIthbit(9, 4));
    }
    public static String isevenorod(int n ){
        if((n & 1)==1){
            return "odd";
        }
        return "even";
    }
    private static int ans (int[] arr) {
        int unique = 0;
        for(int n: arr) { 
            unique ^= n;
        }
        return unique;
    }
    public static int nthbite(int a,int n){
        return (a | n);
    }
    public static int duplicates(int[] arr){
        for(int i=0;i<arr.length;i++){
            int a=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    a++;
                }
            }
            if(a<2){
                return arr[i];
            }
        }
        return -1;
    }
    public static String decimalToBinary(int decimal){
        StringBuilder binary = new StringBuilder();
        while(decimal>0){
            int a = decimal%2;
            binary.append(a);
            decimal/=2;
        }
        return binary.reverse().toString();
    }
    public static int setIthbit(int decimal,int ith ){
        return (decimal| 1<<(ith-1));
    }
    public static int printithbit(int decimal,int ith ){
        return decimal&(1<<(ith-1));
    }
    public static int resetIthbit(int decimal,int ith ){
        return ( decimal & ~(1<<ith-1));
    }

    
}
