class Solution {
    public String convertDateToBinary(String date) {
        String[] arr = date.trim().split("-");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<3;i++){
            sb.append(Integer.toBinaryString(Integer.parseInt(arr[i])));
            if(i<2){
            sb.append("-");
            }
        }
        return sb.toString();
    }
}