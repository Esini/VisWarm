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
 * Esta classe implementa o comportamento de um Video. Ela contém os atributos
 * de um Video, que são o tamanho e o nome. Além de implementar também a
 * interface Comparable, que permite comparar 2 objetos de um mesmo tipo.
 *
 * @author Ícaro Vasconcelos Alvim
 */
public class Video implements Comparable<Video> {

    private double tamanho;
    private String nome;
    private Computador computador;

    /**
     * Construtor do tipo Video, onde aos atributos são atribuidos valores de
     * acordo com os parametros recebidos.
     *
     * @param tamanho - Byte para adicionar o atributo tamanho ao objeto Video.
     * @param nome - String para adicionar o atributo nome ao objeto Video.
     * @param computador - Computador para adicionar o atributo computador ao objeto Video.
     */
    public Video(double tamanho, String nome, Computador computador) {

        this.tamanho = tamanho;
        this.nome = nome;
        this.computador = computador;

    }

    /**
     * Método responsavel por retornar o conteudo do atributo tamanho
     *
     * @return byte - tamanho em bytes do video.
     */
    public double getTamanho() {

        return tamanho;

    }

    /**
     * Método responsavel por retornar o conteudo do atributo nome
     *
     * @return String - nome do video.
     */
    public String getNome() {

        return nome;

    }
    
    /**
     * Método responsavel por retornar o conteudo do atributo computador
     *
     * @return Computador - computador onde o video está armazenado.
     */
    public Computador getComputador() {

        return computador;

    }

    /**
     * Método responsavel por dar um novo valor ao atributo tamanho, de acordo
     * com o tamanho recebido.
     *
     * @param tamanho - Byte para adicionar o atributo tamanho ao objeto Video.
     */
    public void setTamanho(double tamanho) {

        this.tamanho = tamanho;

    }

    /**
     * Método responsavel por dar um novo valor ao atributo nome, de acordo com
     * o nome recebido.
     *
     * @param nome - String para adicionar o atributo nome ao objeto Video.
     */
    public void setNome(String nome) {

        this.nome = nome;

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
        if (objeto instanceof Video) {
            Video video = (Video) objeto;
            if (video.getTamanho() == tamanho && video.getNome().equals(nome) && video.getComputador().equals(computador)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método responsavel por comparar 2 Videos através de seu nome.
     *
     * @param video - Video que será comparado pelo presente método.
     *
     * @return int - numero correspondente ao resultado da comparação: -1, 0, 1.
     */
    @Override
    public int compareTo(Video video) {
        Video videoOutro = (Video) video;
        return this.nome.compareTo(videoOutro.nome);
    }

}
