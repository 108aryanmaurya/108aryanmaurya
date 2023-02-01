package DSA_lec_codes.Binary_search.search_in_matrix;

import java.util.Arrays;

public class row_colwise_sorted {
    public static void main(String[] args) {
        int [][] arr={
//                {1,2,3,4,5},
//                {6,7,8,9,10},
//                {11,12,13,14,15}
                {21,34,45},
                {23,45,54},
                {26,49,60},
        };
        int target=26;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int [][] arr,int target)
    {
        int r=0;
        int c=arr.length-1;
        while(c>=0&&r<arr.length&&r>=0)
        {
            if(arr[r][c]==target)
            {
                return new int[] {r,c};
            }
            if(arr[r][c]>target)
            {
                c--;
            }
//            if(arr[r][c]<target)
            else
            {
                r++;
            }
        }
            return new int[]{-1,-1};
    }
}
