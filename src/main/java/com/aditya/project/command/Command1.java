package com.aditya.project.command;

import com.aditya.project.config.SystemConfig;
import com.aditya.project.service.AppService;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(callSuper = true)
@Command(
        name = "command1",
        mixinStandardHelpOptions = true
)
public class Command1 extends CommonParams implements Callable<Integer> {

    private final AppService appService;

    private final SystemConfig systemConfig;

    @Option(names = "-x", description = "optional option")
    private String x;

    @Override
    public Integer call() {
        log.info("Successfully executed command1 with x : {}", x);
        appService.print();
        log.info("id : {}", systemConfig.getId());
        return 0;
    }
}
