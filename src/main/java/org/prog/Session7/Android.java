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

@Override
    public boolean equals (Object obj) {
        if (obj instanceof Android) {
            Android android = (Android) obj;
            return android.color.equals(this.color) && android.model.equals(this.model);
        }
        return false;
    }
    @Override
    public int hashCode () {
        return this.color.hashCode() + this.model.hashCode();
    }
}