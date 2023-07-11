package Controle;

import Dominio.DaoColecao;
import Dominio.Colecao;

public class ControleJanelaColecao {
    private Colecao se = new Colecao(null, null, null, null);
    private DaoColecao daoSe = new DaoColecao();
   
    public void incluirColecao(String nomecolecao, String item, String ano, String colecionador) {
        se.setNomeColecao(nomecolecao);
        se.setItem(item);
        se.setAno(ano);
        se.setColecionador(colecionador);
       
        daoSe.inserir(nomecolecao, item, ano, colecionador);
    }
}