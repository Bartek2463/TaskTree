package tree;

public class FactoryTree {
    public FactoryTree() {
    }

    public static Tree getTree(TreeTyp treeTyp){
        switch(treeTyp){
            case LEAFY:
                return new LeafyTree(new GenericTree("leafy trunk"," leafy branches", "threadlike",12));
            case CONIFERS:
                return new ConiferTree(new GenericTree(" conifer trunk"," conifer branches","needle-like",23));
            case FRUITY:
                return new FruitTree(new GenericTree("fruity trunk", "fruity branches","needle-like",34),"apples");
            default:
                return null;
        }
    }

}
