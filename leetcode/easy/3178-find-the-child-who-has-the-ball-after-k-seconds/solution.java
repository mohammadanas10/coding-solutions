class Solution {
    public int numberOfChild(int n, int k) {
        int p=0;
        int d=1;

        for(int i=0;i<k;i++){
            p += d;
            if(p == n-1 || p==0){
                d =- d;
            }
        }
        return p;
    }
}