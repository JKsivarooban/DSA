class Solution {
    public String intToRoman(int num) {
        // Map<Integer,String> map = new HashMap<>();
        // map.put(1,"1");
        // map.put(5,"V");
        // map.put(10,"X");
        // map.put(50,"L");
        // map.put(100,"C");
        // map.put(500,"D");
        // map.put(1000,"M");

        // while()

        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<value.length;i++){
            while(num >= value[i]){
            num = num - value[i];
            sb.append(symbol[i]);
            }
        }
        return sb.toString();
    }
}