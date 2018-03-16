import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Programmer extends Writer{
	public void write() {
		System.out.println("Writing code");
	}

	public static void main(String[] args) {
		
		Writer w=new Programmer();
		w.write();
//		w.write();
//		new Programmer(1);
//		List<Integer> lista=new ArrayList<>();
//		lista.add(null);
//		lista.get(0);
//		System.out.println(lista.get(0));
		
		/*int x = 0;
		while(x < 10) {
			x++;
		}
		System.out.println(x);
		*/
		
		
	}
}
