class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        List<List<String>> res = new ArrayList<List<String>>();

        for(int i=0; i<strs.length; i++) {
            String stri = strs[i];
            char[] str = stri.toCharArray();

            Arrays.sort(str);

            String key = new String(str);

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(stri);
        }
        return new ArrayList<>(map.values());
    }
}