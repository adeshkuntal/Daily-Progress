// Last updated: 3/15/2026, 4:25:32 PM
1class Solution {
2    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
3        int[] mergedArray = new int[arr1.length + arr2.length];
4        int idx = 0;
5        int i = 0, j = 0;
6
7        while(i < arr1.length && j < arr2.length){
8            if(arr1[i] < arr2[j]){
9                mergedArray[idx++] = arr1[i++];
10            }
11            else{
12                mergedArray[idx++] = arr2[j++];
13            }
14        }
15
16        while(i < arr1.length){
17            mergedArray[idx++] = arr1[i++];
18        }
19
20        while(j < arr2.length){
21            mergedArray[idx++] = arr2[j++];
22        }
23
24        int n = mergedArray.length;
25        if(n%2 != 0){
26            return mergedArray[((n+1)/2)-1];
27        }
28        else{
29            return (mergedArray[(n / 2) - 1] + mergedArray[n / 2]) / 2.0;
30        }
31        
32    }
33}
34