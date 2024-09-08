package patterns;

public class patterns {
    public static void main(String[] args) {
        pattern31(4);
    }
    public  static void pattern1(int length){
        for(int i =0;i<length;i++){
            for(int j=0;j<length;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int length){
        for(int i=0;i<length;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void pattern3(int length){
        for(int i=length;i>0;i--){
            for(int j=0;j<i;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(int length){
        for(int i=1;i<=length;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int length){
        for(int i=0;i<length*2;i++){
            int col=i;
            if(i>length){
                col=2*length-i;
            }
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern6(int length){
        for(int i=1;i<=length;i++){
            for(int j=0;j<length-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern7(int length){
        for(int i =0;i<length;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<length-i;j++){
                System.out.print("*");
            }
            

            System.out.println();
        }
    }
    public static void pattern8(int length){
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern9(int length){
        for(int i=0;i<length;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<length*2-i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern10(int length){
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern11(int length){
        for(int i=0;i<length;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<length-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern12(int length){
        for(int i=0;i<length*2;i++){
            int colspace=i;
            if(i>=length){
                colspace=length*2-i-1;
            }
            for(int j=0;j<colspace;j++){
                System.out.print(" ");
            }
            int colstart=length-i;
            if(i>=length){
                colstart =i-length+1;
            }
            for(int j=0;j<colstart;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern28(int length){
        for(int i=0;i<length*2;i++){
            int colspace =length-1-i;
            if(i>=length){
                colspace=i-length+1;
            }
            for(int j=0;j<colspace;j++){
                System.out.print(" ");
            }
            int colstart=i+1;
            if(i>=length){
                colstart=length-i+length-1;
            }
            for (int j = 0; j <colstart; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern30(int length){
        for(int i=1;i<=length;i++){
            for(int j=0;j<length-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);  
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern17(int length){
        for(int i=1;i<length*2;i++){
            int colspace=length-i;
            if(i>length){
                colspace=i-length;
            }
            int colnumbers=i;
            if(i>length){
                colnumbers=length*2-i;
            }
            int colnumner2=i;
            if(i>length){
                colnumner2=length*2-i;
            }
            for(int j=1;j<=colspace;j++){
                System.out.print("_");
            }
            for(int j=colnumbers;j>0;j--){
                System.out.print(j);  
            }
            for(int j=2;j<=colnumner2;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern31(int length) {
        int size = 2 * length - 1; // This will be 7 for length = 5
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Find the minimum distance to any edge
                int minDistance = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                // Calculate the value to print based on the distance from the nearest edge
                int value = length - minDistance;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    

    }

     
