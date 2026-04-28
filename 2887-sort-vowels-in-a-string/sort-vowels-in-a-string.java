class Solution {
    public String sortVowels(String s) {
        ArrayList <Character> voList= new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        ArrayList <Character> voExist = new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(voList.contains(ch)){
                voExist.add(ch);
            }
        }

        Collections.sort(voExist);

        StringBuilder res = new StringBuilder();
        int count=0;
        for(char ch:s.toCharArray()){
            if(voList.contains(ch)){
                res.append(voExist.get(count++));
            }else{
                res.append(ch);
            }
        }

        return res.toString();
    }
}