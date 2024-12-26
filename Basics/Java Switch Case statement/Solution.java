class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
    if(choice==1){
        return Math.PI*Math.pow(arr.get(0),2);
    }
    else{
        return arr.get(0)*arr.get(1);
    }
    }
}
