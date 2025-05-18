class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
  
        for(int i=1;i<=numRows;i++){
            List<Integer> row=new ArrayList<>();
            list.add(ans(row,i-1));
            

        }
        return list;
        
    }

    static List<Integer> ans(List<Integer> row,int i){
        int ans=1;
        row.add(ans);
        for(int k=1;k<=i;k++){
            ans=ans*(i-k+1);
            ans=ans/k;
            row.add(ans);
        }
        return row;
    }
}