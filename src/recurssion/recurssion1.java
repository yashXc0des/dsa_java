package recurssion;
public class recurssion1 {

    public static void main(String[] args) {
        numbersreturn(1,10);
    }
    public static void  returnrecc(int a, int n){
        if(a==n){
            System.out.println(n);
            return;
        }
        System.out.println(a);
        returnrecc(a+1,n);
    }
    public static void numbersreturn(int start ,int end){
        returnrecc(start,end);
    }
}
