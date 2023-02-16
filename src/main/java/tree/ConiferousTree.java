package tree;

public class ConiferousTree implements   Tree {
    private String trunkTree;
    private String brunchTree;
    private String needles;

    public ConiferousTree(String trunkTree, String brunchTree, String needles) {
        this.trunkTree = trunkTree;
        this.brunchTree = brunchTree;
        this.needles = needles;
    }

    @Override
    public Tree grow() {
        return new ConiferousTree(trunkTree,brunchTree,needles);
    }
}
