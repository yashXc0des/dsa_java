package questionarray.leetcodedailyquestions;

public class findstudentthatwilllreplcaechalk {
    public static int chalkReplacer(int[] chalk, int k) {
        int start=0;
        while(start<chalk.length){
            if(chalk[start]<=k){
                if(start<chalk.length-1){
                    k-=chalk[start];
                    start++;
                }else if(start==chalk.length-1){
                    k-=chalk[start];
                    start=0;
                }
            }else{
               break;
            }
        }
        return start;
        
    }
    public static void main(String[] args) {
        int[] arr={5,1,5};
        int ans = chalkReplacer(arr, 22);
        System.out.println(ans);
    }
}
