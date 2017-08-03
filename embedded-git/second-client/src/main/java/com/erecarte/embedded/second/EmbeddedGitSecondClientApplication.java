package com.erecarte.embedded.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EmbeddedGitSecondClientApplication {
   public static void main(String[] args) {
      SpringApplication.run(EmbeddedGitSecondClientApplication.class);
   }
}
