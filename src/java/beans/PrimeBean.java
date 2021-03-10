
package beans;

public class PrimeBean implements java.io.Serializable{
    private static final long max = 9223372036854775783L;
    private long prime = 2;

    public PrimeBean() {
    }

    public long getPrime() {
        return prime;
    }
    
    public void setPrime(long p)throws Exception{
        if(!isPrime(p))throw new Exception("Illegal prime number");
    }

    private boolean isPrime(long p) {
        if(p == 2 || p == 3 || p == 7 || p == 9)return true;
        if(p < 11 || p % 2 == 0)return false;
        for(long t = 3, m = (long)Math.sqrt(p) + 1; m <= t; t += 2 ) if (p % t == 0)return false;
        return true;
    }
    public boolean Next(){
        if(prime < max){
            if(prime == 2)prime = 3;
            else for (prime += 2; !isPrime(prime); prime += 2);
                return true;
        }return false;
    }
        public boolean previous(){
        if(prime > 2){
            if(prime == 3)prime = 2;
            else for (prime -= 2; !isPrime(prime); prime -= 2);
                return true;
        }return false;
    }
}

