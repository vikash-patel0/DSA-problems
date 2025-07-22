class Solution {
    
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
            map.put(arr[i],1);
            } 
        }
        int max=-1;
        for(int i : map.keySet()){
            if(i==map.get(i)){
                max=i;
            }
        }
        return max;
    }
}