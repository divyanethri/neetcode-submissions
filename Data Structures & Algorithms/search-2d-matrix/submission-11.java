class Solution {
    public int[] getArray(int[][] matrix, int target){
        for(int i=0; i<matrix.length; i++){
            int l = matrix[i][0];
            int r = matrix[i][matrix[i].length-1];
            if(target>= l && target<=r){
                System.out.println(l + " "+ r);
                return matrix[i];
            }
        }
    return null;
    }
    public boolean binarySearch(int[] arr, int target,int l, int r){
        int mid = (l+r)/2;
        if(target == arr[mid]) return true;
        if(l<=r){
            if(target>arr[mid]){
                return binarySearch(arr, target, mid+1, r);
            }else{
                return binarySearch(arr, target, l, mid-1);
            }
        }
    return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] arr = getArray(matrix, target);
        if(arr == null) return false;
        if(arr[0] == target || arr[arr.length-1]== target) return true;
        return binarySearch(arr,target,0, arr.length-1);
    }
}
