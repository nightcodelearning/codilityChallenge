
public class TestBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor=0;
		
		String str="1111100101000100000110000100000001000001";
		System.out.println(str);
		//valor=otroParse(str);
		valor=binaryToInteger(str);
		System.out.println(valor);
		
	}
	
	public static  int binaryToInteger(String binaryStr) {
	    char[] numbers = binaryStr.toCharArray();
	    int result = 0;
	    for(int i=numbers.length - 1; i>=0; i--)
	        if(numbers[i]=='1')
	            result += Math.pow(2, (numbers.length-i - 1));
	    return result;
	}
	
	public static int otroParse(String binaryStr) {
		int v= Integer.parseInt(binaryStr,2);
		return v;
	}

}
