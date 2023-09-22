package heranca.empresa.Engenheiro;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Engenheiro{

    private String nome;
    private Integer cpf;
    private Integer telefone;
    private String crea;
    private String projeto;
    
    public Engenheiro(){

    }

    public Engenheiro(String nome, Integer cpf, Integer telefone, String crea, String projeto){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.crea= crea;
        this.projeto = projeto;

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getCpf(){
        return this.cpf;
    }

    public void setCpf(Integer cpf){
        this.cpf = cpf;
    }
    public Integer getTelefone(){
        return this.cpf;
    }

    public void setTelefone(Integer telefone){
        this.telefone = telefone;
    }

    public String getCrea(){
        return this.crea;
    }

    public void setCrea(String crea){
        this.crea = crea;
    }

    public String getProjeto(){
        return this.projeto;
    }

    public void setProjeto(String projeto){
        this.projeto = projeto;
    }

    public BigDecimal getSalario(){
        return new BigDecimal(val:10000.00);
    }

    public BigDecimal getBonificacao(){
        return getSalario().multiply(new BigDecimal(val:0.15));

    }

    @Override
    public String toString() {
        return "{" +
            " nome'" + getNome() + "'" +
            ", cpf'" + getCpf() + "'" +
            ", telefone'" + getTelefone() + "'" +
            ", crea'" + getCrea() + "'" +
            ", projeto'" + getProjeto() + "'" +
            ", salario '" + getSalario() + "'" +
            ", bonificacao='" + getBonificacao().setScale(2, RoundingMode.UP) + "'" +
            "}";
    }
    
}
