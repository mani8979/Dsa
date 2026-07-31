class Averageofelements{
    public static void main(String args[]){
        int arr[] = {12,45,78,54,23};
        int avg = 0;
        for(int i = 0;i<arr.length;i++){
            avg += arr[i];
        }
        System.out.print("Average of elements: " + (avg/arr.length));
    }
}