import java.util.Scanner;


public class GabrielBreier {
             
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n1;
            
            System.out.println("Informe o primeiro numero: ");
            n1 = input.nextInt();

            if(n1 > 0){
                System.out.println("Seu numero é positivo: ");

            }else if(n1 < 0){
                System.out.println("Seu número é negativo: ");

            }else{
                System.out.println("Seu número é zero: ");
            }
        }    
        
    }
    
   
    



