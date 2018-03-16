package decimalZip;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s=new Solution();
		
		System.out.println(s.solution(99999999 ,99999999));
//		100,000,000
//		 99,999,999
	}
	
	public int solution(int A, int B) {
		Long solution=0L;
		int limit=100_000_000;
		String aPrima = String.valueOf(A);
		String bPrima = String.valueOf(B);
		
		int aLen = aPrima.length(); //tamaño de A
		int bLen = bPrima.length(); //tamaño de B
		String temp="";  //almacena el valor de cada número
		
		for (int i = 0; i < aLen||i < bLen; i++) {
			if(i<aLen) {
				temp+=aPrima.charAt(i);
			}
				if(i<bLen){
				temp+=bPrima.charAt(i);
			}
			
		}
		
		solution=Long.parseLong(temp);
		if(solution>limit) {
			return -1;
		}
		
		return  Math.toIntExact(solution);
	
	}

}
