package revisao;

public class ClasseExecutavel{
    public static double Operar(double numero1, char operador, double numero2){
        double resultado = 0.0;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
        }
        return resultado;
    }
}
