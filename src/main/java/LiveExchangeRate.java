import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONException;
import org.json.JSONObject;

//no connectivity to the DB yet
//retrieve the API key from openexchangerates.org

public class LiveExchangeRate {

    public static void main(String[] args) throws IOException, JSONException {
        String url = "https://openexchangerates.org/api/latest.json?app_id=YOUR_APP_ID&base=USD&symbols=EUR";
        URLConnection connection = new URL(url).openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line = reader.readLine();
        JSONObject jsonObject = new JSONObject(line);
        double rate = jsonObject.getJSONObject("rates").getDouble("EUR");
        System.out.println("Latest exchange rate: " + rate);
    }
}