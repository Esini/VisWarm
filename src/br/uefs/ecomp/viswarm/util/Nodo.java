package br.uefs.ecomp.viswarm.util;

/**
 * Classe que guarda os métodos dos Nós da ListaEncadeada.
 * 
 * @author Jairo
 * @version 1.0
 * @since Release 01 da aplicação
 */
public class Nodo {
	private Object objeto;
	private Nodo esq;
	private Nodo dir;
	
	/**
	 * Construtor da classe Nodo, define o objeto a ser guardado.
	 * 
	 * @param obj	objeto recebido a ser guardado no nó
	 */
	public Nodo(Object obj) {
		this.objeto = obj;
	}
	
	/*
	 * Setters e getters com nome mais bonitinho.
	 */
	
	public void defineEsquerda(Nodo newEsquerda) {
		this.esq = newEsquerda;
	}
	
	public void defineDireita(Nodo newDireita) {
		this.dir = newDireita;
	}
	
	public Nodo obtemEsquerda() {
		return esq;
	}
	
	public Nodo obtemDireita() {
		return dir;
	}
	
	public void defineObjeto(Object obj) {
		objeto = obj;
	}
	
	public Object obtemObjeto() {
		return objeto;
	}
}
