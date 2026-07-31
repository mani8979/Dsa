class Sumofallelements{
    public static void main (String args[]){
        int arr[] = {12,45,67,54,36};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.print("Sum of all array elements: "+sum);
    }
}