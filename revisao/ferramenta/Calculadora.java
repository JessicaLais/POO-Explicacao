package revisao.ferramenta;

public class Calculadora {
    
    public int a;
    public int b;
    public String operador;

    /*public int somar(){
        return this.a + this.b; 
        só utilizaria se fosse só de soma
    } 
    /*public static int somarAeB(int A, int B){
        return A + B;
    }*/
    public int operar(){
        int ret = 0;
        switch (this.operador){
            case "+":
            ret = this.a + this.b;
            break;
            case "-":
            ret = this.a - this.b;
            break;
            case "*":
            ret = this.a * this.b;
            break;
            case "/":
            ret = this.a / this.b;
            break;
        }
        return ret;
        
        /*if(this.operador == "+"){
            ret = this.a + this.b;
        }
        if(this.operador == "-"){
            ret = this.a - this.b;
        }
        if(this.operador == "*"){
            ret = this.a * this.b;
        }
        if(this.operador == "/"){
            ret = this.a / this.b;
        }
    }*/
    }
}

