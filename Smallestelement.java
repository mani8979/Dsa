class Smallestelement{
    public static void main(String args[]){
        int arr[] = {30,56,67,5,45,1};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        } 
        System.out.print("Smallest number is :" + min);
    }
}