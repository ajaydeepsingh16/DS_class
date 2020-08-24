import java.util.*;
public class MyClass {
    
    public void insertionSort(int ar[],int n)
    {
        for(int j=1;j<n;j++)
        {
            int key=ar[j];
            int k=j-1;
            while(k>=0 && ar[k]>key)
            {
                ar[k+1]=ar[k];
                k=k-1;
            }
            ar[k+1]=key;
        }
    }
    
    public void printArray(int ar[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    
    public static void main(String args[]) {
       
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        MyClass ob=new MyClass();
        ob.insertionSort(ar,n);
        ob.printArray(ar,n);
    }
}
