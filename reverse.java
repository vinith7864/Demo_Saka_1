public class reverse {
    public static void main(String args[])
    {
        int a[]={1,2,3};
        int j=0;
        int c[]=new int[3];
        int d[]=new int[4];

        for (int i=2;i>=0;i--){
            if(j<3){
                c[j]=a[i];
                j+=1;
               
            }
           
           }
        /*for(int i=2,j=0;i>=0;i--,j++){
            c[j]=a[i];
        }*/
        for (int k=0;k<3;k++){
        System.out.print(c[k]+" ");
        }

    }
}
