package readingJsonFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonEncode {
	private static final String filePath ="E:\\Mani bckup\\My Learning\\Java\\Json Demo File\\Demo.json";
	public static void main(String[] args) {
		JsonEncode obj=new JsonEncode();
		obj.JsonEncodeMethod();
		try {
			FileReader reader=new FileReader(filePath);
			JSONParser jsparser=new JSONParser();
			JSONObject jsobject= (JSONObject)jsparser.parse(reader);



			JSONArray jsarray=(JSONArray) jsobject.get("people");

			Iterator i=jsarray.iterator();
			/*
			 * while(i.hasNext()) { JSONObject innerObj = (JSONObject) i.next();
			 * 
			 * System.out.println("First Name"+innerObj.get("firstName")+"Lastname"+innerObj
			 * .get("lastName")+"Gender"+innerObj.get("gender")+"Age"+innerObj.get("age")+
			 * "Mynumber"+innerObj.get("number"));
			 * 
			 * 
			 * 
			 * }
			 */
			
			

			while(i.hasNext()) {
				JSONObject innerObj = (JSONObject) i.next();
						
				  String Firstname= (String)innerObj.get("firstName");
				  System.out.println(Firstname+" "); 
				  
				  String Lastname=(String)innerObj.get("lastName");
				  System.out.println(Lastname);
				  
				  String Gender= (String)innerObj.get("gender");
				  System.out.println(Gender);
				  
				  Long myage= (Long)innerObj.get("age"); 
				  System.out.println(myage+" ");
				  
				  Long mynumber = Long.valueOf((String)innerObj.get("number")); 
				  System.out.println(mynumber);
				  System.out.println(" ");
				 

			}
			
			

			
			




		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


public void JsonwithoutArrayReading() {
	
	/*
	 * JSONObject jsobject= (JSONObject)jparser.
	 * parse("E:\\\\Mani bckup\\\\My Learning\\\\Java\\\\Json Demo File\\\\Demo.json"
	 * );
	 * 
	 * String Lastname= (String)jsobject.get("lastName");
	 * System.out.println(Lastname);
	 * 
	 * String Gender= (String)jsobject.get("gender"); System.out.println(Gender);
	 * 
	 * Long id = (Long)jsobject.get("number"); System.out.println(id);
	 */

}

	public void JsonEncodeMethod() {
		String Uservalues[]=new String[]{"Ani", "Sam", "Joe"};
		JSONObject jsobject=new JSONObject();
		jsobject.put("Firstname", Uservalues[0]);
		jsobject.put("Lastname", Uservalues[1]);
		jsobject.put("Middlename", Uservalues[2]);

		JSONArray jsarray=new JSONArray();

		jsarray.add("Doctor");
		jsarray.add("Engineer");
		jsarray.add("Developer");

		jsobject.put("Designation", jsarray);

		System.out.println(jsobject);

	}

}
