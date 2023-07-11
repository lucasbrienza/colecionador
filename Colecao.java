package Dominio;

public class Colecao {
    private String nomecolecao, item, ano, colecionador;
   
    public Colecao(String nomecolecao, String item, String ano, String colecionador) {
        this.nomecolecao = nomecolecao;
        this.item = item;
        this.ano = ano;
        this.colecionador = colecionador;
        
    }

    public String getNomeColecao() {
        return nomecolecao;
    }

    public void setNomeColecao(String nomecolecao) {
        this.nomecolecao = nomecolecao;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
   
    public String getColecionador() {
        return colecionador;
    }

    public void setColecionador(String colecionador) {
        this.colecionador = colecionador;
    }
}