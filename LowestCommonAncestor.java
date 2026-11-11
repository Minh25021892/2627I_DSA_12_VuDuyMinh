class AdvancedBST extends BinarySearchTree{
    public BST_Node findLCA(BST_Node root, int a, int b){
        if(root == null) return null;
        if(root.data < a && root.data < b){
            return findLCA(root.right, a, b);
        }
        if(root.data > a && root.data > b){
            return findLCA(root.left, a, b);
        }
        return root;
    }
}
public class LowestCommonAncestor {
    public static void main (String[] args) {
        AdvancedBST bst = new AdvancedBST();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            bst.insert(val);
        }

        BST_Node lca = bst.findLCA(bst.root, 20, 40);

        if (lca != null) {
            System.out.println(lca.data); // Kết quả: 30
        }
    }
}
