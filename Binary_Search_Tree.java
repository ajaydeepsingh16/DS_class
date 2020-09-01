import java.util.*;
public class BinarySearchTree
{
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    Node root;
    // BinarySearchTree()
    // {
    //     root=null;
    // }
    void insert(int value)
    {
        root=insertRec(root,value);
    }
    Node insertRec(Node root,int value)
    {
        if(root==null)
        {
            root=new Node(value);
            return root;
        }
        if(value<root.data)
        root.left=insertRec(root.left,value);
        else if(value>root.data)
        root.right=insertRec(root.right,value);
        return root;
    }
    void inorder()
    {
        inorderRec(root);
    }
    void inorderRec(Node root)
    {
        if(root!=null)
        {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }
    public static void main(String args[])
    {
        BinarySearchTree ob=new BinarySearchTree();
        ob.insert(50);
        ob.insert(30); 
        ob.insert(20); 
        ob.insert(40); 
        ob.insert(70); 
        ob.insert(60); 
        ob.insert(80); 
        ob.inorder();
    }
}
