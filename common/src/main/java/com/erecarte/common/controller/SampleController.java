package com.erecarte.common.controller;

import com.erecarte.common.model.SampleAnnotatedProperties;
import com.erecarte.common.model.SampleConfigurationProperties;
import com.erecarte.common.model.SampleRefreshedAnnotatedProperties;
import com.erecarte.common.service.SampleService;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by llorene on 10/05/2017.
 */
@RestController
public class SampleController {
   private SampleService sampleService;

   public SampleController(SampleService sampleService) {
      this.sampleService = sampleService;
   }

   @GetMapping("/configuration-properties")
   public PropertiesDTO sampleConfigurationProperties() {
      SampleConfigurationProperties properties = sampleService.getConfigurationProperties();
      return new PropertiesDTO(properties.getFirstProperty(), properties.getSecondProperty());
   }

   @GetMapping("/annotated-properties")
   public PropertiesDTO sampleAnnotatedProperties() {
      SampleAnnotatedProperties properties = sampleService.getAnnotatedProperties();
      return new PropertiesDTO(properties.getFirstProperty(), properties.getSecondProperty());
   }

   @GetMapping("/refreshed-annotated-properties")
   public PropertiesDTO sampleAnnotatedPropertiesWithRefresh() {
      SampleRefreshedAnnotatedProperties properties = sampleService.getRefreshedAnnotatedProperties();
      return new PropertiesDTO(properties.getFirstProperty(), properties.getSecondProperty());
   }

   @Value
   private class PropertiesDTO {
      private String firstProperty;
      private String secondProperty;
   }

}
