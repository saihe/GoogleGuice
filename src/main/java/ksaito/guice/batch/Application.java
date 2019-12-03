package ksaito.guice.batch;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import java.util.Arrays;


public class Application {

    public static void main(String[] args) {
        if (args.length == 1) {
            Arrays.stream(args).forEach(arg -> {
                try {
                    Command command = new Command();
                    new CmdLineParser(command).parseArgument(args);
                    command.runner.run();
                } catch (CmdLineException e) {
                    e.printStackTrace();
                }
            });
        } else {
            System.out.println("引数の個数が１個ではないため、処理ができない。");
        }
    }
}
