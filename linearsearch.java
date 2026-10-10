class GFG{
    public static int search(int arr[], int N, int x){
        for (int i = 0; i < N; i++){
            if ( arr[i] == x)
                return i;
        }
        return -1;
    }


public class linearsearch {
    public static void main(String[] args) {
     int arr[] = {1,2,3,4,5};
     int x = 4;   

     int result = search(arr, arr.length, x);
     if(result ==-1){
        System.out.println("number not in array");    }
        else{
            System.out.println("heres the nnumber : " + result);
        }
        
        }
    
    }
}
