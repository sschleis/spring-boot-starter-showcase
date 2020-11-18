package de.dev.schleis.showcase.autoconfigexample;

import de.dev.schleis.showcase.springbootstartershowcase.MyConfigAdapter;
import org.springframework.stereotype.Component;

@Component
public class SpezialAdapterBean implements MyConfigAdapter {

    @Override
    public String run() {
        return "Spezial Bean";
    }
}
