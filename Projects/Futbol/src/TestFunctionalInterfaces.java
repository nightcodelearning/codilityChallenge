import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona p1 = new  Persona("jesus", "de nazareth", 33);
		Persona p2 = new  Persona("pedro", "perez", 12);
		Persona p3 = new  Persona("mariana", "pajon", 28);
		Persona p4 = new  Persona("nataly", "portman", 35);
		Persona p5 = new  Persona("ellon", "musk", 18);
		
		
		List<Persona> lista =new ArrayList<Persona>();
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		
		Consumer<Persona> consumer=p -> System.out.println(p); 
		Consumer<Integer> consumerInt=p -> System.out.println(p); 
		Predicate<Persona> predicate= z -> {
			if(z.getEdad()>28){
				return true;
			}
			return false;
			
		};
		
		Function<Persona,Integer> myFunction= y ->  y.getEdad();
		
		
			
		//.forEach(consumer);
		lista.stream().filter(predicate).map(myFunction).forEach(consumerInt);
			
		} 
		
		
		
		
		
		
		
		
		
		
		
		

	

}
