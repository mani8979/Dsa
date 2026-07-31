class Countpositiveandnegativenumbers{
    public static void main(){
        int arr [] = {12,-14,11,-56,43,-4};
        int pos = 0;
        int neg = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
              pos++;
            }else{
            neg++;
            }
        }
        System.out.print("Count positive: " + pos +  " and negative: "+neg+ " numbers");
    }
}