
class Solution {
    public int maximumValue(String[] strs) {
        int maxSize = 0;

        for (int i = 0; i < strs.length; i++) {
            int size;
            if (strs[i] instanceof String) {
                try {
                    size = Integer.parseInt((String) strs[i]);
                } catch (NumberFormatException e) {
                    size = ((String) strs[i]).length();
                }
            }
            else {
                    size = Integer.parseInt(strs[i]);
            }
            if (size > maxSize) {
                maxSize = size;
            }
        }
        return maxSize;
    }
}
