
# Minimum Falling Path Sum
## On each recurse update #minSumAt[i][j] with min(rightDig, down, leftDig) in 2D dp
### Recursive Approach:
Idea is to try all possible ways to reach final row, 
<br>
<u> Base Case </u>
  - if rowIdx == n - 1 => return mat[rowIdx][colIdx] // got to the end

<u> Recursive approach </u>
  - if (not going outOfBound) rightDig = mat[row][col] + recurse(row + 1, col - 1) 
  - if (not going outOfBound) down = mat[row][col] + recurse(row + 1, col)
  - if (not going outOfBound) leftDig = mat[row][col] + recurse(row + 1, col + 1) 
  - => return min(rightDig, down, leftDig);
 
 ### Recursive DP:
 Above approach has overlapping sub-problems. 
 If we have #minSumAt[row][col] already calculated, then we can remember that minSum in a 2D dp array called 
 "minSumAt[][]". Init it with INT_MAX (as we are trying to minimize the sum)
 Everytime before recursing (goDown & goRight) we check if we have count calculated for grid[i][j] in waysFrom[i][j] position. If yes we return it, else we recurse.
 
<u> Base Case </u>
  - if rowIdx == n - 1 => return mat[rowIdx][colIdx] // got to the end

<u> DP check </u>
  - if (minSumAt[row][col] != INT_MAX) => return minSumAt[row][col]	
  
<u> Recursive approach </u>
  - if (not going outOfBound) rightDig = mat[row][col] + recurse(row + 1, col - 1) 
  - if (not going outOfBound) down = mat[row][col] + recurse(row + 1, col)
  - if (not going outOfBound) leftDig = mat[row][col] + recurse(row + 1, col + 1) 
  - => return minSumAt[row][col] = min(rightDig, down, leftDig);
