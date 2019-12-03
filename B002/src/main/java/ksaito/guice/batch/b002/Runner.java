package ksaito.guice.batch.b002;

import commands.BaseRunner;

import static utils.IO.print;

public class Runner implements BaseRunner {
    @Override
    public void run() {
        print("B002 RUN.");
    }
}
