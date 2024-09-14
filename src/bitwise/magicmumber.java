package bitwise;

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
                for(int i=0;i<8;i++){
                    int num= (n>>i)&1;
                    if(num==1){
                        magicnumber+=Math.pow(5, i+1);
                    }
                }
                return magicnumber;
            }


        
        public static void main(String[] args) {
        //System.out.println(nthMagicnumber(4));
          // Example array where every number appears 3 times except one number
          int[] arr = {5, 3, 5, 3, 5, 3, 7};
          int n = 3; // All numbers except one appear 3 times
          
          int uniqueNumber = uniquenumber(arr, n);
        //   System.out.println(uniqueNumber);
        System.out.println(nthMagicNumberNonBitwise(3));
        System.out.println(magicnumberbitwise(3));
    }
}
