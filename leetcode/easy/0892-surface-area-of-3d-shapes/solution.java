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