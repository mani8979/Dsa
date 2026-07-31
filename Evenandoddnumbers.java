class Evenandoddnumbers{
    public static void main(String args[]){
        int arr[]={12,45,79,35,22,12};
        int eve = 0;
        int odd = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                eve++;
            }
            odd++;
        }
        System.out.print("Count of even:  "+ eve + "  and odd:  "+ odd + "  numbers: ");
    }
}