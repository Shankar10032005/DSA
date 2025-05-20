class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[] > arr=new ArrayList<>();

        for(int[] i: intervals){
            if(arr.isEmpty() || arr.get(arr.size()-1)[1] < i[0] ){
                arr.add(i);
            }
            else{
                arr.get(arr.size()-1)[1] = Math.max(arr.get(arr.size()-1)[1],i[1]);
            }
        }
        int[][] ans=new int[arr.size()][];
        return arr.toArray(ans);
        
    }
}