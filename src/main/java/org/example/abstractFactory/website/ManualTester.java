package org.example.abstractFactory.website;

import org.example.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests banking code");
    }
}
