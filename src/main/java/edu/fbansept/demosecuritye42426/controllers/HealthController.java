package edu.fbansept.demosecuritye42426.controllers;

import edu.fbansept.demosecuritye42426.security.AppUserDetails;
import edu.fbansept.demosecuritye42426.security.IsAdmin;
import edu.fbansept.demosecuritye42426.security.IsUser;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String health() {
        return "OK";
    }

    @GetMapping("/hello-anonymous")
    public String helloAnonymous() {
        return "Hello anonymous";
    }

    @GetMapping("/hello-user")
    @IsUser
    public String helloUser(@AuthenticationPrincipal final AppUserDetails user) {
        return "Hello user " + user.getUser().getPseudo();
    }

    @GetMapping("/hello-admin")
    @IsAdmin
    public String helloAdmin(@AuthenticationPrincipal final AppUserDetails user) {
        return "Hello admin " + user.getUser().getPseudo();
    }

}
