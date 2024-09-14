
# Unique Paths
## Accumulate #waysFromEachCell to reach destination in 2D dp
### Recursive Approach:
Idea is to try all possible ways to reach destination, 
<br>
<u> Base Case </u>
  - if reached => return 1 // found a new way
  - if cell is outside the boundries of grid => return 0 // found no way

<u> Recursive approach </u>
  - goRight = recurse(i, j + 1) 
  - goDown = recurse(i + 1, j) 
  - => return goRight + goDown 
 
 ### Recursive DP:
 Above approach has overlapping sub-problems. 
 If we have #waysFromCell[i][j] already calculated, then we can remember that count in a 2D dp array called 
 "waysFrom[][]".
 Everytime before recursing (goDown & goRight) we check if we have count calculated for grid[i][j] in waysFrom[i][j] position. If yes we return it, else we recurse.
 
<u> Base Case </u>
  - if reached => return 1 // found a new way
  - if cell is outside the boundries of grid => return 0 // found no way

<u> DP check </u>
  - if (waysFromThisCell != -1) => return 1	
  
<u> Recursive approach </u>
  - goRight = recurse(i, j + 1) 
  - goDown = recurse(i + 1, j) 
  - => return goRight + goDown 
