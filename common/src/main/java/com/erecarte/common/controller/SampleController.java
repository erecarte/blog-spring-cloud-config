package com.erecarte.common.controller;

import com.erecarte.common.model.AnnotatedProperties;
import com.erecarte.common.model.ConfigProperties;
import com.erecarte.common.model.EnvironmentProperties;
import com.erecarte.common.model.RefreshScopeAnnotatedProperties;
import com.erecarte.common.service.SampleService;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
   private SampleService sampleService;

   public SampleController(SampleService sampleService) {
      this.sampleService = sampleService;
   }

   @GetMapping("/configuration-properties")
   public PropertiesDTO sampleConfigurationProperties() {
      ConfigProperties properties = sampleService.getConfigurationProperties();
      return new PropertiesDTO(properties.getFirstProperty(), properties.getSecondProperty());
   }

   @GetMapping("/annotated-properties")
   public PropertiesDTO sampleAnnotatedProperties() {
      AnnotatedProperties properties = sampleService.getAnnotatedProperties();
      return new PropertiesDTO(properties.getFirstProperty(), properties.getSecondProperty());
   }

   @GetMapping("/refreshed-annotated-properties")
   public PropertiesDTO sampleAnnotatedPropertiesWithRefresh() {
      RefreshScopeAnnotatedProperties properties = sampleService.getRefreshedAnnotatedProperties();
      return new PropertiesDTO(properties.getFirstProperty(), properties.getSecondProperty());
   }

   @GetMapping("/environment-properties")
   public PropertiesDTO sampleEnvironmentProperties() {
      EnvironmentProperties properties = sampleService.getEnvironmentProperties();
      return new PropertiesDTO(properties.getFirstProperty(), properties.getSecondProperty());
   }

   @Value
   private class PropertiesDTO {
      private String firstProperty;
      private String secondProperty;
   }

}
