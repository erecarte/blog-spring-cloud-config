package com.erecarte.common;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by llorene on 11/05/2017.
 */
@Configuration
@ComponentScan
@PropertySource("classpath:common.properties")
public class SampleAutoConfiguration {
}
