package linkdn;
import java.awt.Color;
public class Tree {
    double height;
    double trunkDiameterInches;
    TreeType treeType;
    static Color TRUNK_COLOR= new Color(102,51,0);

    Tree(double height, double trunkDiameterInches, TreeType treeType) {
        this.height = height;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;

    }

    void grow() {
        this.height += 10;
        this.trunkDiameterInches += 1;
    }

    static void announceTree(){
        System.out.println("Look out for that tree");
    }

    void announceTallTree() {
        if (this.height > 100) {
            System.out.print("Thats a tall " + this.treeType + "tree");
        } else {
            System.out.print("Thats a short " + this.treeType + "tree");

        }
    }

}
