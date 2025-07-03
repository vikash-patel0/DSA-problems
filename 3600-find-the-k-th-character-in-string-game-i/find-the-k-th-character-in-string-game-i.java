class Solution {
    public char kthCharacter(int k) {
    String word ="a";
    while(word.length()<k){
    StringBuilder neword = new StringBuilder();

        for (char c : word.toCharArray()) {
            
        if (c == 'z') {
            neword.append('a');
        }else{
            neword.append((char)(c + 1));
        } 
    }
    word += neword.toString();
    }
    return word.charAt(k-1);
    }
}