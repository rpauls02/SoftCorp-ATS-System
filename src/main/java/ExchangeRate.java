import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

public class ExchangeRate {
    public static void main(String[] args) throws IOException, JSONException {
        String apiURL = "https://openexchangerates.org/api/latest.json?app_id=c8d2619d67494c45b9fb6d1833872198&base=USD";

        URL url = new URL(apiURL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output;
        StringBuilder sb = new StringBuilder();
        while ((output = br.readLine()) != null) {
            sb.append(output);
        }

        conn.disconnect();

        JSONObject json = new JSONObject(sb.toString());
        JSONObject rates = json.getJSONObject("rates");

        Iterator<String> keys = rates.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Double rate = rates.getDouble(key);
            System.out.println("1 USD = " + rate + " " + key);
        }
    }
}