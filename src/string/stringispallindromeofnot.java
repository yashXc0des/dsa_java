package string;

public class stringispallindromeofnot {
    public static boolean isPlaindrome(String s){
        int start =0;
        int end = s.length()-1;
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String a ="rar";
        System.out.println(isPlaindrome(a));
    }
    
}
