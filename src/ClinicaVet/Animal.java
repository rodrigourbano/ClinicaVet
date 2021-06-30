package ClinicaVet;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    //Attributes
    private String nome;
    private String especie;
    private String dono;

    //Constructor

    public Animal(String nome, String especie, String dono) {
        this.nome = nome;
        this.especie = especie;
        this.dono = dono;
    }

    //Getter and Setter

  public String toString() {
      String retorno = "";
      retorno += "Nome: " + this.nome  + "\n";
      retorno += "Especie: " + this.especie  + "\n";
      retorno += "Dono: " + this.dono  + "\n";

      return retorno;

  }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}
