// Last updated: 3/14/2026, 6:30:34 PM
1class Solution {
2    public int reversePairs(int[] arr) {
3        return mergeSort(arr, 0, arr.length - 1);
4    }
5
6    public int mergeSort(int[] arr, int l, int r){
7        if(l >= r) return 0;
8
9        int mid = (l + r) / 2;
10
11        int count = 0;
12
13        count += mergeSort(arr, l, mid);
14        count += mergeSort(arr, mid + 1, r);
15
16        int j = mid + 1;
17        for(int i = l; i <= mid; i++){
18            while(j <= r && (long)arr[i] > 2L * arr[j]){
19                j++;
20            }
21            count += j - (mid + 1);
22        }
23
24        merge(arr, l, mid, r);
25
26        return count;
27    }
28
29    public void merge(int[] arr, int l, int mid, int r){
30        int[] temp = new int[r - l + 1];
31
32        int i = l;
33        int j = mid + 1;
34        int k = 0;
35
36        while(i <= mid && j <= r){
37            if(arr[i] <= arr[j]){
38                temp[k++] = arr[i++];
39            } else {
40                temp[k++] = arr[j++];
41            }
42        }
43
44        while(i <= mid) temp[k++] = arr[i++];
45        while(j <= r) temp[k++] = arr[j++];
46
47        for(int p = 0; p < temp.length; p++){
48            arr[l + p] = temp[p];
49        }
50    }
51}