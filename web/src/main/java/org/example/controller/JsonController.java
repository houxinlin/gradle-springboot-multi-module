package org.example.controller;

import org.example.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@RestController
@RequestMapping("/json")
public class JsonController extends BaseController {
    private List<User> users = new ArrayList<>();

    @PostMapping("set/user")
    public User setUser(@RequestBody User user) {
        users.add(user);
        return user;
    }

    @GetMapping("get/user")
    public User getUser(@RequestParam("name") String name) {
        return users.stream()
                .filter(user -> Optional.ofNullable(user.getName())
                        .orElse("").equals(name))
                .findFirst().orElse(null);
    }

    @GetMapping("list/user")
    public List<User> listUser() {
        return this.users;
    }

}
