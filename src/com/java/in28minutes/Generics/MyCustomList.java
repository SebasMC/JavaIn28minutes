package com.java.in28minutes.Generics;

import java.util.ArrayList;

//Para que solamente solo datos de tipo numerico
//public class MyCustomList<T extends Number> {
public class MyCustomList<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    public T getValue(int position){
        return list.get(position);
    }

    public String toString(){
        return list.toString();
    }

}
