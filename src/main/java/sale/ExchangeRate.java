package sale;

import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ExchangeRate {

    public static void showExchangeRate(JComboBox comboBox, JLabel label){
        String apiURL = "https://openexchangerates.org/api/latest.json?app_id=c8d2619d67494c45b9fb6d1833872198&base=USD";
        double exchangeRate;
        try {
            URL url = new URL(apiURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));
            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            br.close();

            JSONObject json = new JSONObject(sb.toString());
            JSONObject rates = json.getJSONObject("rates");
            if (comboBox != null){
                exchangeRate = rates.getDouble(comboBox.getSelectedItem().toString());
                if (label != null){
                    label.setText(Double.toString(exchangeRate));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}