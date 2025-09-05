import java.util.Scanner;

public class Contador {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o parametro 1:");
            int parametro1 = entrada.nextInt();
            System.out.println("Digte o parametro 2:");
            int parametro2 = entrada.nextInt();
            
           
            try {
               contar(parametro1 - parametro2);
               System.out.println("contagem executada com sucesso");
            }catch (Exception e) {
               System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }

        // Método contar adicionado para corrigir o erro
        public static void contar(int numero) throws Exception {
            if (numero < 0) {
                throw new Exception("O parâmetro 2 deve ser maior que o parâmetro.");
            }
            for (int i = 1; i <= numero; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }