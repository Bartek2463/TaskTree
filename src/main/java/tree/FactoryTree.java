package tree;

public class FactoryTree {
    public FactoryTree() {
    }

    public static Tree getTree(TreeTyp treeTyp){
        switch(treeTyp){
            case LEAFY:
                return new LeafyTree(new GenericTree("leafy trunk"," leafy branches", "threadlike"));
            case CONIFERS:
                return new ConiferTree(new GenericTree(" conifer trunk"," conifer branches","needle-like"));
            default:
                return null;
        }
    }

}
