package com.question.answer.json;

/*import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;*/

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;

public class XmlToJson {
    /*    public static void main(String[] args) throws JSONException {
            String xmlString = "<users><user name=test1 age=20></user><report sub=eng score=30></report></users>";
            JSONObject jsonObject = XML.toJSONObject(xmlString);
            jsonObject.getJSONObject("users").put("report",new JSONArray().put(jsonObject.getJSONObject("users").getJSONObject("report")));
            jsonObject.put("users",new JSONArray().put(jsonObject.getJSONObject("users")));
            JSONArray jsonArray =  new JSONArray().put(jsonObject);
            System.out.println(jsonArray);
        }*/
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Object nestedPOJO = mapper.readValue(loadDataAsString("payload - Copy.json"), Object.class);
    }
    /**
     * This method will help to load data from the respective JSON file.
     * @param dataRequestType String
     * @return String
     */
    protected static String loadDataAsString(String dataRequestType) {
        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            File file = new File(Objects.requireNonNull(classLoader.getResource(dataRequestType)).getFile());
            return new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            //glLogger.error("Exception occurred during load data for {}", dataRequestType, e);
            e.printStackTrace();

        }
        return null;
    }
}
