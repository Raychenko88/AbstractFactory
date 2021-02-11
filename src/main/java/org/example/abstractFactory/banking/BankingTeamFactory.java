package org.example.abstractFactory.banking;

import org.example.abstractFactory.Developer;
import org.example.abstractFactory.ProjectManager;
import org.example.abstractFactory.ProjectTeamFactory;
import org.example.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
