import java.math.BigDecimal;
import java.util.Random;

public class vf {
    
    public static void main(String[] args) {
        
        boolean passou = false;

        while(passou == false){

            Random gerador = new Random();

            String numString = "";
            String numString11 = "";
            String numString13 = "";

            BigDecimal bigdecimal0 = new BigDecimal(0);
            BigDecimal bigdecimal7 = new BigDecimal(7);
            BigDecimal bigdecimal11 = new BigDecimal(11);
            BigDecimal bigdecimal13 = new BigDecimal(13);
    
            // Gera um numero e verifica se é múltiplo de 7.

            for( int i = 0; i < 18; i++){
                int primeiros_18 = gerador.nextInt(10);
                
                numString = numString + Integer.toString(primeiros_18);
                
            }

            BigDecimal bignum = new BigDecimal(numString);

            if(bignum.remainder(bigdecimal7).equals(bigdecimal0)){
                passou = true;

                // Gera um numero e verifica se é múltiplo de 13.

                for( int i = 0; i < 18; i++){
                    int primeiros_18 = gerador.nextInt(10);
                
                    numString13 = numString13 + Integer.toString(primeiros_18);
                
                }
            
                BigDecimal bignum13 = new BigDecimal(numString13);
            
                if(bignum13.remainder(bigdecimal13).equals(bigdecimal0)){
                    passou = true;

                    // Gera um numero e verifica se é múltiplo de 11.

                    for( int i = 0; i < 18; i++){
                        int primeiros_18 = gerador.nextInt(10);
                
                        numString11 = numString11 + Integer.toString(primeiros_18);
                
                    }

                    BigDecimal bignum11 = new BigDecimal(numString11);

                    if(bignum11.remainder(bigdecimal11).equals(bigdecimal0)){
                        passou = true;
                    } else {
                        passou = false;
                    }
                } else {
                    passou = false;
                }    
                   
            } else {
                passou = false;
            }

            if( passou == true ){
                System.out.println("Multiplo de 7: " + numString);
                System.out.println("Multiplo de 11: " + numString11);
                System.out.println("Multiplo de 13: " + numString13);
            }

        }
    }
}
