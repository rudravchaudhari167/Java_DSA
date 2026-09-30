class Solution{
    public int maxProduct(int[] nums){

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int answer = nums[0];

        for(int i=1;i<nums.length;i++){

            int num = nums[i];

            int tempMax = Math.max(num,Math.max(maxProduct*num,minProduct*num));

            int tempMin = Math.min(num,Math.min(maxProduct*num,minProduct*num));

            maxProduct = tempMax;
            minProduct = tempMin;

            answer = Math.max(answer,maxProduct);
        }

        return answer;
    }
}