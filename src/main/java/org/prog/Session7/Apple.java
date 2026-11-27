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

    @Override
    public boolean equals (Object obj) {
        if (obj instanceof Apple) {
            Apple apple = (Apple) obj;
            return apple.color.equals(this.color) && apple.model.equals(this.model);
        }
        return false;
    }
    @Override
    public int hashCode () {
        return this.color.hashCode() + this.model.hashCode();
    }
}