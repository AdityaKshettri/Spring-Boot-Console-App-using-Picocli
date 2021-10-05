package com.aditya.project.command;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;

import java.util.List;
import java.util.concurrent.Callable;

@Data
@Slf4j
@Component
@Command(
        name = "command2",
        mixinStandardHelpOptions = true
)
public class Command2 implements Callable<Integer> {

    @Parameters(description = "positional params")
    private List<String> y;

    @Override
    public Integer call() {
        log.info("Successfully executed command2 with y : {}", y);
        return 0;
    }
}
