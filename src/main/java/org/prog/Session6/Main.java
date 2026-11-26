package org.prog.Session6;

public class Main {
    public static void main(String[] args) {
       Android android = new Android();
       Apple apple = new Apple();
       unlockAndCall(android);
       unlockAndCall(apple);
    }
    public static void unlockAndCall(IPhone phone) {
        phone.unlock();
        phone.call();
    }
}