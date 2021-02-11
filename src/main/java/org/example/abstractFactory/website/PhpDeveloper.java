package org.example.abstractFactory.website;

import org.example.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes java code");
    }
}
