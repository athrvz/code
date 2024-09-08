# House Robber 2
## 2 rounds of robbery, 1st exclude last house then 2nd exclude first one.
As the given range of houses are in circular fashion we cannot rob the adjacent houses, 
we can either rob first or the last one. 
 - Conduct 2 rounds of house robber 1 dp solution. 
  - First exclude last house, range of houses [0, n - 2]
  - Second exclude first house, range of houses [1, n - 1]