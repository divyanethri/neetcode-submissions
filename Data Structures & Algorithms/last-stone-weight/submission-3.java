class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        for(int j=0; j<stones.length;j++){
                int x = 0;
                int y = 0;
                int xi =0;
                int yi =0;
            for(int i=0; i<stones.length;i++){
                if(stones[i] >= x) {
                    y = x;
                    x = stones[i];
                    yi = xi;
                    xi = i;

                }
                else if(stones[i] >= y){
                    y = stones[i];
                    yi = i;
                }
            }
            if(x == y){
                stones[xi] =0;
                stones[yi] = 0;
            } 
            else if(x > y) 
            {
                stones[xi] = x - y;
                stones[yi] = 0; 
            }
        }

        for(int i=0; i<stones.length;i++){
            if(stones[i] !=0) return stones[i]; 
        }

    return 0;
    }
}
