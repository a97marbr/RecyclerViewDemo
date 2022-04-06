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

    private class Auxdata {
        private String wiki;
        private String img;
    }
}
