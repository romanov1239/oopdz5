package familyTree.model;

import java.util.Comparator;

import familyTree.model.human.Human;

public class HumanComparatorByName<E extends TreeNode<E>> implements Comparator<E> {

    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
