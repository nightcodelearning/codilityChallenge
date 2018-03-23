
public class sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String S="00011100";
		
		String S="00110010";
		
		sol sol=new sol();
		System.out.println(sol.solution(S));
		

	}
	
	
	public int solution(String S) {

				int v= Integer.parseInt(S,2);

				int pasos=0;
				while(v!=0) {
					if ( (v & 1) == 0 ) {
						v=v/2; 
						//es par
					} else {
						v--;
						//impar
					}
					
//					if(v%2==0) {
//						//es par 
//						v=v/2;
//					}else {
//						//impar
//						v--;
//					}
					pasos++;
				}
				return pasos;
		
	}

}
