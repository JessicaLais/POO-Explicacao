package revisao.ferramenta;
import revisao.ClasseExecutavel;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número da operação: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite a OPERAÇÃO (+   -   *  /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo número da operação: ");
        double numero2 = scanner.nextDouble();

        double resultado = ClasseExecutavel.Operar(numero1, operador, numero2);

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}

