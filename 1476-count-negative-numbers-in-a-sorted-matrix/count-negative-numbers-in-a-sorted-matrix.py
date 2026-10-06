class Solution:
    def countNegatives(self, grid: list[list[int]]) -> int:
        return sum(x < 0 for row in grid for x in row)