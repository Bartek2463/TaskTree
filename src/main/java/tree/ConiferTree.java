package tree;

public class ConiferTree implements  Tree{

    private GenericTree genericTree;

    public ConiferTree(GenericTree genericTree) {
        this.genericTree = genericTree;
    }

    @Override
    public String grow(int growth) {
        return genericTree+"Growth: "+growth;
    }

    @Override
    public String toString() {
        return "ConiferTree{" +
                "genericTree=" + genericTree +
                '}';
    }
}
