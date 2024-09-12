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
        public static void main(String[] args) {
        System.out.println(nthMagicnumber(4));
    }
}
