package hit.day13;

public class StringDemo {

	public static void main(String[] args) {
		String s="hello";//recommended approach by default
		String st=new String("hello");
		System.out.println(s.hashCode());
		System.out.println(st.hashCode());
		System.out.println(s==st);
		System.out.println(s.equals(st));//if both the hashcodes are same then the result will be true
		
		//string objects are non mutable or immutable...
		
		String temp="hello new temp world..."+s;
		//+ - is a concatenation operator
		System.out.println(temp);
		System.out.println(s);
		
		String mystore=s;
		
		s=s+"new value....";
		System.out.println(s);
		
		System.out.println(mystore);
		//string is non mutable... once u declare a string.. the string value cannot be changed...
						
		char c=s.charAt(2);
		System.out.println(c);
		System.out.println(s.substring(2, 4));
		//System.out.println(mystore==st);
		//System.out.println(mystore.equals(st));
	}
	}

