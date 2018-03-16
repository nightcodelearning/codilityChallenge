import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		
		Solution s=new Solution();
//		int[] A= {-1,1,3,3,3,2,  1, 0};
		int[] A= {1,  3,  5,  7, 9,11};
//		int[] A= {7,  7,  7,  7};
//		int[] A= {  3, -1, -5, -9};
//		int[] A= {1,3};
		
		System.out.println(s.solution(A));
		
	}
	
	public int solution(int[] A) {
		if(A.length<3) {
			return 0;
		}
		int solution=0;
		for (int i = 0; i < A.length-2; i++) {
			for (int j = i+3; j <= A.length; j++) {
				int[] newArray = Arrays.copyOfRange(A, i, j);
				if(evaluateAll(newArray)) {
					solution++;
				}
			}
		}
		
		return solution;
	
	}
	
	
	
	public static boolean evaluateAll(int a[]) {
		List<Boolean> boolList=new ArrayList<>(); 
		for (int i = 0; i < a.length-2; i++) {
			boolList.add(isArithmetic(a[i],a[i+1],a[i+2]));
		}
		return !boolList.contains(Boolean.FALSE);
		
	}
	
	
	public static boolean isArithmetic(int a,int b, int c) {
		boolean result=false;
		if(a-b == b-c) {
			return true;
		}
		return result;
	}

}
