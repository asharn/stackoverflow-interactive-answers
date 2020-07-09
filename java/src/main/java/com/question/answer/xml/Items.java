package com.question.answer.xml;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "items")
public class Items {
    private List<Item> item;

    @XmlElement(name = "item")
    public List<Item> getItem(){
        return item;
    }

    public void setItem(List<Item> itemList){
        this.item = itemList;
    }

    @Override
    public String toString() {
        return "\n" + item ;
    }
}