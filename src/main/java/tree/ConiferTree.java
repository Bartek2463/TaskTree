package tree;

public class ConiferTree implements  Tree{

    private GenericTree genericTree;

    public ConiferTree(GenericTree genericTree) {
        this.genericTree = genericTree;
    }

    @Override
    public String grow() {
        return genericTree.toString();
    }

    @Override
    public String toString() {
        return "ConiferTree{" +
                "genericTree=" + genericTree +
                '}';
    }
}
