package maths;

public class isprime {
    public static void primes(int n){
        boolean[] Primes= new boolean[n+1];
        seive(n, Primes);
        for (int i = 0; i < Primes.length; i++) {
            System.out.println(i+" "+Primes[i]);
        }
    }
    public static void seive(int n , boolean[] Primes){
        for(int i=2;i*i<=n;i++){
            if(Primes[i]==false){
                for(int j=i*2;j<=n;j+=i){
                    Primes[j]=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        primes(40);
    }
}
