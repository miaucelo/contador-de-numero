import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;
        boolean parametrosValidos = false;

        while (!parametrosValidos) {
            System.out.println("Digite o primeiro número");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo número");
            parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
                parametrosValidos = true; 

            } catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo número deve ser maior que o primeiro! Tente novamente.");
            }
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
