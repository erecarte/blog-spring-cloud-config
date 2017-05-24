package com.erecarte.common.model;

import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by llorene on 22/05/2017.
 */
@Component
@AllArgsConstructor
public class EnvironmentProperties {
   private Environment environment;

   public String getFirstProperty() {
      return environment.getProperty("sample.firstProperty");
   }

   public String getSecondProperty() {
      return environment.getProperty("sample.secondProperty");
   }
}
