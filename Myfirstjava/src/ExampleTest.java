import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExampleTest {
	
	public static void main(String[] args) {
		String st=" Hello world ";
		System.out.println(st.isEmpty());
		System.out.println(st.isBlank());
		
		System.out.println(st.stripLeading() +"hhhhhh");
		System.out.println(st.stripTrailing()+"hhhhhhh");
		System.out.println(st.strip()+"hhhhhhhhhhhh");
		System.out.println(st.stripIndent()+"hhhhhhhhhhh");
		
		System.out.println(st.repeat(5));
		
		String str="Hello \n Java \n Programming";
		System.out.println(str.lines().count());
		System.out.println(str.lines().collect(Collectors.toList()));
	}

}
