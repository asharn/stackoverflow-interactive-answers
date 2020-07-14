package com.question.answer.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StateWiseData {
    /*public static void main(String[] args) throws JsonProcessingException {
        String data="";
        String dataParsed="";
        String singleParsed="";
        try {
            URL url = new URL("https://api.covidindiatracker.com/state_data.json");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }
            System.out.print(data);

            JSONArray JA = new JSONArray(data);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }*/
    public static void main(String...arr) {
        /*String date1 = new SimpleDateFormat("dd/MM/yy").format(new Date(new Date().getTime() + 24*24*60*60*1000));
        String date2 = new SimpleDateFormat("dd/MM/yy").format(new Date(new Date().getTime() + 25*24*60*60*1000));
        int abc = 24*24*60*60*1000;
        int def = 25*24*60*60*1000;
        System.out.println(abc);
        System.out.println(def);*/
        System.out.println(String.format("%.4g", 0.1234712));

        System.out.println(String.format("%.4g", 0.000987654321));

    }
}
