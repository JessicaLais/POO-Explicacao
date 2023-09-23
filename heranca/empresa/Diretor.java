package heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Diretor extends Funcionario{
    private Integer quantidadeGerencias;

public Diretor(){
}

 public Diretor(String nome, Integer cpf, Integer telefone, Integer quantidadeGerencias){
    super(nome, cpf, telefone);
    this.quantidadeGerencias = quantidadeGerencias;
 }

 public Integer getQuantidadeGerencias(){
    return this.quantidadeGerencias;
 }

 /**
 * @param quantidadeGerenciados
 */
public Diretor(Integer quantidadeGerencias) {
        this.quantidadeGerencias = quantidadeGerencias;
    }

public void setQuantidadeGerencias(Integer quantidadeGerencias){
    this.quantidadeGerencias = quantidadeGerencias;
 }

 @Override
 public BigDecimal getSalario(){
    return new BigDecimal(20000.00);
 }
 
 @Override
 public BigDecimal getBonificacao(){
    return getSalario().multiply(new BigDecimal(0.40));
 }

 @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", quantidadeGerenciados='" + getQuantidadeGerencias() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificacao='" + getBonificacao().setScale(2, RoundingMode.HALF_UP) + "'" +
            "}";
    }
}
