package tree;

public class GenericTree {
    private String trunk;
    private String branches;
    private String leaves;

    public GenericTree(String trunk, String branches, String leaves) {
        this.trunk = trunk;
        this.branches = branches;
        this.leaves = leaves;
    }

    @Override
    public String toString() {
        return "GenericTree{" +
                "trunk='" + trunk + '\'' +
                ", branches='" + branches + '\'' +
                ", leaves='" + leaves + '\'' +
                '}';
    }
}
