package tree;

public class GenericTree {
    private String trunk;
    private String branches;
    private String leaves;
    private int growth;

    public GenericTree(String trunk, String branches, String leaves, int growth) {
        this.trunk = trunk;
        this.branches = branches;
        this.leaves = leaves;
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "GenericTree{" +
                "trunk='" + trunk + '\'' +
                ", branches='" + branches + '\'' +
                ", leaves='" + leaves + '\'' +
                ", growth=" + growth +
                '}';
    }
}
