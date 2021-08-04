package hit.day40;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception{
		Properties prop =new Properties();
//		HashMap prop=new HashMap();
//		prop.put("a1","Hello Everyone");
//		prop.put("a2","Hello Sam");
		
		prop.load(new FileInputStream("config.properties"));
		
		System.out.println(prop.get("a1"));

		Set set= prop.entrySet();
		Iterator iter =set.iterator();
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}

}
