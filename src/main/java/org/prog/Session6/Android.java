package org.prog.Session6;

import org.prog.Session6.IPhone;

public class Android implements IPhone {
    @Override
    public void unlock() {
        System.out.println("Android Unlock with fingerprint");
    }
    @Override
    public void call() {
        System.out.println("call");
    }
}
