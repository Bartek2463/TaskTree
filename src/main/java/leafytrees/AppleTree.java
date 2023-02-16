package leafytrees;

import tree.LeafyTree;
import tree.Tree;

public class AppleTree extends LeafyTree {

    public AppleTree(String trunkTree, String brunchTree, String leaves, String fruit) {
        super(trunkTree, brunchTree, leaves);
        this.fruit = fruit;
    }

    private String fruit;

    @Override
    public Tree grow() {
        return super.grow();
    }
}
