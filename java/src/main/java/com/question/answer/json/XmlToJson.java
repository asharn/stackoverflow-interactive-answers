package com.question.answer.json;

/*import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;*/

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Objects;

import org.apache.tomcat.util.codec.binary.StringUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;


public class XmlToJson {
    /*    public static void main(String[] args) throws JSONException {
            String xmlString = "<users><user name=test1 age=20></user><report sub=eng score=30></report></users>";
            JSONObject jsonObject = XML.toJSONObject(xmlString);
            jsonObject.getJSONObject("users").put("report",new JSONArray().put(jsonObject.getJSONObject("users").getJSONObject("report")));
            jsonObject.put("users",new JSONArray().put(jsonObject.getJSONObject("users")));
            JSONArray jsonArray =  new JSONArray().put(jsonObject);
            System.out.println(jsonArray);
        }*/

    public static class Data1{
        @JsonProperty("Name")
        private String name;
        @JsonProperty("Number")
        private int number;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            name = name;
        }
        public int getNumber() {
            return number;
        }
        public void setNumber(int number) {
            number = number;
        }
    }
    public static class Data {
        @JsonProperty("Data1")
        Object data1;
        public Object getData1() {
            return data1;
        }
        public void setData1(Object data1) {
            this.data1 = data1;
        }

    }
    /*public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //Object data1 = mapper.readValue("b'{\\n  \"mime-version\": \"1.0\",\\n  \"x-bbounce\": \"251383442|3165745|name@company.co.il|97|0|1094|4\",\\n  \"content-type\": \"multipart/alternative; \\\\n\\\\tboundary=\\\\\"----E85308AFD03B4874842B50FC08B1E8C9\\\\\"\",\\n  \"x-received\": \"by 2002:a17:906:b24d:: with SM\"}'\n", Object.class);
        //Object data1  = new Gson().fromJson("b'{\\n  \"mime-version\": \"1.0\",\\n  \"x-bbounce\": \"251383442|3165745|name@company.co.il|97|0|1094|4\",\\n  \"content-type\": \"multipart/alternative; \\\\n\\\\tboundary=\\\\\"----E85308AFD03B4874842B50FC08B1E8C9\\\\\"\",\\n  \"x-received\": \"by 2002:a17:906:b24d:: with SM\"}'\n", Object.class);
        //JSONObject data1 = new JSONObject("b'{\\n  \"mime-version\": \"1.0\",\\n  \"x-bbounce\": \"251383442|3165745|name@company.co.il|97|0|1094|4\",\\n  \"content-type\": \"multipart/alternative; \\\\n\\\\tboundary=\\\\\"----E85308AFD03B4874842B50FC08B1E8C9\\\\\"\",\\n  \"x-received\": \"by 2002:a17:906:b24d:: with SM\"}'\n");
        //new JSONParser();
        //JSONObject json = (JSONObject) JSONSerializer.toJSON( jsonTxt );
        String str ="b'{\\n  \"mime-version\": \"1.0\",\\n  \"x-bbounce\": \"251383442|3165745|name@company.co.il|97|0|1094|4\",\\n  \"content-type\": \"multipart/alternative; \\\\n\\\\tboundary=\\\\\"----E85308AFD03B4874842B50FC08B1E8C9\\\\\"\",\\n  \"x-received\": \"by 2002:a17:906:b24d:: with SM\"}'\n";
        //byte[] bytes = StringUtils.getBytesUtf8(str);
        byte[] b = str.getBytes(StandardCharsets.UTF_8);

        String utf8EncodedString = StringUtils.newStringUtf8(b);
        System.out.println(mapper.writeValueAsString(utf8EncodedString));
    }*/

    public static void main(String[] args) throws IOException {
        /*ProcessBuilder processb = new ProcessBuilder("mailparser", "-f", "path to mail file", "-j");
        Process process = processb.start();
        //BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedInputStream stdInput = new BufferedInputStream(process.getInputStream());
*/
       /* String str ="b'{\\n  \"mime-version\": \"1.0\",\\n  \"x-bbounce\": \"251383442|3165745|name@company.co.il|97|0|1094|4\",\\n  \"content-type\": \"multipart/alternative; \\\\n\\\\tboundary=\\\\\"----E85308AFD03B4874842B50FC08B1E8C9\\\\\"\",\\n  \"x-received\": \"by 2002:a17:906:b24d:: with SM\"}'\n";
        InputStream targetStream = new ByteArrayInputStream(str.getBytes());

        Reader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(str.getBytes())));
        StringBuilder sb = new StringBuilder();
        int byteChar;

        try {
            while((byteChar = reader.read()) != -1) {
                sb.append((char) byteChar);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        sb.toString();*/


/*        String s = "";
        String line = "";
        while ((s = stdInput.toString()) != null) {
            line += s;
        }*/

       // JSONObject json = new JSONObject("line");


        /*File file = new File("src/main/resources/moti.jpeg");
        InputStream inputStream = new FileInputStream(file);
        StringBuilder textBuilder = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader
                (inputStream, Charset.forName(StandardCharsets.UTF_8.name())))) {
            int c = 0;
            while ((c = reader.read()) != -1) {
                textBuilder.append((char) c);
            }
        }
        System.out.println(textBuilder);*/
        int a=1;
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
