public class bubblesort{
    public static void main(String args[]){
        int i,j,k,min,temp;
        int a[]={10,40,6,3,11,9,8,13};
        int n=a.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){

                if(a[i]<=a[j]){
                
                    
                    continue;
                }
                else{
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    
                }
                
            }
            
        }
        for(k=0;k<n;k++){
            System.out.println(a[k]);
        }
    }
}
