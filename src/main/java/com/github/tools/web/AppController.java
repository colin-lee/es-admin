package com.github.tools.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 业务控制器
 * Created by lirui on 2016-05-12 15:32.
 */
@Controller
public class AppController {
  @RequestMapping
  public String home() {
    return "home";
  }
}
