public class duplicate_each_occurrence_of_zero {
    /**
     * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
     * Note : that elements beyond the length of the original array are not written.
     * @param arr
     */
    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){

                for(int j=arr.length-1;j>i;j--){
                    arr[j]=arr[j-1];
                }
                i=i+1;
            }

        }
    }
    public static void main(String[] args) {
        int [] arr={1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        for(int i=0 ; i<arr.length; i++){
            System.out.print(" , "+ arr[i]);
        }

//        int arr2[] ={1,2,3};
//        for(int index : arr2){
//            System.out.print(" , "+ arr2[index]);
//
//        }






    }
}
