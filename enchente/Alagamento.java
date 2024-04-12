import java.util.Scanner;
import java.util.Random;

public class Alagamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a cidade:");
        String cidade = scanner.nextLine();
        
        
        Random random = new Random();
        int chuva = random.nextInt(101);
        int vento = random.nextInt(50);
        double temperatura = random.nextDouble() * 40;
        
        String temperaturaFormatada = String.format("%.2f", temperatura);
        
        System.out.println("Temos algumas informações importantes sobre a sua região:");
        System.out.println("Chuva: " + chuva + "%");
        System.out.println("Vento: " + vento + " km/h");
        System.out.println("Temperatura: " + temperaturaFormatada + "°C");
        
        System.out.println("Escolha o bairro:");
        System.out.println("1 - Centro");
        System.out.println("2 - Japiim");
        System.out.println("3 - Educandos");
        int opcao = scanner.nextInt();
        
        int nivelAgua = 23;
        
        switch (opcao) {
            case 1:
                System.out.println("Bairro: Centro");
                System.out.println("Cidade: " + cidade);
                System.out.println("Nível de água: " + nivelAgua + "m");
                if (nivelAgua > 25) {
                    System.out.println("Esteja preparada para evacuar de sua casa, lembre-se de deixar os móveis e eletrodomésticos em lugares altos para que não sofram perda.");
                } else if (nivelAgua >= 30) {
                    System.out.println("Evacuação de emergência necessária.");
                } else if (nivelAgua < 24) {
                    System.out.println("Em sua localização está tudo certo, pode ficar tranquilo, que iremos alertar caso algo de diferente estiver acontecendo.");
                }
                break;
            case 2:
                System.out.println("Bairro: Japiim");
                System.out.println("Cidade: " + cidade);
                System.out.println("Nível de água: " + nivelAgua + "m");
                break;
            case 3:
                System.out.println("Bairro: Educandos");
                System.out.println("Cidade: " + cidade);
                System.out.println("Nível de água: " + nivelAgua + "m");
                
                break;
            default:
                System.out.println("Opção inválida");
        }
        
        scanner.close();
    }
}
