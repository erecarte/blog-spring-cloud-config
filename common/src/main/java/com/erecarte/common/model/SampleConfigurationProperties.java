package com.erecarte.common.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by llorene on 10/05/2017.
 */
@Component
@ConfigurationProperties(prefix = "sample")
@Data
public class SampleConfigurationProperties {
   private String firstProperty;
   private String secondProperty;
}
