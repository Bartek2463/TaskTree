package tree;

public class LeafyTree implements Tree {
    private String trunkTree;
    private String brunchTree;
    private String leaves;

    public LeafyTree(String trunkTree, String brunchTree, String leaves) {
        this.trunkTree = trunkTree;
        this.brunchTree = brunchTree;
        this.leaves = leaves;
    }

    @Override
    public Tree grow() {
        return new ConiferousTree(trunkTree,brunchTree,leaves);
    }
}
