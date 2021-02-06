import java.util.*;
public class selectSort {
    public static void main(String args[])
    {
        int n;
        Scanner inp=new Scanner(System.in);
        n=inp.nextInt();
        int Arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            Arr[i]=inp.nextInt();
        }
        
        int smallest=Arr[0];
        for(int i=0;i<n-1;i++)
        {   smallest=i;
            for(int j=i+1;j<n;j++)
            {
            if(Arr[j]<Arr[smallest])
            {
                smallest=j;  
            }
            int temp=Arr[i];
                Arr[i]=Arr[smallest];
                Arr[smallest]=temp;  
        }  
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(Arr[i]);
        }
    }
}
