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
    
    
    
    
     
    //deletion
    void delete(int value)
    {
        root=deleteRec(root,value);
    }
    Node deleteRec(Node root,int value)
    {
        if(root==null)
        return root;
        if(value<root.data)
        root.left=deleteRec(root.left,value);
        else if(value>root.data)
        root.right=deleteRec(root.right,value);
        else
        {
            if(root.left==null)
            return root.right;
            else if(root.right==null)
            return root.left;
            
            
            root.data=minValue(root.right);
            root.right=deleteRec(root.right,root.data);
        }
        return root;
    }
    
    //select min value
    int minValue(Node root)
    {
        int min=root.data;
        while(root.left!=null)
        {
            min=root.left.data;
            root=root.left;
        }
        return min;
    }
    
    
    
    
    //inorder
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
    //                50
    //              /    \
    //             /      \
    //            40       60
    //           /  \     /  \
    //          30  45   55  70
    //         /  \
    //        20  35
    
    
    
    
    public static void main(String args[])
    {
        BinarySearchTree ob=new BinarySearchTree();
        ob.insert(20);
        ob.insert(30); 
        ob.insert(35); 
        ob.insert(45); 
        ob.insert(50); 
   
        ob.insert(55); 
        ob.insert(60); 
        ob.insert(70); 
        System.out.print("In order: ");
        ob.inorder();
        
        System.out.print("\nPre-Order: ");
        ob.preorder();
        System.out.print("\nPost-Order: ");
        ob.postorder();
        System.out.print("\nAfter deletion :");
        //deleting leaf.
        ob.delete(20);
        System.out.print("\nIn-order: ");
        ob.inorder();
        
        //deleting node having 2 subroot
        ob.delete(30);
     System.out.print("\nIn-order after deltion node having sub root: ");
        ob.inorder();
    }
}
