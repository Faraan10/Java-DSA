package graphs;

public class NumberOfIslands {
    
    int[] dx = {-1,-1,-1,0,0,1,1,1};
    int[] dy = {-1,0,1,-1,1,-1,0,1};
    
    public int solve(int[][] A) {

        int n = A.length;
        int m = A[0].length;

        boolean[][] vis = new boolean[n][m];

        int islands = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(A[i][j]==1 && !vis[i][j]){
                    islands++;
                    dfs(i,j,A,vis);
                }

            }
        }

        return islands;
    }

    private void dfs(int i,int j,int[][] A,boolean[][] vis){

        vis[i][j]=true;

        for(int k=0;k<8;k++){

            int ni=i+dx[k];
            int nj=j+dy[k];

            if(ni>=0 && ni<A.length &&
               nj>=0 && nj<A[0].length &&
               A[ni][nj]==1 &&
               !vis[ni][nj]){

                dfs(ni,nj,A,vis);
            }

        }
    }
}
