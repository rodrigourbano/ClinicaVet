package ClinicaVet;

public class Passaro extends Animal {

    private String alimentacao;
    private String cuidados;

    public Passaro(String nome, String especie, String dono, String alimentacao, String cuidados) {
        super(nome, especie, dono);
        this.alimentacao = alimentacao;
        this.cuidados = cuidados;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getCuidados() {
        return cuidados;
    }

    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }

    public String toString() {
        String retorno = super.toString();
        retorno += "Alimentação: " + this.alimentacao  + "\n";
        retorno += "Cuidados: " + this.cuidados  + "\n";
        return retorno;

    }
}
