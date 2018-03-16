package splitsAbs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Solution {

	public static void main(String[] args) {
		Solution s=new Solution();
//		int [] A= {1,3,-3};
		int [] A = {4,3,2,5,1,1};
		
		System.out.println(s.solution(A));
		
	}
	
	public int solution(int[] A) {
		List<Integer> resultList=new ArrayList<Integer>();
		for (int i = 0; i < A.length-1; i++) {
			List<Integer> left= new ArrayList<Integer>();  //lista de la izquierda
			List<Integer> right= new ArrayList<Integer>(); //lista de la derecha
			for (int j = 0; j < A.length; j++) {
				if(j<=i) {
					left.add(A[j]);
				}else {
					right.add(A[j]);
				}
				
			}
			
			int maxL = (int)Collections.max(left); //maximo de la izquierda
			int maxR = (int)Collections.max(right); // maximo de la derecha
			int abs= Math.abs(maxL-maxR);  // diferencia y valor absoluto
			resultList.add(abs);
		}
		
		return Collections.max(resultList);
		
		
	}

}
