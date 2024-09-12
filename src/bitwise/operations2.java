package bitwise;

public class operations2 {
    public static int rightmostset(int decimal ){
        StringBuilder binary= new StringBuilder();
        int a=decimal;
        while(a>0){
            int r = a%2;
            binary.append(r);
            a/=2;
        }
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)==1){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(rightmostset(10));
    }
    
}
