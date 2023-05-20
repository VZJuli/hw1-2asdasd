package com.example.hw12;


import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Item>dbManager=new ArrayList<>();
    static{
        dbManager.add(new Item(1L,"Macbook Pro","SSD250",1999.76 ));
        dbManager.add(new Item(2L,"Macbook Pro", "SSD564",1498.89));
        dbManager.add(new Item(2L,"Macbook Pro", "SSD500",2564.89));
        dbManager.add(new Item(2L,"Lenovo", "SSD564",1346.99));
        dbManager.add(new Item(2L,"HP", "SSD564",1289.45));
        dbManager.add(new Item(2L,"Asus", "SSD564",1367.89));

    }

    public static ArrayList<Item> getDbManager() {

        return dbManager;
    }
}

