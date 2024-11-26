public class Find_Largest_Element_In_Array {
    public static void main(String[] args) {
        int [] arr = {1, 3, 7, 9, 5};
        int largest = arr[0];

        for (int num : arr){
            if (num > largest){
                largest = num;
            }
        }
        System.out.println(largest);
    }
}
