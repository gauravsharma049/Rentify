package com.example.rentify;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Welcome {
    @GetMapping("/")
    public String index(){
        return "dashboards/admin/dashboard/index";
    }
    @GetMapping("/tables")
    public String table(){
        return "dashboards/admin/dashboard/table";
    }
    @GetMapping("/sample")
    public String sample(){
        return "dashboards/admin/dashboard/sample";
    }
    @GetMapping("/login2")
    public String login(){
        return "auth/login";
    }
    @GetMapping("/forgot-password")
    public String forgotPassword(){
        return "auth/forgotpassword";
    }
    @GetMapping("/register2")
    public String register(){
        return "auth/register";
    }
    @GetMapping("/errorpage")
    public String errorPage(){
        return "extra/error";
    }
    @GetMapping("/icons")
    public String icons(){
        return "extra/icons";
    }
    @GetMapping("/charts")
    public String charts(){
        return "extra/charts";
    }
    @GetMapping("/buttons")
    public String buttons(){
        return "extra/buttons";
    }
    @GetMapping("/cards")
    public String cards(){
        return "extra/cards";
    }
    @GetMapping("/colors")
    public String colors(){
        return "extra/colors";
    }
    @GetMapping("/animations")
    public String animations(){
        return "extra/animations";
    }
    @GetMapping("/borders")
    public String borders(){
        return "extra/borders";
    }
    @GetMapping("/others")
    public String others(){
        return "extra/others";
    }
}
