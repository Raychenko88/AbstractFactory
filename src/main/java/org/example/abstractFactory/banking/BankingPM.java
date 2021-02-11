package org.example.abstractFactory.banking;

import org.example.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("PM managers banking project");
    }
}
