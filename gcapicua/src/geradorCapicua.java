import java.math.BigDecimal;
import java.util.Random;

public class geradorCapicua {

    public static void main(String[] args) {
        
        boolean passou = false;

        while(passou == false){

            Random gerador = new Random();

            String numString = "";
    
            BigDecimal bigdecimal0 = new BigDecimal(0);
            BigDecimal bigdecimal7 = new BigDecimal(7);
            BigDecimal bigdecimal11 = new BigDecimal(11);
            BigDecimal bigdecimal13 = new BigDecimal(13);
    
            for( int i = 0; i < 54; i++){
                int primeiros_54 = gerador.nextInt(10);
                
                numString = numString + Integer.toString(primeiros_54);
                
            }
    
            numString += 0;
    
            for( int j = numString.length() - 1; j > 0; j--){
    
              numString += numString.substring(j - 1, j);
    
            }
    
            BigDecimal bignum = new BigDecimal(numString);
    
            if(numString.charAt(0) != '0'){
                passou = true;
            } else {
                passou = false;
            }           
            
            if(passou == true){
                int a,b,c;
                b = 1;
                c = 2;
        
                for(a=0;c<numString.length(); a++){
                    numString.charAt(a);
                    numString.charAt(b);
                    numString.charAt(c);
                    if(numString.charAt(a) == numString.charAt(b) && numString.charAt(b) == numString.charAt(c)){
                      passou = false;
                      break;
                    } 
                    
                    b++;
                    c++;
                    passou = true;                             
                }
            }

            if(passou == true){
                if(bignum.remainder(bigdecimal7).equals(bigdecimal0) && bignum.remainder(bigdecimal11).equals(bigdecimal0) && bignum.remainder(bigdecimal13).equals(bigdecimal0)){
                    passou = true;
                } else { passou = false; }
            }        

            if(passou == true){
                int num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
                num0 = 0; num1 = 0; num2 = 0; num3 = 0; num4 = 0;
                num5 = 0; num6 = 0; num7 = 0; num8 = 0; num9 = 0;
                
                for(int k = 0; k < numString.length(); k++){
                                                                                                                                                                                       
                    if(numString.charAt(k) == '0'){
                        num0++;                                                                                                                                                                           
                    } if(numString.charAt(k) == '1'){
                        num1++;                                                                                                                                                                          
                    } if(numString.charAt(k) == '2'){
                        num2++;                                                                                                                                                           
                    } if(numString.charAt(k) == '3'){
                        num3++;                                                                                                                                                                            
                    } if(numString.charAt(k) == '4'){
                        num4++;                                                                                                                                                                    
                    } if(numString.charAt(k) == '5'){
                        num5++;                                                                                                                                                                          
                    } if(numString.charAt(k) == '6'){
                        num6++;                                                                                                                                                                      
                    } if(numString.charAt(k) == '7'){
                        num7++;                                                                                                                                                                       
                    } if(numString.charAt(k) == '8'){
                        num8++;                                                                                                                                                              
                    } if(numString.charAt(k) == '9'){
                        num9++;                                                                                                                                                                            
                    }                   
                }
                
                if (num0 >= 9 && num1 >= 9 && num2 >= 9 && num3 >= 9 && num4 >= 9 && num5 >= 9 && num6 >= 9 && num7 >= 9 && num8 >= 9 && num9 >= 9){
                    passou = true;
                    System.out.printf("num0: %d, num1: %d, num2: %d, num3: %d, num4: %d, num5: %d, num6: %d, num7: %d, num8: %d, num9: %d\n", num0, num1, num2, num3, num4, num5, num6, num7, num8, num9);
                } else { passou = false; }
            }
           
            if(passou == true){
                System.out.println(numString);
            }
           
        }

    }

}