package com.erecarte.common.service;

import com.erecarte.common.model.AnnotatedProperties;
import com.erecarte.common.model.ConfigProperties;
import com.erecarte.common.model.EnvironmentProperties;
import com.erecarte.common.model.RefreshScopeAnnotatedProperties;
import org.springframework.stereotype.Service;

/**
 * Created by llorene on 10/05/2017.
 */
@Service
public class SampleService {
   private ConfigProperties configProperties;
   private AnnotatedProperties annotatedProperties;
   private RefreshScopeAnnotatedProperties refreshScopeAnnotatedProperties;
   private EnvironmentProperties environmentProperties;

   public SampleService(ConfigProperties configProperties,
                        AnnotatedProperties annotatedProperties,
                        RefreshScopeAnnotatedProperties refreshScopeAnnotatedProperties,
                        EnvironmentProperties environmentProperties) {
      this.configProperties = configProperties;
      this.annotatedProperties = annotatedProperties;
      this.refreshScopeAnnotatedProperties = refreshScopeAnnotatedProperties;
      this.environmentProperties = environmentProperties;
   }

   public ConfigProperties getConfigurationProperties() {
      return configProperties;
   }

   public AnnotatedProperties getAnnotatedProperties() {
      return annotatedProperties;
   }

   public RefreshScopeAnnotatedProperties getRefreshedAnnotatedProperties() {
      return refreshScopeAnnotatedProperties;
   }

   public EnvironmentProperties getEnvironmentProperties() {
      return environmentProperties;
   }

}
