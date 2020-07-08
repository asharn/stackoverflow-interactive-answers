package com.question.answer.json;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class XmlToJson {
    public static void main(String[] args) {
        String xmlString = "<users><user name=test1 age=20></user><report sub=eng score=30></report></users>";
        JSONObject jsonObject = XML.toJSONObject(xmlString);
        jsonObject.getJSONObject("users").put("report",new JSONArray().put(jsonObject.getJSONObject("users").getJSONObject("report")));
        jsonObject.put("users",new JSONArray().put(jsonObject.getJSONObject("users")));
        JSONArray jsonArray =  new JSONArray().put(jsonObject);
        System.out.println(jsonArray);
    }
}
