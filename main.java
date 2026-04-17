import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Criamos apenas UM scanner para o programa todo
        Scanner rd = new Scanner(System.in);

        System.out.println("-----Sistema de calculadora-----");

        // --- Primeiro Número ---
        System.out.println("Digite o primeiro número:");
        int a;
        try {
            // Lemos a LINHA toda e tentamos converter
            a = Integer.parseInt(rd.nextLine());
        } catch (NumberFormatException e) {
            a = 0; 
            System.out.println("Entrada inválida! Definindo como 0.");
        }

        // --- Segundo Número ---
        System.out.println("Digite o segundo número:");
        int b;
        try {
            b = Integer.parseInt(rd.nextLine());
        } catch (NumberFormatException e) {
            b = 0; 
            System.out.println("Entrada inválida! Definindo como 0.");
        }

        // --- Operação ---
        System.out.println("Qual operação quer (+, -, *, /):");
        String o = rd.nextLine();

        switch (o) {
            case "+":
                System.out.println("Resultado: " + (a + b));
                break;
            case "-":
                System.out.println("Resultado: " + (a - b));
                break;
            case "*":
                System.out.println("Resultado: " + (a * b));
                break; 
            case "/":
                if (b != 0) {
                    System.out.println("Resultado: " + (a / b));
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default: 
                System.out.println("Opção inválida!");
        }
        boolean c = Boolean.parseBoolean(rd.nextLine());
        System.out.println("Ele é rea"+ c);
        
        rd.close();
    }
}