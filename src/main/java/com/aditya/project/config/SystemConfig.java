package com.aditya.project.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.system.SystemProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class SystemConfig {

    @Value("${config.id:#{null}}")
    private String id;

    public String getId() {
        if (id != null) {
            return id;
        }
        return SystemProperties.get("config.id");
    }
}
