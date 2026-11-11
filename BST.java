import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BST_Node{
    int data;
    BST_Node left, right;
    BST_Node(int item){
        data = item;
        left = right = null;
    }
}
class BinarySearchTree{
    BST_Node root;
    public void insert(int data){
        root = insertRec(root, data);
    }
    private BST_Node insertRec(BST_Node root, int data) {
        if (root == null) {
            return new BST_Node(data);
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    public void printTree(BST_Node node){
        if(node == null) return;
        printTree(node.left);
        System.out.print(node.data + " ");
        printTree(node.right);
    }
}
public class BST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            bst.insert(sc.nextInt());
        }
        bst.printTree(bst.root);
    }
}
