import java.util.*;
public class SelectionSort{
    
    public void selectionSort(int ar[],int n)
    {
        //n 5
        //5 4 3 2 1
        for(int i=0;i<n-1;i++)  
        {
            int min_index=i;  //0
            for(int j=i+1;j<n;j++)
                if(ar[j]<ar[min_index])
                min_index=j;
                
                int temp=ar[min_index];
                ar[min_index]=ar[i];
                ar[i]=temp;
                
            
        }
    }
    
      
    
    
    
    public void printArray(int ar[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        
        SelectionSort obj=new SelectionSort();
        
        obj.selectionSort(ar,n);
        obj.printArray(ar,n);
    }
}  
