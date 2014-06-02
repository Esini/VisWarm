package br.uefs.ecomp.viswarm.util;

/**
 * Iterador da ListaEncadeada padr�o, usado para percorrer a lista.
 * 
 * @author Jairo
 * @version 1.0
 * @since Release 01 da aplica��o
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
	 * M�todo que checa se a lista poss�i um n� atual,
	 * caso n�o possua, provavelmente est� vazia, ou atingiu o fim da lista.
	 * 
	 * @return	falso caso o n� atual seja null, verdadeiro caso n�o seja null
	 */
	public boolean temProximo() {
			return (atual != null);
	}

	/**
	 * M�todo que vai para o pr�ximo n� da lista
	 * caso ela n�o esteja vazia ou o final tenha sido atingido
	 * 
	 * @return objeto guardado no n� atual.
	 */
	public Object proximo() {
		if(temProximo()) {
			Nodo atual = this.atual;
			this.atual = this.atual.obtemProximo();
			return atual.obtemObjeto();
		} else return null;
	}
}
