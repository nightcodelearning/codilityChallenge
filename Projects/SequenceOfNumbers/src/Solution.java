import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {-1,1,3,3,3,2,  1, 0};
		Solution sol=new Solution();
		System.out.println(sol.solution(A));

	}

	 public int solution(int[] A) {
	        // write your code in Java SE 8
		 
		 if(A.length<3) {
			 return 0;
		 }
		 int contador=0;
		 
		 for (int i = 0; i < A.length-2; i++) {
			for (int j =i+3; j <= A.length; j++) {
				int [] myArray = Arrays.copyOfRange(A, i,j);
				if(evaluarTodo(myArray)) {
					contador++;
				}
			}
			
		}
		 
		 return contador;
	    }
	 
	 
	 public boolean evaluarTodo(int a[]) {
		 List<Boolean> lista =new ArrayList<>();
		 for (int i = 0; i < a.length-2; i++) {
			lista.add(isArithmethicTrio(a[i],a[i+1],a[i+2]));
		}
		 return !lista.contains(Boolean.FALSE);
		 
	 }
	 
	 public static boolean isArithmethicTrio(int a, int b, int c) {
		 if(a-b==b-c) {
			 return true;
		 }else {
			 return false;
		 }
		 
	 }
	 
	
	
}
