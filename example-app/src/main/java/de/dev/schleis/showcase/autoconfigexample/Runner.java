package de.dev.schleis.showcase.autoconfigexample;

import de.dev.schleis.showcase.springbootstartershowcase.MyConfigAdapter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private MyConfigAdapter myConfigAdapter;

    public Runner(MyConfigAdapter myConfigAdapter) {
        this.myConfigAdapter = myConfigAdapter;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(myConfigAdapter.run());
    }
}
