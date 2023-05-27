package br.fatecrl.mvcdemo.models;

public class ElementosQuimicos {

    private String nome;
    private String sigla;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ElementosQuimicos(String nome, String sigla, String tipo) {
        this.nome = nome;
        this.sigla = sigla;
        this.tipo = tipo;
    }
}
