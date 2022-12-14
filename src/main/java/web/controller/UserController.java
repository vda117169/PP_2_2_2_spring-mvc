package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String allUser(Model model) {
        model.addAttribute("index", userService.allUser());
        System.out.println(userService.allUser());
        return "index";
    }

    @GetMapping("/add")
    public String getUser() { //заполнение
        return "add";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute("addUser") User user) {
        userService.addUser(user);
        return "redirect:/User";
    }

    @GetMapping("/edit/{id}")
    public String getUserById(@PathVariable("id") int id, Model model) {
        model.addAttribute("edit", userService.getIdUser(id));
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String updateUser(@ModelAttribute("edit") User user) {
        userService.updateUser(user);
        return "redirect:/User";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        User user = userService.getIdUser(id);
        userService.deleteUser(user);
        return "redirect:/User";
    }

}
