package org.prog.Session7;

public class Apple implements IPhone {
    @Override
    public void unlock() {
        System.out.println("Apple Unlock with Face ID");
    }
    @Override
    public void call() {
        System.out.println("call");
    }
    public String color;
    public String model;
}