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
            System.out.print( root.data+" ");
            inorderRec(root.right);
        }
    }
    
    
    void preorder()
    {
        preorderRec(root);
    }
    void preorderRec(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    
      
    void postorder()
    {
        postorderRec(root);
    }
    void postorderRec(Node root)
    {
        if(root!=null)
        {
          
            postorderRec(root.left);
            postorderRec(root.right);
              System.out.print(root.data+" ");
        }
    }
    public static void main(String args[])
    {
        BinarySearchTree ob=new BinarySearchTree();
        ob.insert(10);
        ob.insert(20); 
        ob.insert(15); 
        ob.insert(16); 
        ob.insert(5); 
   
        ob.insert(30); 
        System.out.print("In order: ");
        ob.inorder();
        
        System.out.print("\nPre-Order: ");
        ob.preorder();
        System.out.print("\nPost-Order: ");
        ob.postorder();
    }
}
