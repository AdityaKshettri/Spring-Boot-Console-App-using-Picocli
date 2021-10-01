package com.aditya.project;

import com.aditya.project.command.MainCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

@Component
@RequiredArgsConstructor
public class MainAppRunner implements CommandLineRunner, ExitCodeGenerator {

    private final MainCommand command;

    private int exitCode;

    @Override
    public void run(String... args) {
        exitCode = new CommandLine(command).execute(args);
    }

    @Override
    public int getExitCode() {
        return exitCode;
    }
}
