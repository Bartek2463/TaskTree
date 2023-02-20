package tree;

public class LeafyTree implements Tree{
    private GenericTree genericTree;

    public LeafyTree(GenericTree genericTree) {
        this.genericTree = genericTree;
    }

    @Override
    public String grow(int growth) {
        return genericTree+"Growth: "+growth;
    }

    @Override
    public String toString() {
        return "LeafyTree{" +
                "genericTree=" + genericTree +
                '}';
    }
}
