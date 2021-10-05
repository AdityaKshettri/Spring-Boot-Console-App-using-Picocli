package com.aditya.project.command;

import lombok.Data;
import picocli.CommandLine.Option;

@Data
public abstract class CommonParams {

    @Option(names = "--spring.config.location", description = "external config properties file path")
    private String config;
}
