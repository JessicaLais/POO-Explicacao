package revisao;

import revisao.ferramenta.Calculadora;

//*Classe Executavel */


public class ClasseExecutavel{
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.a = 3;
        calc.b = 2;
        calc.operador = "+";

        System.out.println(calc.operar());
        
        //*Calculadora.somarAeB(A:0, B:0);*/

        /*Pessoa joao = new Pessoa( palavra:"Olá");
        Pessoa pedro = new Pessoa( palavra:"Fala meu patrão");

        joao.cumprimentar();
        pedro.cumprimentar();*/

    }
}