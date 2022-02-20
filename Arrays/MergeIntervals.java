package Arrays;

public class MergeIntervals {
    public static void merge(int[][] intervals) {
        int rows = intervals.length;
        int columns = intervals[0].length;
        int[][] array = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                int next = i+1;
                if(next<rows){
                    if(intervals[i][1]<=intervals[next][0]){
                    array[i][0] = intervals[i][0];
                    array[i][1] = intervals[i][1];
                    
                }
                else{
                    array[i][0] = intervals[i][0];
                     array[i][1]  = intervals[i][1];
                }
            }
                
        }
    
    }
}}
