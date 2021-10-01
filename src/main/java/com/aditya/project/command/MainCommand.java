package com.aditya.project.command;

import org.springframework.stereotype.Component;
import picocli.CommandLine.Command;

@Component
@Command(
        mixinStandardHelpOptions = true,
        description = "contains all commands",
        subcommands = {
            Command1.class,
            Command2.class
    })
public class MainCommand {
}
