package BigInt;
import java.math.BigInteger;

public class Step10000 {
        public static void main(String[] args){
            System.out.println("Programm BigInteger 2^10000: ");
            BigInteger Stepen;
            Stepen=BigInteger.valueOf(2);
            Stepen=Stepen.pow(10000);
            System.out.println("Stepen 2^10000= "+Stepen);
        }
    }
