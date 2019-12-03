import commands.BaseRunner;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.spi.SubCommand;
import org.kohsuke.args4j.spi.SubCommandHandler;
import org.kohsuke.args4j.spi.SubCommands;

public class Command {
    @Argument(handler = SubCommandHandler.class)
    @SubCommands(
            @SubCommand(name = "B001", impl = ksaito.guice.batch.b001.Runner.class)
    )
    BaseRunner runner;
}
