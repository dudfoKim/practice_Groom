class Solution
{
    public int solution(int[] nums)
    {
        int cnt = 0;
        boolean chk = true;

        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                for(int k=j+1; k<nums.length; k++)
                {
                    int temp = nums[i] + nums[j] + nums[k];
                    chk = true;
            
                    for(int x=2; x*x<=temp; x++)
                    {
                        if(temp%x==0)
                        {
                            chk = false;
                        }
                    }

                    if(chk)
                    {
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
    }
}
