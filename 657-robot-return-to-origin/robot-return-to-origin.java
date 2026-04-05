class Solution {
    public boolean judgeCircle(String moves) {
     int n = moves.length();
     int count11 = 0;
     int count22 = 0;
    //  for(int i = 0;i<n;i++){
    //     if(moves.charAt(i) == 'L' || moves.charAt(i) == 'D') { count++;
    //  }
    //  else count--;   
    //  }
    //  if(count == 0) {return true;
    // } else return false;
    for(int i = 0;i<n;i++){
        if(moves.charAt(i) == 'R') {count11 += 1;}
        else if(moves.charAt(i) == 'L') {
            count11 -= 1;
        }
        if(moves.charAt(i) == 'D'){ count22 += 1;}
        else if(moves.charAt(i) == 'U'){
            count22 -= 1;
        }
    } return count11 == 0 && count22 == 0;
    }
}