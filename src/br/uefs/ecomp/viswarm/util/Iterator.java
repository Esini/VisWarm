package br.uefs.ecomp.viswarm.util;

/**
 * Iterador da ListaEncadeada padrão, usado para percorrer a lista.
 * 
 * @author Jairo
 * @version 1.0
 * @since Release 01 da aplicação
 */
public class Iterator implements Iterador {
	
	private Nodo atual;
	
	/**
	 * Construtor do novo Iterador
	 * 
	 * @param c	nodo que o construtor recebe, sendo sempre o primeiro da lista que o instancia
	 */
	public Iterator(Nodo c) {
		atual = c;
	}

	/**
	 * Método que checa se a lista possúi um nó atual,
	 * caso não possua, provavelmente está vazia, ou atingiu o fim da lista.
	 * 
	 * @return	falso caso o nó atual seja null, verdadeiro caso não seja null
	 */
	public boolean temProximo() {
			return (atual != null);
	}

	/**
	 * Método que vai para o próximo nó da lista
	 * caso ela não esteja vazia ou o final tenha sido atingido
	 * 
	 * @return objeto guardado no nó atual.
	 */
	public Object proximo() {
		if(temProximo()) {
			Nodo atual = this.atual;
			this.atual = this.atual.obtemProximo();
			return atual.obtemObjeto();
		} else return null;
	}
}
