class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left=0;
        int right=matrix[0].length-1;
        int up=0;
        int down=matrix.length-1;

        ArrayList<Integer> list = new ArrayList<>();

        while(up<=down && left<=right){

       
        for(int i=left;i<=right;i++){
            list.add(matrix[up][i]);
        }
        up +=1;
        for(int i=up; i<=down; i++){
            list.add(matrix[i][right]);
        }
        right -=1;

    if (up <= down) {
        for(int i=right; i>=left; i--){
            list.add(matrix[down][i]);
        }
        down -=1;
    }
    
    if(left <= right){
         for(int i=down;i>=up;i--){
             list.add(matrix[i][left]);
        }
        left++;
    }
}
        return list;
        
    }
}