import java.util.*;

public class SetGenerics {
	static Set<Integer> n=new HashSet();

	public static Set countryNames()
	{

		Set<String> cl=new HashSet();
		cl.add("India");
		cl.add("England");
		cl.add("South Africa");
		cl.add("America");
		cl.add("Sri Lanka");
		return cl;
	}

	public static Set NumberList()
	{

		for(int i=1;i<=10;i++)
			n.add(i);
		return n;
	}
	public static Set NewNumberList()
	{

		for(int i=11;i<=15;i++)
			n.add(i);

		return n;
	}




	public static void main(String[] args) {
		System.out.println(countryNames());
		System.out.println(NumberList());
		System.out.println(NewNumberList());

	}