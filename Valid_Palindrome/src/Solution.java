class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("\\s+","");
        char[] sentence = s.toCharArray();
        int endP = sentence.length-1;
        int c;
        for(int i = 0; i < sentence.length/2; i++){
            c = (int) sentence[i];
            if(c < 0 && c > 127){
                --endP;
            }
            
            if(sentence[i] != sentence[endP]){
                return false;
            }
            --endP;
        }
        return true;
    }
}
