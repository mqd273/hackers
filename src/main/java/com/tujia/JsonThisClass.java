package com.tujia;

import com.google.gson.Gson;
import org.eclipse.jetty.util.ajax.JSON;

/**
 * Created by lidongw_1 on 2019/6/20.
 */
public class JsonThisClass {

    public static void main(String[] args) {

        Gson gson = new Gson();

        JSON jsn =new JSON();
        Obj obj = new Obj();
        obj.setName("aaa");

        System.out.println(obj.toJson());

        System.out.println(jsn.toJSON(obj));

        System.out.println(gson.toJson(obj));



    }


   static class Obj{

        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toJson(){
            Gson gson = new Gson();
            return gson.toJson(this);
        }
    }
}
