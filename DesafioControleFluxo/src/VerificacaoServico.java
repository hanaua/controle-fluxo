import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        String[] partes = entradaCliente.split(",");

        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        
        boolean encontrado = false;
        for (int j = 0; j <partes.length; j++) {
            if (partes[j].equalsIgnoreCase(servico)) {
            encontrado = true; // marcou que encontrou o serviço
            break;
            }
        }
            if (encontrado) {
            System.out.println("Sim");
            } 
            else {
            System.out.println("Nao");
            }

        scanner.close();
    }
}