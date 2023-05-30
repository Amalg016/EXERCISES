package test;

import java.util.Iterator;

public class FloodProblem {

static int row=5;
static int col=5;
static int[][]   mat= {{1,1,0,1,0},{1,1,1,0,1},{0,1,1,0,0},{1,0,0,0,1},{0,0,1,0,0}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     change(2,2,2);   
    	  int j=0;
    	  while(j<col) {
    		  for(int i=0;i<row;i++) {
    			  System.out.print(mat[j][i]+" ");
    		  }
    		  System.out.println();
    		  j++;
    	  }
     }


    static void change(int x,int y, int val) {
		if(mat[x][y]==1) {
		  mat[x][y]=val;	
		}
		if(x!=0) {
			if(mat[x-1][y]==1) {
				change(x-1, y, val);
			}		
		}
		if(x!=row-1) {
			if(mat[x+1][y]==1) {
				change(x+1,y,val);
			}
		}
		if(y!=0) {
			if(mat[x][y-1]==1) {
				change(x,y-1,val);
			}		
		}
		if(y!=col-1) {
			if(mat[x][y+1]==1) {
				change(x,y+1,val);
			}
		}
		
	}
	
}
