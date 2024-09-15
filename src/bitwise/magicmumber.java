package bitwise;

import java.util.Arrays;

public class magicmumber {
    public static int nthMagicnumber(int n){
            StringBuilder binaryRepresentation = new StringBuilder();
            int a = n ;
            // Convert the number to its binary representation
            while (a > 0) {
                int remainder = a % 2;      // Get the remainder (0 or 1)
                binaryRepresentation.append(remainder); // Append the remainder to the binary string
                a /= 2; // Divide by 2 for the next bit
            }
            // The binary representation is in reverse order
            binaryRepresentation.reverse();
            // Convert binary string to integer
            int result = Integer.parseInt(binaryRepresentation.toString(), 2);
            return result;
        }
            public static int uniquenumber(int[] arr, int n){
                int result=0;
                for(int i=0;i<8;i++){
                    int sum =0;
                    for(int num:arr){
                        sum+=(num>>i)&1;
                    }
                    if(sum%n!=0){
                        result=result|(1<<i);
                    }
                }
                return result;
            }
            public static int nthMagicNumberNonBitwise(int n) {
                int decimal = n;
                int magicalNumber = 0;
                StringBuilder binary = new StringBuilder();
                // Convert the decimal number to binary
                while (decimal > 0) {
                    int a = decimal % 2;
                    binary.append(a);
                    decimal /= 2;
                }
                // Reverse the binary string to get the correct bit order
                String binaryNumber = binary.reverse().toString();
                int length = binaryNumber.length();
                // Calculate the magic number based on powers of 5
                for (int i = 0; i < binaryNumber.length(); i++) {
                    // Convert character to integer (0 or 1)
                    int bit = binaryNumber.charAt(i) - '0';  // Converts char to int (0 or 1)
                    // Add to the magical number if the bit is 1
                    if (bit == 1) {
                        magicalNumber += Math.pow(5, length - i );  // Use the correct power of 5
                    }
                }          
                return magicalNumber;
            }


            public static int magicnumberbitwise(int n){
                int magicnumber=0;
                for(int i=0;i<32;i++){
                    int num= (n>>i)&1;
                    if(num==1){
                        magicnumber+=Math.pow(5, i+1);
                    }
                }
                return magicnumber;
            }
            public static boolean isPowerOf2(int n){
                int totalbits=0;
                for(int i =0;i<32;i++){
                    int num =(n>>i)&1;
                    if(num==1){
                        totalbits++;
                    }
                }
                if(totalbits==1){
                    return true;
                }
                return false;
            }
            public static int powerofnumber(int n , int b){
                int result=1;
                for(int i=0;i<32;i++){
                    int  num = (b>>i)&1;
                    if(num==1){
                        result*=Math.pow(n, Math.pow(2, i));
                    }
                }
                return result;
            }


        public static int[][] flipAndInvertImage(int[][] image) {
            for(int i=0;i<image.length;i++){
                int length=image[i].length;
                for(int j=0;j<image[i].length/2;j++){
                    if(image[i][j]!=image[i][length-1]){
                        int tamp=image[i][j];
                        image[i][j]= image[i][length-1];
                        image[i][length-1]=tamp;
                    }
                    length--;

                }
                for(int a=0;a<image[i].length;a++){
                    if(image[i][a]==0){
                        image[i][a]=1;
                    }else{
                        image[i][a]=0;
                    }
                }
            }
            return image;
        }
        public static  boolean isPrime(int n){
            if(n<=1){
                return false;
            }
            int c =2;
            while(c*c<=n){
                if(n%c==0){
                    return false;
                }
                c++;
            }
            return true;
        }
        public static void main(String[] args) {
            // int[][] image={{1,1,0},{1,0,1},{0,0,0}};
            // flipAndInvertImage(image);
            // System.out.println(Arrays.deepToString(image));
            for(int i=1;i<20;i++){
                System.out.println(i+" "+isPrime(i));
            }
    }
    
}
