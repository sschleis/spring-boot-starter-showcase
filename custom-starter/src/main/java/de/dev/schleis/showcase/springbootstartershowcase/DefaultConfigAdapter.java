package de.dev.schleis.showcase.springbootstartershowcase;

public class DefaultConfigAdapter implements MyConfigAdapter{

    @Override
    public String run() {
        return "Default Bean";
    }
}
