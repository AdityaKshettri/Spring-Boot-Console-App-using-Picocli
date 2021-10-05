package com.aditya.project.command;

import com.aditya.project.service.AppService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Data
@Slf4j
@Component
@RequiredArgsConstructor
@Command(
        name = "command1",
        mixinStandardHelpOptions = true
)
public class Command1 implements Callable<Integer> {

    private final AppService appService;

    @Option(names = "-x", description = "optional option")
    private String x;

    @Override
    public Integer call() {
        log.info("Successfully executed command1 with x : {}", x);
        appService.print();
        return 0;
    }
}
