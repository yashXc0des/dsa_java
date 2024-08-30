package questionarray;

public class linersearchinstring {
    public static void main(String[] args) {
        //int[] arr ={1,24,34,53,41,23,1234,23,12,31,13,3,234,23};
        String name ="Yash Parashar";
        char target ='a';
        search(name, target);


    }
    static void search( String name , char target){
        if(name.length()==0){
            System.out.println("empity string");
        }
        else{
            for(int i=0 ; i<name.length();i++){
                if(name.charAt(i)==target){
                    System.out.println("YOUR CHARACTER EXIST AT "+i +"index");
                    
                }
            }
        }
    }
}
