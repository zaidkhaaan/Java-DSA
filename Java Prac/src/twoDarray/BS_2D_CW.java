package twoDarray;

public class BS_2D_CW {
    public static void main(String[] args) {

        // Problem to find the square root
        int x = 24;
//        System.out.println(sqrt(x));

        int[] a = {1,1,1,2,2,3,1};
        int target = 2   ;
//        System.out.println(findMinimum(a));
//        System.out.println(search(a, target));
        System.out.println(search_(a,target));


    }




    static int findMinimum (int [] a){

        int start = 0;
        int end = a.length-1;
        int ans = -1;
        int n = a.length-1;


        while (start<=end){
            int mid = start+(end-start)/2;

            if (a[mid] <= a[n-1]){
                ans = mid;
                end = mid - 1;
            } else {
                start =mid+1;
            }

        }
        return ans;

    }



    // Problem to find out index of the number in rotated sorted array

    static int search (int[]arr, int target){
        int start =0;
        int end = arr.length-1;
        int ans = -1;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }else if (arr[mid] < arr[end]){
                // mid to end is sorted array
                if(target > arr[mid] && target <= arr[end]){
                    start = mid+1;
                    // discarding the left array
                }else{
                    // searching the target left of the mid i.e might be possible target will be
                    // left side to of the mid
                    end= mid-1;
                }

            } else{
                // start to mid is sorted array
                if(target >= arr[start] && target < arr[mid]){
                    end=mid-1;
                }else{
                    start = mid+1;

                }
            }


        }
        return -1;
    }

    static int search_(int[]arr, int target){
        int start =0;
        int end = arr.length-1;
        int ans = -1;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(arr[mid] == target){
                return mid;
            } else if (arr[start] == arr[mid] && arr[end] == mid) {
                start++;
                end--;

            } else if (arr[mid] <= arr[end]){
                // mid to end is sorted array
                if(target > arr[mid] && target <= arr[end]){
                    start = mid+1;
                    // discarding the left array
                }else{
                    // searching the target left of the mid i.e might be possible target will be
                    // left side to of the mid
                    end= mid-1;
                }

            } else{
                // start to mid is sorted array
                if(target >= arr[start] && target < arr[mid]){
                    end=mid-1;
                }else{
                    start = mid+1;

                }
            }


        }
        return -1;
    }







    /* FUNCTION TO FIND OUT SQUARE ROOT OF AN NUMBER


    static int sqrt(int x){

        int start = 0;
        int end =x;
        int ans = -1;


        while (start <= end){
            int mid  = start +(end-start)/2;
            long val = mid*mid;

            if (val == x){
                return mid;
            } else if (val < x) {
                ans = mid;
                start = mid +1 ;
            }else{
                // val > x
                end=mid- 1;
            }


        }
        return ans;

     */
    }

