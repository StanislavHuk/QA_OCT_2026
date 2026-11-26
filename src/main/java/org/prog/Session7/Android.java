package org.prog.Session7;

public class Android implements IPhone {
    @Override
    public void unlock() {
        System.out.println("Android Unlock with fingerprint");
    }
    @Override
    public void call() {
        System.out.println("call");
    }
    public String color;
    public String model;

}
