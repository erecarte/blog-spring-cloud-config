package com.erecarte.common.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by llorene on 10/05/2017.
 */
@Component
@Data
public class SampleAnnotatedProperties {
   @Value("${sample.firstProperty:}")
   private String firstProperty;
   @Value("${sample.secondProperty:}")
   private String secondProperty;
}
