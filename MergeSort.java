import java.util.*;
public class MergeSort {
    public void Sort(int arr[],int low,int high)
    {
        int mid=0;
        if(low<high)
        {
            mid=(low+high)/2;
            Sort(arr,low,mid);
            Sort(arr,mid+1,high);
            Merge(arr,low,mid,high);
        }
        
    }
    
    public void Merge(int arr[],int low,int mid,int high)
    {
        int n1=mid-low+1;
        int n2=high-mid;
        
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        
        
        
        for(int i=0;i<n1;++i)
        {
            arr1[i]=arr[low+i];
        }
        for(int j=0;j<n2;++j)
        {
            arr2[j]=arr[mid+1+j];
        }
        
        
        int i=0,j=0;
        int k=low;
        while(i<n1 && j<n2)
        {
            if(arr1[i]<=arr2[j])
            {
                arr[k]=arr1[i];
                i++;
            }
            else
            {
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }
        
        
    }
    public void Print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    
    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
    }
    
    MergeSort ob=new MergeSort();
     //ob.Print(arr,n);
    ob.Sort(arr,0,n-1);
    ob.Print(arr,n);
    }
}
