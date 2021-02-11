package org.example.abstractFactory.website;

import org.example.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("PM managers web project");
    }
}
