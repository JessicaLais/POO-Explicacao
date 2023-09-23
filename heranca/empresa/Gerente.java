package heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Gerente extends Funcionario{

    private Integer quantidadeGerenciados;

    public Gerente(){
    }

    public Gerente(String nome, Integer cpf, Integer telefone, Integer quantidadeGerenciados){
        super(nome, cpf, telefone);
        this.quantidadeGerenciados = quantidadeGerenciados;
    }

    public Integer getquatidadeGerenciados(){
        return this.quantidadeGerenciados;
    }

    public void setquantidadeGerenciado(Integer quantidadeGerenciados){
        this.quantidadeGerenciados = quantidadeGerenciados;
    }
    
    @Override
    public BigDecimal getSalario(){
        return new BigDecimal(20000.00);
    }
    
    @Override
    public BigDecimal getBonificacao(){
        return getSalario().multiply(new BigDecimal(0.35));

    }
    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", quantidadeGerenciados='" + getquatidadeGerenciados() + "'" +
            ", salario= '" + getSalario() + "'" +
            ", bonificacao='" + getBonificacao().setScale(2, RoundingMode.HALF_UP) + "'" +
            "}";
    }
}
