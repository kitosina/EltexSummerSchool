package ru.Eltex.kitosina;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException {
        DataClass Ref=new DataClass();
        Class getterClass=Ref.getClass();
        String NameClass=getterClass.getName();
        System.out.println("Name Class: "+NameClass);
        System.out.println("");
        Field[] publicFields=getterClass.getFields();
        for(Field field: publicFields){
            Class fieldType=field.getType();
            System.out.println("Name: "+field.getName());
            System.out.println("Type: "+fieldType.getName());
            System.out.println(" ");
        }
        Method[] methods=getterClass.getMethods();
        for (Method method: methods){
            System.out.println("Name Method: "+method.getName());
            System.out.println("Type Method: "+method.getReturnType());
            Class[] paramTypes=method.getParameterTypes();
            System.out.print("Type Parametr: ");
            for(Class paramType: paramTypes){
                System.out.print(" "+paramType.getName());
            }
            System.out.println(" ");
        }
    }
}
