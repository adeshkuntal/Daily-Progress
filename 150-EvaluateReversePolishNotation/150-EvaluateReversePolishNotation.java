// Last updated: 10/7/2025, 8:42:28 PM
class Solution {
    public int evalRPN(String[] tokens) {
       int arr[]=new int[tokens.length/2+1];
       int i=0;
       for(String str:tokens){
       switch(str){
        case "+":
        arr[i-2]=arr[i-2]+arr[i-1];
        i--;
        break;
        case"-":
        arr[i-2]=arr[i-2]-arr[i-1];
        i--;
        break;
        case"*":
        arr[i-2]=arr[i-2]*arr[i-1];
        i--;
        break;
       case"/":
       arr[i-2]=arr[i-2]/arr[i-1];
       i--;
       break;
       default:
       arr[i++]=Integer.parseInt(str);
       break;
    }}
    return arr[0];
}}