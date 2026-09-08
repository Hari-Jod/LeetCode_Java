class Solution {
    public int romanToInt(String s) {
        char [] ch = s.toCharArray();
        int number = 0;
        int i = 0;
        while(i < ch.length) {
            if(ch[i] == 'I'){
                number += 1;
                i++;
                if(i != ch.length && ch[i] == 'V' ){
                    number += 3;
                    i++;
                }
                else if(i != ch.length && ch[i] == 'X') {
                    number += 8;
                    i++;
                }
            }
            else if(ch[i] == 'V') {
                number += 5;
                i++;
            } else if(ch[i] == 'X') {
                number += 10;
                i++;
                if(i != ch.length && ch[i] == 'L') {
                  number += 30;
                  i++;
                } else if(i != ch.length && ch[i] == 'C'){
                    number += 80;
                    i++;
                }
            } else if(ch[i] == 'L'){
                number += 50;
                i++;
            } else if(ch[i] == 'C'){
                number += 100;
                i++;
                if(i != ch.length && ch[i] == 'D') {
                    number +=300;
                    i++;
                } else if(i != ch.length && ch[i] == 'M'){
                    number += 800;
                    i++;
                }
            }
            else if(ch[i] == 'D') {
                number += 500;
                i++;
            } else {
                number += 1000;
                i++;
            }
        }
        return number;
    }
}