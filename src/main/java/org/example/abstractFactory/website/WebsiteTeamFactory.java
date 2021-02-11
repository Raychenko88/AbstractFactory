package org.example.abstractFactory.website;

import org.example.abstractFactory.Developer;
import org.example.abstractFactory.ProjectManager;
import org.example.abstractFactory.ProjectTeamFactory;
import org.example.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
