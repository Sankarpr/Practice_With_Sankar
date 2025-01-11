package binarySearch;

import javax.imageio.ImageTranscoder;

public class SortedMatrix {
    public static void main(String[] args) {

    }

    //search the matrix provided in row between columns provided
    static int[] simple_bs(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length; // be cautious matrix may be empty
        if (row == 1) {
            return simple_bs(arr, 0, 0, col - 1, target);
        }
        //run the loop till two rows remaining
        int rStart = 0;
        int rEnd = row - 1;
        int rMid = col / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][rMid] == target) {
                return new int[]{mid, rMid};
            }
            if (arr[mid][rMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        return new int[]{rMid};
    }
}
