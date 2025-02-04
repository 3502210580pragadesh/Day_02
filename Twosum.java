import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Twosum {
    public List<List<Integer>> twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        int l = 0, r = n - 1;
        
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum < target) {
                l++;
            } else if (sum > target) {
                r--;
            } else {
                ans.add(Arrays.asList(arr[l], arr[r]));
                while (l + 1 < r && arr[l] == arr[l + 1]) l++;
                while (r - 1 > l && arr[r] == arr[r - 1]) r--;
                l++;
                r--;
            }
        }
        
        return ans;
    }
}
