package readingJsonFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

public class JsonFileReading {

	public static void jsonFilewrite1() {


		try {
			BufferedWriter writer=Files.newBufferedWriter(Paths.get("Customer.json")) ;

			// create customer object
			JsonObject customer = new JsonObject();
			customer.put("id", 1);
			customer.put("name", "John Doe");
			customer.put("email", "john.doe@example.com");
			customer.put("age", 32);
			System.out.println(customer.entrySet());


			// create address object
			JsonObject address = new JsonObject();
			address.put("street", "155 Middleville Road");
			address.put("city", "New York");
			address.put("state", "New York");
			address.put("zipCode", 10045);
			System.out.println(address.entrySet());


			// add address to customer
			customer.put("address", address);

			// add customer payment methods
			JsonArray pm = new JsonArray();
			pm.addAll(Arrays.asList("PayPal", "Stripe"));
			customer.put("paymentMethods", pm);


			// create projects
			JsonArray projects = new JsonArray();

			// create 1st project
			JsonObject p1 = new JsonObject();
			p1.put("title", "Business Website");
			p1.put("budget", 4500);
			System.out.println(p1.entrySet());
			// create 2nd project
			JsonObject p2 = new JsonObject();
			p2.put("title", "Sales Dashboard");
			p2.put("budget", 8500);
			System.out.println(p2.entrySet());
			// add projects
			projects.addAll(Arrays.asList(p1, p2));

			// add projects to customer
			customer.put("projects", projects);

			// write JSON to file
			Jsoner.serialize(customer, writer);
			writer.close();
			System.out.println("Json Created");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void JsonFileRead() {
		try {
			BufferedReader br=Files.newBufferedReader(Paths.get("customer.json"));
			
			JsonObject parser= (JsonObject) Jsoner.deserialize(br);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		jsonFilewrite1();
	}

}
