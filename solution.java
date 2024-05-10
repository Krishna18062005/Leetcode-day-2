class Solution {//problem number 796
    static int c=1;
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()) return false;
    for(int i=0;i<goal.length();i++){
        if((s.substring(i)+s.substring(0,i)).equals(goal)) return true;
        }
        return false;
    }
}
