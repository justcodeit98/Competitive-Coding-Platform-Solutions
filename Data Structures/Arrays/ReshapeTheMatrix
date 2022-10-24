// https://leetcode.com/problems/reshape-the-matrix/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c){
            return mat;
        }       
        int[][] soln=new int[r][c];
        int iteration=r*c;
        int r_iter=0,c_iter=0,m_iter=0,n_iter=0;
        while(iteration!=0){
            soln[r_iter][c_iter]=mat[m_iter][n_iter];
            c_iter++;
            n_iter++;
            if(c_iter==c){
                c_iter=0;
                r_iter++;
            }
            if(n_iter==n){
                n_iter=0;
                m_iter++;
            }
            iteration--;
        }
        return soln;
    }
}
