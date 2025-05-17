class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<=matrix.length-2;i++){
            for(int j=i+1;j<=matrix[i].length-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
        for(int[] arr: matrix){
            reverse(arr,0,arr.length-1);
        }
    }

        static void reverse(int[] arr,int a,int b){
            while(a<b){
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
        }
    }
