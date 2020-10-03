package org.example;

import java.util.function.Function;

public class Addition {


    public  static  void main(String args[]){
        Function<String ,String> function= s -> s.substring(3);
        String st="lklfjsadjafjdj";
        String stq=function.apply(st);
        System.out.println("Stq:"+stq);
    }

}
