class Solution(object):
    def runningSum(self, nums):
       ans=[]
       total=0

       for i in nums:
           total+=i
           ans.append(total)
       return ans