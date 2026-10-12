# Most Frequent Even Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, return  *the most frequent even element*.

If there is a tie, return the  **smallest**  one. If there is no such element, return `-1`.

 

 **Example 1:** 

```
Input: nums = [0,1,2,2,4,4,1]
Output: 2
Explanation:
The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
We return the smallest one, which is 2.
```

 **Example 2:** 

```
Input: nums = [4,4,4,9,2,4]
Output: 4
Explanation: 4 is the even element appears the most.

```

 **Example 3:** 

```
Input: nums = [29,47,21,41,13,37,25,7]
Output: -1
Explanation: There is no even element.

```

 

 **Constraints:** 

- 1 <= nums.length <= 2000
- 0 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 133 ms (beats 5.13%)  
**Memory:** 47.5 MB (beats 79.81%)  
**Submitted:** 2026-10-12T13:48:01.908Z  

```java
class Solution {
    public int mostFrequentEven(int[] nums) {
        int ans=-1;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int count=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count > max || (count == max && nums[i] < ans)){
                    max=count;
                    ans=nums[i];
                }
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/most-frequent-even-element/)