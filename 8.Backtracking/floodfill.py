# asf -> answer so far
def floodfill(maze, sr, sc, asf,n,m,visited):
    if(sr<0 or sr >= n or sc<0 or sc >= m or maze[sr][sc]==1 or visited[sr][sc]==True):
    #invalid case
        return
    
    
    if (sr == n-1 and sc == m-1):
        print(asf);
        return
    
    visited[sr][sc]=True
    
    #top
    floodfill(maze, sr-1, sc, asf+'t',n,m,visited)
    #left
    floodfill(maze, sr, sc-1, asf+'l',n,m,visited)
    #down
    floodfill(maze, sr+1, sc, asf+'d',n,m,visited)
    #right
    floodfill(maze, sr, sc+1, asf+'r',n,m,visited)
    
    visited[sr][sc]=False

def main():
    n, m = input().split()
    n = int(n)
    m = int(m)
    arr = []
    for i in range(n):          
      row = list(map(int, input().split()))
      arr.append(row)
    
    
    visited = []

    
    for i in range(n):          
      row = [False]*m
      visited.append(row)
    floodfill(arr, 0, 0, "",n,m,visited);

main() 