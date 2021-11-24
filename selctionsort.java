public class selctionsort{
    public static void main(String args[]){
        int a[]={10,34,6,2,45,23,56,32};
        int i,j,k,min,temp,d;
        System.out.print("array before sorting: ");
        for(k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();

        for(i=0;i<a.length;i++){
            min=i;
            for(j=i;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
                

            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        
        System.out.print("array after  sorting: ");
        for(k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
    }
}