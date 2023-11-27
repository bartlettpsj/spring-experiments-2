package com.iqss.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

// @Component
// @Scope(proxyMode = ScopedProxyMode.TARGET_CLASS, value = "request")
public class HelloWorld {
   private String message;

   HelloWorld(String initial) {
      this.message = initial;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public String getMessage() {
      System.out.println("Your Message : " + message);
      return message;
   }
}
