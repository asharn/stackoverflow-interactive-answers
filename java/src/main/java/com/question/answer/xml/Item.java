package com.question.answer.xml;

import javax.xml.bind.annotation.XmlElement;

public class Item {
    private String dataType;
    private String name;
    private int data;
    private String group;
    private Items items;

    @XmlElement
    public String getDataType(){
        return dataType;
    }
    public void setDataType(String dataType){
        this.dataType = dataType;
    }

    @XmlElement
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @XmlElement
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;
    }

    @XmlElement
    public String getGroup(){
        return group;
    }
    public void setGroup(String group){
        this.group = group;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return
                "\n\tDataType: " + dataType +
                        "\n\tName: " + name +
                        "\n\tData: " + data +
                        "\n\tGroup: " + group +
                        "\n\tItems: " + items + "\n";
    }
}
