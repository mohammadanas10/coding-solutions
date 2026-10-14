# Surface Area of 3D Shapes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an `n x n` `grid` where you have placed some `1 x 1 x 1` cubes. Each value `v = grid[i][j]` represents a tower of `v` cubes placed on top of cell `(i, j)`.

After placing these cubes, you have decided to glue any directly adjacent cubes to each other, forming several irregular 3D shapes.

Return  *the total surface area of the resulting shapes*.

 **Note:**  The bottom face of each shape counts toward its surface area.

 

 **Example 1:** 

```
Input: grid = [[1,2],[3,4]]
Output: 34

```

 **Example 2:** 

```
Input: grid = [[1,1,1],[1,0,1],[1,1,1]]
Output: 32

```

 **Example 3:** 

```
Input: grid = [[2,2,2],[2,1,2],[2,2,2]]
Output: 46

```

 

 **Constraints:** 

- n == grid.length == grid[i].length
- 1 <= n <= 50
- 0 <= grid[i][j] <= 50

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 71.32%)  
**Memory:** 46.1 MB (beats 68.87%)  
**Submitted:** 2026-10-14T08:33:25.776Z  

```java
class Solution {
    public int surfaceArea(int[][] grid) {
        int area=0;
        for(int i=0;i<grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                int h=grid[i][j];

                if(h>0){
                    area += 2;
                    area += h*4;


                    if(i>0)
                        area -= 2*Math.min(h,grid[i-1][j]);
                    if(j>0)
                     area -= 2*Math.min(h,grid[i][j-1]);
                }
            }
        }
        return area;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/surface-area-of-3d-shapes/)