public class insertion2{
    public static void main(String[] args){
        int a[]={10,34,6,2,45,23,56,32};
        
        int i,j,k,temp,min;
        System.out.print("array elements before soring ");
        for(k=0;k<a.length;k++){
        System.out.print(a[k]+" ");
       
        }
        System.out.println();
        for(i=1;i<a.length;i++){
              temp=a[i];
              
            for(j=i-1;j>=0;j--){
            
                if(temp<a[j]){
                    if(j==0){
                        a[j+1]=a[j];
                        a[j]=temp;
                    }
                    else{
                        a[j+1]=a[j];
                    }
                }
                else{
                     a[j+1]=temp;
                     break;
                }
            
            }
        }
    System.out.print("array elements after sorting ");
    for(k=0;k<a.length;k++){
        System.out.print(a[k]+" ");
    }
    
    }
}
