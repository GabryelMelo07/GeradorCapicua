import java.util.Scanner; 

public class verificador {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int num1, num2, num3, mult1, mult2, mult3, total = 0, tamanho = 20;
        int[] vet = new int[tamanho];
        int[] newVet = new int[1];
        int c = 0;

        //Verificando se é múltiplo de 7.
        System.out.println("Multiplo de 7:");
        System.out.println();

        while(true){

            System.out.print("Informe os 3 numeros: ");
            num1 = in.nextInt();

            if( num1 == -1 ){
                break;
            }
            num2 = in.nextInt();
            num3 = in.nextInt();

            mult1 = num1 * 2;
            mult2 = num2 * 3;
            mult3 = num3 * 1;

            total = mult1 + mult2 + mult3;

            if( c % 2 != 0 ){
                total = total * (-1);
            }
            
            System.err.println("Resultado: " + total);
            
            vet[c] = total;
            newVet[0] = newVet[0] + vet[c];

            total = 0;
            c++;
        }
        
        //Mostra o vetor com todas multiplicações
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();

        //Mostra o novo vetor com o resultado da soma das multiplicações
        for (int i = 0; i < newVet.length; i++) {
            System.out.print("Soma: " + newVet[i] + " ");
        }
        System.out.println();

        if( newVet[0] % 7 == 0){
            System.out.println("Multiplo de 7!");
        }
        
        newVet[0] = 0;
        
        //Verifica se é múltiplo de 13.
        System.out.println();
        System.out.println("Multiplo de 13:");
        System.out.println();

        c = 0;

        while(true){

            System.out.print("Informe os 3 numeros: ");
            num1 = in.nextInt();
            if( num1 == -1 ){
                break;
            }
            num2 = in.nextInt();
            num3 = in.nextInt();

            mult1 = num1 * 4;
            mult2 = num2 * 3;
            mult3 = num3 * (-1);

            total = mult1 + mult2 + mult3;

            System.err.println("Resultado: " + total);

            vet[c] = total;
            newVet[0] += vet[c];

            total = 0;
            c++;
        }

        //Mostra o vetor com todas as multiplicações
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");         
        }
        System.out.println();

        //Mostra o novo vetor com o resultado da soma das multiplicações
        for (int i = 0; i < newVet.length; i++) {
            System.out.print("Soma: " + newVet[i] + " ");
        }
        System.out.println();

        if( newVet[0] % 13 == 0){
            System.out.println("Multiplo de 13!");
        }
        
        //Verifica se é múltiplo de 11.
        System.out.println();
        System.out.println("Multiplo de 11: ");
        System.out.println();

        int valor, par = 0, impar = 0;
        int[] vet11 = new int[58];
 
        
        while(true){

            System.out.print("Informe os valores: ");
            valor = in.nextInt();

            if( valor == -1 ){
                break;
            }
            
            vet11[c] = valor;

            if(vet11[c] == 0 || vet11[c] % 2 == 0){
                par += vet11[c];
            }

            if(vet11[c] % 2 != 0){
                impar += vet11[c];
            }
            
            total = impar - par;

            c++;
        }
        
        System.out.println("Resultado total: " + total);
        System.out.println();
        
        if(total % 11 == 0){
            System.out.println("Multiplo de 11!");
        } System.out.println();
        
        System.out.println("Pares: " + par + "\nImpares: " + impar);

        total = 0;

        //Meus numeros gerados pelo gerador de multiplos:
        //13 = 247 359 848 773 163 750 V
        //13 = 486 214 799 030 498 824 V
        //13 = 428 926 402 315 720 127 V
        //7 = 260 612 590 872 399 304 V
        //7 = 090 173 714 292 588 962 V
        //7 = 179 457 492 991 788 172 V

        //Numeros do professor
        //271 202 172 944 816 908 549 415 283 779 332 607 228 815 212 659 663 507 352 700

        in.close();
    }
}