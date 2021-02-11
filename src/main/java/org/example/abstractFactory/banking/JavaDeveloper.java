package org.example.abstractFactory.banking;

import org.example.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
