package linkdn;

import java.awt.Color;

public class Tree {
    private double height;
    private double trunkDiameterInches;
    private TreeType treeType;
    protected static Color TRUNK_COLOR = new Color(102, 51, 0);

    Tree(double height, double trunkDiameterInches, TreeType treeType) {
        this.height = height;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;

    }

    public void grow() {
        this.height += 10;
        this.trunkDiameterInches += 1;
    }

    public static void announceTree() {
        System.out.println("Look out for that tree");
    }

    public void announceTallTree() {
        if (this.height > 100) {
            System.out.print("Thats a tall " + this.treeType + "tree");
        } else {
            System.out.print("Thats a short " + this.treeType + "tree");

        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getTrunkDiameterInches() {
        return this.trunkDiameterInches;
    }

    public TreeType getTreeType() {
        return this.treeType;
    }

    public void setTrunkDiameterInches(double trunkDiameter){
        this.trunkDiameterInches=trunkDiameter;
    }

    

}
