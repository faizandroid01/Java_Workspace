public class HalfDouble {


        public static boolean checkIfExist(int[] arr) {

            for(int i=1; i<=arr.length -1 ; i++){

                int num = arr[i];

                for(int k =0 ; k<i ; k++ ){

                    if(num==arr[k]*2 || (num==arr[k]/2 && arr[k]%2==0) ){
                        return true;
                    }
                }

            }

            return false;
        }


    public static void main(String[] args) {
        System.out.println(""+ checkIfExist(new int[]{-20,8,-6,-14,0,-19,14,4}));
    }

}
