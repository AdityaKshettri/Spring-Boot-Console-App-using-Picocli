package com.aditya.project.command;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Data
@Slf4j
@Component
@Command(
        name = "command1",
        mixinStandardHelpOptions = true
)
public class Command1 implements Callable<Integer> {

    @Option(names = "-x", description = "optional option")
    private String x;

    @Override
    public Integer call() {
        log.info("Successfully executed command1 with x : {}", x);
        return null;
    }
}
