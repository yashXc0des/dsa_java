package questionarray;

public class evennumberofdigitsinarray {
    public static void main(String[] args) {
        int[] arr={23,3,4334,333,234444};
        System.out.println(noofeven(arr));
    
    
    }
    static int noofeven(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            // if(iseven(arr[i])){
            //     count++;
            // }
            if(noofdigits(arr[i])%2==0){
                count++;
            }
        }
        return count;
    }
    static boolean iseven( int a ){
        String s= String.valueOf(a);
        boolean result;
        if(s.length()%2==0){
             result =true;
        }
        else{
            result =false;
        }
        return result;
    }
    static int noofdigits(int a){
        int count=0;
        while(a>0){
            count++;
            a/=10;
        }
        return count;
    }
    
}
