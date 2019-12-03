package ksaito.guice.batch.modules;

import com.google.inject.AbstractModule;
import ksaito.guice.batch.Runner;

public class BasicModule extends AbstractModule {
    @Override
    protected void configure() {
        // DIの情報などを記載
        bind(Runner.class).toInstance(new Runner());
    }
}
