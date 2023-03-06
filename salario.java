import java.util.Scanner;


public class salario {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int SalarioNovo, SalarioAtual;
        
        
        
        System.out.println("Informe o valor do salário atual : ");
        SalarioAtual = input.nextDouble();

        System.out.println("Informe o valor do salário novo : ");
        SalarioNovo = input.nextDouble();

        SalarioNovo = SalarioAtual * 1.15;

        

        

    }
}

}
