public class onezeroone {
    public static void main(String[] args) {
        int n = 4;
        int k=1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(k);
                if(k==1){
                    k=0;
                }else{ k =1;

                }
                
            }System.out.println();
        }
    }
}