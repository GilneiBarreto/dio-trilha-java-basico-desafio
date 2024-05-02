import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        for(int i = 0; i < limiteDiario; i++){
            
            double valorSaque = scanner.nextDouble();
            
            if(valorSaque == 0){
                System.out.println("Transacoes encerradas.");
                break;
            }
            if(limiteDiario > valorSaque){
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

        }
        scanner.close(); 
    }
}