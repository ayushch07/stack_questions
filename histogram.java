package Stack_Questions;

import java.util.*;
public class histogram {
    public static void main(String[] args) {
        int arr[] = {2,3,5,4,6,1,7};
        System.out.println(Histogram(arr));
    }
    public static int Histogram(int arr[]){
        Stack<Integer> stack = new Stack<>();
        int len =arr.length;
        int answer = 0;
        for(int i=0;i<len;i++){
            while(!stack.isEmpty() && arr[i]<arr[stack.peek()]){
               int h = arr[stack.pop()];
               int r = i;
               if(stack.isEmpty()){
                int a = h*r;
                answer = Math.max(answer , a);
               }
               else{
                int l =stack.peek();
                int a = h * (r-l-1);
                answer = Math.max(answer ,a);
               }
            }
            stack.push(i);
        }
        return answer;
    }
}