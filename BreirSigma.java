import java.util.Scanner;

public class BreirSigma {
    
    public static void main(String[] args){
              Scanner input = new Scanner (System.in);
              String nome;
              int idade;
              
              System.out.println("insira seu nome : ");
              nome = input.next();

              System.out.println("insira sua idade : ");
              idade = input.nextInt();

            

              if (idade >= 0 && idade <= 12 )
              {
                  System.out.print("você é criança \n");
      
              } else if (idade >= 13 && idade <= 17) {
                  System.out.print("você é adolescente \n");
              }else if (idade >= 18 && idade <= 59) {
                  System.out.print("você é adulto\n");
              } else if (idade >= 60){
                  System.out.print("você é idoso \n");
              }    
          }
      
        
    } 

