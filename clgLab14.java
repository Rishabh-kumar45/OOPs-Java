public class clgLab14{
    public static void main(String[] args) {
        int arr[] = {4, 15, 20, 50, 2};
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}