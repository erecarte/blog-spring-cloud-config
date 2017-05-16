package com.erecarte.git.standalone.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by llorene on 11/05/2017.
 */
@SpringBootApplication
@EnableConfigServer
public class StandaloneGitServerApplication {
   public static void main(String[] args) {
      SpringApplication.run(StandaloneGitServerApplication.class);
   }
}
