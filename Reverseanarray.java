class Reverseanarray{
    public static void main(String args[]){
        int arr[] = {12,45,32,67,43};
        int temp = 0;
        int j = arr.length-1;
        for(int i = 0;i< arr.length/2;i++){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        System.out.println("Reverse an array: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}