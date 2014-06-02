package br.uefs.ecomp.viswarm.util;

/**
 * Classe que discreve os métodos da ListaEncadeada padrão.
 * 
 * @author	Jairo
 * @version	1.0
 * @since	Release 01 da aplicação
 */
public class ListaEncadeada implements ILista {
	
	private Nodo primeiro;
	
	/**
	 * Construtor da lista encadeada, apenas inicializa o atributo primeiro.
	 */
	public ListaEncadeada() {
		primeiro = null;
	}
	
	/**
	 * Método de inserção de nó na primeira posição da lista.
	 * 
	 * @param	objeto a ser guardado no nó inserido
	 */
	public void insereInicio(Object obj) {
		Nodo nodo = new Nodo(obj);
		nodo.defineProximo(getPrimeiro());
		setPrimeiro(nodo);
	}
	
	/**
	 * Método de inserção de nó na última posição da lista.
	 * 
	 * @param	objeto a ser guardado no nó inserido
	 */
	public void insereFinal(Object obj) {
		if(estaVazia()){
			Nodo nodo = new Nodo(obj);
			nodo.defineProximo(getPrimeiro());
			setPrimeiro(nodo);
		} else {
			Nodo nodo = new Nodo(obj);
			Nodo atual = getPrimeiro();
			while (atual.obtemProximo() != null) atual = atual.obtemProximo();
			nodo.defineProximo(atual.obtemProximo());
			atual.defineProximo(nodo);
		}
	}
	
    public void inserirOrdenado(Comparable<Object> obj){
        if (estaVazia() || obj.compareTo(getPrimeiro().obtemObjeto())<0){
                insereInicio(obj);
        }
        else if (obj.compareTo(getUltimo().obtemObjeto())>0){
                insereFinal(obj);
        }
        else{
                Nodo novo = new Nodo(obj);
                Nodo anterior, proximo;
                for(int i=1; i <= tamanho(); i++){
                        anterior = getNodo(i);
                        proximo = getNodo(i+1);
                        if ((obj.compareTo(anterior.obtemObjeto())>0)   &&  (obj.compareTo(proximo.obtemObjeto())<0)){
                                novo.defineProximo(proximo);
                                anterior.defineProximo(novo);
                        }
                }
        }
       
    }
    
	/**
	 * Método que checa se a lista está vazia.
	 * 
	 * @return	verdadeiro caso primeiro seja null, falso caso primeiro seja nó
	 */
	public boolean estaVazia() {
		return (getPrimeiro() == null);
	}
	
	/**
	 * Método que retorna o tamanho da lista.
	 * 
	 * @return	inteiro que possui o valor do tamanho da lista.
	 */
	public int tamanho() {
		Nodo atual = getPrimeiro();
		int tamanho = 0;
		while(atual != null){
			tamanho ++;
			atual = atual.obtemProximo();
		}
		return tamanho;
	}
	
	/**
	 * Método que recupera um nó específico
	 * baseado na sua posição na lista.
	 * 
	 * @return	objeto do nó recuperado
	 */
	public Object recupera(int cont) {
		int contador = 0;
		Nodo atual = getPrimeiro();
		while(contador != cont){
			contador ++;
			atual = atual.obtemProximo();
		}
		return atual.obtemObjeto();
	}
	
	/**
	 * Método que remove o nó da primeira posição da lista.
	 * 
	 * @return	Objeto contido no nó removido
	 */
	public Object removeInicio() {
		Nodo atual = getPrimeiro();
		setPrimeiro(getPrimeiro().obtemProximo());
		return atual.obtemObjeto();
	}
	
	/** 
	 *	Método que remove o nó da última posição da lista.
	 *
	 *	@return Objeto guardado no nó removido
	 */
	public Object removeUltimo() {
		Nodo atual = getPrimeiro();
		Nodo anterior = getPrimeiro();
		while(atual.obtemProximo() != null) {
			anterior = atual;
			atual= atual.obtemProximo();
		}
		if(atual == getPrimeiro()) setPrimeiro(getPrimeiro().obtemProximo());
		else anterior.defineProximo(atual.obtemProximo());
		return atual.obtemObjeto(); 
	}
	
	public Nodo getNodo(int pos) {
		int i = 1;
		Nodo atual = getPrimeiro();
		while(atual!=null){
			if(i == pos)
				return atual;
			i++;
			atual = atual.obtemProximo();

		}
		return null;
	}
	/**
	 * Método que cria um novo iterador para a lista.
	 * 
	 * @return novo Iterador da lista.
	 */
	public Iterator iterador() {
		return new Iterator(getPrimeiro());
	} 
	
	/*
	 * Setters e getters.
	 */
	public Nodo getPrimeiro() {
		return primeiro;
	}
	
	private void setPrimeiro(Nodo nodo) {
		primeiro = nodo;
	}
	
	public Nodo getUltimo() {
		Nodo aux = getPrimeiro();
		while(aux.obtemProximo() != null) {
			aux = aux.obtemProximo();
		}
		return aux;
	}
}