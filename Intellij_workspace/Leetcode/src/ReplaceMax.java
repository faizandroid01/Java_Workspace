import java.util.Arrays;

public class ReplaceMax {
    public static int[] replaceElementsEfficient(int[] arr) {
        int gr=arr[arr.length-1] ;
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            int curr = arr[i];
            arr[i]=gr;
            if(curr>gr)
                gr = curr;
        }
        return arr;

    }

    public static int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] temp_arr ;
        int max =arr[0] ;


        for(int i=0; i < len-1 ; i++){

            if(i!=0 && arr[i]<arr[i-1]){
                arr[i]=max;
            }else{

                temp_arr = Arrays.copyOfRange(arr,i+1,len);
                Arrays.sort(temp_arr);
                arr[i] = temp_arr[temp_arr.length-1];
                max = arr[i];
            }
        }

        arr[len-1] = -1;

        return arr;
    }

    public static void main(String[] args) {
        //Input: arr =    [17,18,5,4,6,1]
        //Epected Output: [18,6,6,6,1,-1]

        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));
        System.out.println(Arrays.toString(replaceElementsEfficient(new int[]{17,18,5,4,6,1})));

    }


}
