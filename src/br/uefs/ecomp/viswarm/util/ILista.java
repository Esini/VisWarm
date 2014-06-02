package br.uefs.ecomp.viswarm.util;

public interface ILista {

    public boolean estaVazia();

    public int tamanho();

    public void insereInicio(Object o);

    public void insereFinal(Object o);
    
    public void inserirOrdenado(Comparable<Object> o);

    public Object removeInicio();

    public Object removeUltimo();

    public Object recupera(int index);

    public Iterador iterador();
    
    public Nodo getUltimo();
    
    public Nodo getPrimeiro();
}
