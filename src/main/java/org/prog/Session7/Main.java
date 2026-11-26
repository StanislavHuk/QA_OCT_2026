package org.prog.Session7;

public class Main {
    public static void main(String[] args) {
       Android android1 = new Android();
       Android android2 = new Android();
       Apple apple = new Apple();
       unlockAndCall(android1);
       unlockAndCall(apple);
       android2.color = "red";
       android2.model = "Samsung s25";

       android1.color = "red";
       android1.model = "Samsung s25";

       apple.color = "blue";
       apple.model = "Apple 17 pro";

       System.out.println("================================");

//Сравнение Android и Apple по model и color методами equals и hashCode
       System.out.println(android1.color.equals(apple.color));
       System.out.println(android1.model.equals(apple.model));
       System.out.println(android1.hashCode());
       System.out.println(apple.hashCode());
       System.out.println("================================");

       System.out.println(android2.color.equals(android1.color));
       System.out.println(android2.model.equals(android1.model));
       System.out.println(android2.color.hashCode());
       System.out.println(android1.color.hashCode());
       System.out.println("================================");

       System.out.println(apple.color.equals(android2.color));
       System.out.println(apple.model.equals(android2.model));
       System.out.println(apple.hashCode());
       System.out.println(android2.hashCode());
       System.out.println("================================");
    }
    public static void unlockAndCall(IPhone phone) {
        phone.unlock();
        phone.call();
    }

}