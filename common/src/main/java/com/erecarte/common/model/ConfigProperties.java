package com.erecarte.common.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sample")
@Data
public class ConfigProperties {
   private String firstProperty;
   private String secondProperty;
}
