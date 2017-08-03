package com.erecarte.common.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class AnnotatedProperties {
   @Value("${sample.firstProperty:}")
   private String firstProperty;
   @Value("${sample.secondProperty:}")
   private String secondProperty;
}
