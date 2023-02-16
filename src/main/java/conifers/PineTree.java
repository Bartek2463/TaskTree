package conifers;

import tree.ConiferousTree;
import tree.Tree;

public class PineTree extends ConiferousTree {
    public String cone;

    public PineTree(String trunkTree, String brunchTree, String needles, String cone) {
        super(trunkTree, brunchTree, needles);
        this.cone = cone;
    }

    @Override
    public Tree grow() {
        return super.grow();
    }

}
