package br.com.digitalhouse;

public class Dono {

    //Atributos
    private String nome;
    public String sexo;

    //construtor especifico
    public Dono(String novoNome){
        nome = novoNome;
    }

    //construtor padrão
    public Dono(){

    }

    //Método alimentar
    public void alimentar(Cachorro cachorrinho) {
        System.out.println("Olá " + cachorrinho.nome);
    }

    //Método Get
    public String getNome() {
        return nome;
    }

    //Método Set - Modificador
    public void setNome(String novoNome) {
        nome = novoNome;
    }

}
