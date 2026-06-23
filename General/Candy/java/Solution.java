1class Solution {
2    public int candy(int[] ratings) {
3        int ans1[] = new int[ratings.length];
4        int ans2[] = new int[ratings.length];
5        int res[] = new int[ratings.length];
6
7        ans1[0] =1;
8        ans2[ratings.length -1] = 1;
9        for(int i=1;i<ratings.length;i++){
10            if(ratings[i]> ratings[i-1]){
11                ans1[i] = ans1[i-1] + 1; 
12            }
13
14            else{
15                ans1[i] = 1;
16            }
17        }
18
19        for(int i =ratings.length -2;i>=0;i--){
20            if(ratings[i] > ratings[i+1]){
21                ans2[i] = ans2[i+1] + 1;
22            }
23            else{
24                ans2[i] = 1;
25            }
26        }
27        int sum =0;
28        for(int i =0;i<ratings.length;i++){
29            res[i] = Math.max(ans1[i],ans2[i]);
30            sum = sum + res[i];
31        }
32        return sum;
33    }
34}