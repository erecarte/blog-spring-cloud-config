package com.erecarte.git.embedded;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by llorene on 11/05/2017.
 */
@SpringBootApplication
@EnableConfigServer
public class EmbeddedGitSampleApplication {
   public static void main(String[] args) {
      SpringApplication.run(EmbeddedGitSampleApplication.class);
   }
}
