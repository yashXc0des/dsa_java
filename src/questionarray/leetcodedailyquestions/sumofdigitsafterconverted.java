package questionarray.leetcodedailyquestions;

public class sumofdigitsafterconverted {
    public  static int getLucky(String s, int k) {
        return -1;

        
    }
    public static String converttoInt(String s){

        int[] arr= new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int a =(int)(s.charAt(i) - 'a' + 1);
            arr[i]=a;
        }
        
        return arr.toString();
    }
    public static void main(String[] args) {
        String a ="b";
        System.out.println(converttoInt(a));
    }
    public static int loopsum(String S){
        return -1;
        

    }
    
}
