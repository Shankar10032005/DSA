class Solution {
    static int dataTypeSize(String str) {
        if (str.equals("Character")){
            return 1;
        }   
        else if (str.equals("Integer")){
            return 4;
        }
        else if (str.equals("Float")){
            return 4;
        }
        else {
            return 8;
        }
        }
