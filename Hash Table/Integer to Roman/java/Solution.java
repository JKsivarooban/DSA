class Solution {
    public String intToRoman(int num) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
        int orginal = num;
        StringBuilder sc = new StringBuilder();
        while(num != 0){
            if(num >= 1000){
                sc.append(map.get(1000));
                num = num -1000;
            }
            else if(num >=900 && num <1000){
                sc.append(map.get(900));
                num = num - 900;
            }
            else if(num >=500){
                sc.append(map.get(500));
                num = num - 500;
            }
           else if(num >=400 && num < 500){
                sc.append(map.get(400));
                num = num - 400;
            }
            else if(num >=100){
                sc.append(map.get(100));
                num = num - 100;
            }
            else if(num >=90 && num < 100){
                sc.append(map.get(90));
                num = num - 90;
            }
            else if(num >=50){
                sc.append(map.get(50));
                num = num - 50;
            }
            else if(num >=40 && num < 50){
                sc.append(map.get(40));
                num = num - 40;
            }
            else if(num >=10){
                sc.append(map.get(10));
                num = num - 10;
            }
            else if(num == 9){
                sc.append(map.get(9));
                num = num - 9;
            }
             else if(num >= 5){
                sc.append(map.get(5));
                num = num - 5;
            }
             else if(num == 4){
                sc.append(map.get(4));
                num = num - 4;
            }
             else if(num >= 1){
                sc.append(map.get(1));
                num = num - 1;
            }
        } return sc.toString();

        // int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        // String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        // StringBuilder sb = new StringBuilder();
        // for(int i =0;i<value.length;i++){
        //     while(num >= value[i]){
        //     num = num - value[i];
        //     sb.append(symbol[i]);
        //     }
        // }
        // return sb.toString();
    }
}