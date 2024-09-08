package string;

public class s {
    public static void main(String[] args) {
        //this uses same refrence from heap
        String a="yash";
        String b =a;

        System.out.println(a==b);
        //this uses diffirent refrences
        String c= new String("yash");
        String d =new String("yash");
        System.out.println(c==d);
    }
    
}
