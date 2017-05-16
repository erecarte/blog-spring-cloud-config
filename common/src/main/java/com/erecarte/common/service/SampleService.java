package com.erecarte.common.service;

import com.erecarte.common.model.SampleAnnotatedProperties;
import com.erecarte.common.model.SampleConfigurationProperties;
import com.erecarte.common.model.SampleRefreshedAnnotatedProperties;
import org.springframework.stereotype.Service;

/**
 * Created by llorene on 10/05/2017.
 */
@Service
public class SampleService {
   private SampleConfigurationProperties sampleConfigurationProperties;
   private SampleAnnotatedProperties sampleAnnotatedProperties;
   private SampleRefreshedAnnotatedProperties sampleRefreshedAnnotatedProperties;

   public SampleService(SampleConfigurationProperties sampleConfigurationProperties,
                        SampleAnnotatedProperties sampleAnnotatedProperties,
                        SampleRefreshedAnnotatedProperties sampleRefreshedAnnotatedProperties) {
      this.sampleConfigurationProperties = sampleConfigurationProperties;
      this.sampleAnnotatedProperties = sampleAnnotatedProperties;
      this.sampleRefreshedAnnotatedProperties = sampleRefreshedAnnotatedProperties;
   }

   public SampleConfigurationProperties getConfigurationProperties() {
      return sampleConfigurationProperties;
   }

   public SampleAnnotatedProperties getAnnotatedProperties() {
      return sampleAnnotatedProperties;
   }

   public SampleRefreshedAnnotatedProperties getRefreshedAnnotatedProperties() {
      return sampleRefreshedAnnotatedProperties;
   }
}
