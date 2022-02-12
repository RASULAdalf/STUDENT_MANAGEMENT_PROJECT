import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test {
    public static void main(String[] args) throws IOException, ParseException {

        URL obj = new URL("https://api.myip.com/");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent","Mozilla/5.0");
        int responseCode = con.getResponseCode();
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(reader.readLine());
        String name = (String) jsonObject.get("ip");
        System.out.println(name);
        System.out.println(responseCode);

        URL obj2 = new URL("");
        HttpURLConnection con2 = (HttpURLConnection) obj2.openConnection();
        con2.setRequestMethod("POST");
        con2.setRequestProperty("User-Agent","Mozilla/5.0");
        con2.setDoOutput(true);
        OutputStream os = con2.getOutputStream();
        os.write(new String("user=r").getBytes());
        os.flush();os.close();



    }
}
