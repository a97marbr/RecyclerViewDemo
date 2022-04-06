package com.example.recyclerviewdemo;

public class Mountain {
        /*
        {
            "ID":"mobilprog_kinnekulle",
            "name":"Kinnekulle",
            "type":"brom",
            "company":"",
            "location":"Skaraborg",
            "category":"",
            "size":306,
            "cost":1004,
            "auxdata":{
                        "wiki":"https://sv.wikipedia.org/wiki/Kinnekulle",
                        "img":""}
          }
         */
    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    private Auxdata auxdata;

    public Mountain(String ID, String name, String type, String company, String location, String category, int size, int cost, Auxdata auxdata) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.company = company;
        this.location = location;
        this.category = category;
        this.size = size;
        this.cost = cost;
        this.auxdata = auxdata;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Auxdata getAuxdata() {
        return auxdata;
    }

    public void setAuxdata(Auxdata auxdata) {
        this.auxdata = auxdata;
    }

    private class Auxdata {
        private String wiki;
        private String img;

        public Auxdata(String wiki, String img) {
            this.wiki = wiki;
            this.img = img;
        }

        public String getWiki() {
            return wiki;
        }

        public void setWiki(String wiki) {
            this.wiki = wiki;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }
    }
}
