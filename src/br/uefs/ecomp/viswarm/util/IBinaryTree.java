package br.uefs.ecomp.viswarm.util;

import br.uefs.ecomp.viswarm.util.exception.DataNotFoundException;

public interface IBinaryTree extends Iterable {

    public Object search(Comparable item) throws DataNotFoundException;

    public void add(Comparable item);

    public void remove(Comparable item) throws DataNotFoundException;

}
