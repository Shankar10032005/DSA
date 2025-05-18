class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<=numRows-1;i++){
            List<Integer> row = new ArrayList<>();
           
                list.add(ans(row,i));
               
            
        }
        return list;


    }
    static List<Integer> ans(List<Integer> arr,int i  ){
        int ans=1;
        arr.add(ans);
        for(int k=1;k<=i;k++){
            ans=ans*(i-k+1);
            ans=ans/k;
            arr.add(ans);

        }
        return arr;
    }

}