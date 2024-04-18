class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        data=val;
        left=right=null;
    }
}
public class Inorder {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
         root.left.left=new Node(40);
         root.left.right=new Node(50);
         preorder(root);

    }
    static void preorder(Node root){
        if(root!=null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
            
        }
    }
}
