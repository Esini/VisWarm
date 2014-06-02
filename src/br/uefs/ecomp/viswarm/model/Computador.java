/**
 * Componente Curricular: Módulo Integrado de Programação. 
 * Autor: Ícaro Vasconcelos Alvim 
 * Data: 01/07/2014
 *
 * Declaro que este código foi elaborado por mim de forma individual e não
 * contém nenhum trecho de código de outro colega ou de outro autor, tais como
 * provindos de livros e apostilas, e páginas ou documentos eletrônicos da
 * Internet. Qualquer trecho de código de outra autoria que não a minha está
 * destacado com uma citação para o autor e a fonte do código, e estou ciente
 * que estes trechos não serão considerados para fins de avaliação. Alguns
 * trechos do código podem coincidir com de outros colegas pois estes foram
 * discutidos em sessões tutorias.
 */
package br.uefs.ecomp.VisWarm.model;

/**
 * Esta classe implementa o comportamento de um Computador. Ela contém os
 * atributos de um Computador, que são a memória e o modelo. Além de implementar
 * também a interface Comparable, que permite comparar 2 objetos de um mesmo
 * tipo.
 *
 * @author Ícaro Vasconcelos Alvim
 */
public class Computador implements Comparable<Computador> {

    private double memoria;
    private String modelo;

    /**
     * Construtor do tipo Computador, onde aos atributos são atribuidos valores
     * de acordo com os parametros recebidos.
     *
     * @param memoria - Byte para adicionar o atributo memoria ao objeto
     * Computador.
     * @param modelo - String para adicionar o atributo modelo ao objeto
     * Computador.
     */
    public Computador(double memoria, String modelo) {

        this.memoria = memoria;
        this.modelo = modelo;

    }

    /**
     * Método responsavel por retornar o conteudo do atributo memoria
     *
     * @return byte - memória em bytes do computador.
     */
    public double getMemoria() {

        return memoria;

    }

    /**
     * Método responsavel por retornar o conteudo do atributo modelo
     *
     * @return String - modelo do computador.
     */
    public String getModelo() {

        return modelo;

    }

    /**
     * Método responsavel por dar um novo valor ao atributo memoria, de acordo
     * com a memoria recebida.
     *
     * @param memoria - Byte para adicionar o atributo memoria ao objeto
     * Computador.
     */
    public void setTamanho(double memoria) {

        this.memoria = memoria;

    }

    /**
     * Método responsavel por dar um novo valor ao atributo modelo, de acordo
     * com o modelo recebido.
     *
     * @param modelo - String para adicionar o atributo modelo ao objeto
     * Computador.
     */
    public void setNome(String modelo) {

        this.modelo = modelo;

    }

    /**
     * Método responsável por checar se o objeto recebido é uma instância da
     * classe, através da comparação dos atributos da classe com os atributos do
     * objeto recebido.
     *
     * @param objeto - objeto que será comparado pelo presente método
     *
     * @return Boolean - se o resultado da comparação estiver correto, será
     * retornado true, caso contrário, será retornado false.
     */
    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Computador) {
            Computador computador = (Computador) objeto;
            if (computador.getMemoria() == memoria && computador.getModelo().equals(modelo)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método responsavel por comparar 2 Computadores através de seu nome.
     *
     * @param computador - Computador que será comparado pelo presente método.
     *
     * @return int - numero correspondente ao resultado da comparação: -1, 0, 1.
     */
    @Override
    public int compareTo(Computador computador) {
        Computador computadorOutro = (Computador) computador;
        return this.modelo.compareTo(computadorOutro.modelo);
    }

}
