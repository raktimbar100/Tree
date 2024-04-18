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
         postorder(root);

    }
    static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }
}
