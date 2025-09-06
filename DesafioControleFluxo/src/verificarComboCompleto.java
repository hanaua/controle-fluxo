import java.util.Scanner;

public class verificarComboCompleto {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String servicosContrataveis = "movel,banda larga,tv";
        String entrada = scanner.nextLine().trim();
        String[] servicos = entrada.split(",");
        
        boolean movelContratada = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;
        for (int j = 0; j < servicos.length; j++) {
            
            if (servicos[j].trim().equalsIgnoreCase("movel")) {
                movelContratada = true;
            } else if (servicos[j].trim().equalsIgnoreCase("banda larga")) {
                bandaLargaContratada = true;
            } else if (servicos[j].trim().equalsIgnoreCase("tv")) {
                tvContratada = true;
            }
            
        }

        // TODO: Verifique se todos os serviços foram contratados
        if (movelContratada && bandaLargaContratada && tvContratada) {
            System.out.println("Combo Completo");
        } else {
            System.out.println("Combo Incompleto");
        }
        scanner.close();
    }
}