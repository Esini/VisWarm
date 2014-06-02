package br.uefs.ecomp.viswarm.util;

/**
 * Classe que guarda os m�todos dos N�s da ListaEncadeada.
 * 
 * @author Jairo
 * @version 1.0
 * @since Release 01 da aplica��o
 */
public class Nodo {
	private Object objeto;
	private Nodo proximo;
	
	/**
	 * Construtor da classe Nodo, define o objeto a ser guardado.
	 * 
	 * @param obj	objeto recebido a ser guardado no n�
	 */
	public Nodo(Object obj) {
		this.objeto = obj;
	}
	
	/*
	 * Setters e getters com nome mais bonitinho.
	 */
	public void defineProximo(Nodo proximo) {
		this.proximo = proximo;
	}
	
	public Nodo obtemProximo() {
		return proximo;
	}
	
	public void defineObjeto(Object obj) {
		objeto = obj;
	}
	
	public Object obtemObjeto() {
		return objeto;
	}
}
