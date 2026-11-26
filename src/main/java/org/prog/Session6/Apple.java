package org.prog.Session6;

import org.prog.Session6.IPhone;

public class Apple implements IPhone {
    @Override
    public void unlock() {
        System.out.println("Apple Unlock with Face ID");
    }
    @Override
    public void call() {
        System.out.println("call");
    }
}