package com.question.answer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LetsPlayWithJSoup {


    public static void main(String[] args) {


        // Parse HTML String using JSoup library

        String HTMLSTring = "<html>\n" +
                " <head></head>\n" +
                " <body>\n" +
                "  <table class=\"table\"> \n" +
                "   <tbody>\n" +
                "    <tr> \n" +
                "     <td><strong>Weather: </strong>Light Rain</td> \n" +
                "    </tr> \n" +
                "    <tr> \n" +
                "     <td><strong>Tempratue: </strong>70 C</td> \n" +
                "    </tr> \n" +
                "    <tr> \n" +
                "     <td><strong>Visibility: </strong>Limited</td> \n" +
                "    </tr> \n" +
                "    <tr> \n" +
                "     <td><strong>Runs open: </strong>0</td> \n" +
                "    </tr>\n" +
                "   </tbody>\n" +
                "  </table>\n" +
                " </body>\n" +
                "</html>"
                + "<head></head>";

        Document html = Jsoup.parse(HTMLSTring);
        Elements tds = html.getElementsByTag("td");
        for (Element td : tds) {
            //String tdStrongText = td.childNode(0).childNodes().get(0).toString();
            String tdStrongText = td.select("strong").text();
            System.out.print(tdStrongText + " : ");
            String tdText = td.childNode(1).toString();
            System.out.println(tdText);
        }
    }

}
