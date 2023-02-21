package tree;

public class FruitTree  implements Tree{
    private GenericTree genericTree;
    private String fruit;

    public FruitTree(GenericTree genericTree, String fruit) {
        this.genericTree = genericTree;
        this.fruit = fruit;
    }

    @Override
    public String grow(int growth) {
        return genericTree+" Growth :"+growth;
    }

    @Override
    public String toString() {
        return "FruitTree{" +
                "genericTree=" + genericTree +
                ", fruit='" + fruit + '\'' +
                '}';
    }
}
