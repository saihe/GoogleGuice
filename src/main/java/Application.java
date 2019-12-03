import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

public class Application {

    public static void main(String[] args) throws CmdLineException {
        Command command = new Command();
        new CmdLineParser(command).parseArgument(args);
        command.runner.run();
    }
}
