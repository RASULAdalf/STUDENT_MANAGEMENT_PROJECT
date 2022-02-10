

import org.bson.Document;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;

class check{
	public String name="Ranuka";
	
}

public class TEST {

	public static void main(String[] args) throws ParseException {
		
		ConnectionString connectionString = new ConnectionString("mongodb+srv://new_user:root@studentdb.epiay.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
       .applyConnectionString(connectionString)
       .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Student_db");
        MongoCollection<org.bson.Document> collection = database.getCollection("Student_Data");
        
        /*collection.updateOne(
                Filters.eq("USER","Ranuka"),
                Updates.set("USER", "RASULA"));
                */
		Document doc = collection.find(Filters.eq("USER","Ranuka")).first();
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(doc.toJson());
		String name = (String) jsonObject.get("USER");
        System.out.println(name);
		
		


	}

}
		
