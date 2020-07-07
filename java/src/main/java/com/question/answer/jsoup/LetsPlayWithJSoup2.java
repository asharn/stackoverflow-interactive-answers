package com.question.answer.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LetsPlayWithJSoup2 {


    public static void main(String[] args) {
        String htmlString = "<html>\n" +
                " <head></head>\n" +
                " <body>\n" +
                "<ul class=\"detail-main-list\">\n" +
                "  <li> \n" +
                "    <a href=\"/manga/toki_wa/v01/c001/1.html\" title=\"Toki wa... Vol.01 Ch.001 -Toki wa... target=\"_blank\"> Dis Be the link</a>\n" +
                "   </li> \n" +
                "</ul>" +
                " </body>\n" +
                "</html>"
                + "<head></head>";
        Document html = Jsoup.parse(htmlString);
        Elements elements = html.select("a");
        for(Element element: elements){
            System.out.println(element.attr("href"));
        }
    }

}
