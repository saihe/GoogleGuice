package ksaito.guice.batch;

import com.google.inject.Guice;
import ksaito.guice.batch.modules.BasicModule;

public class Application {
    public static void main(String[] args) {
        Guice.createInjector(
                new BasicModule()
        ).getInstance(Runner.class).run();
    }
}
