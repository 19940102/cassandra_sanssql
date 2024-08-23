package hp.net.tp_cassandra_nosql.web;

import hp.net.tp_cassandra_nosql.entities.User;
import hp.net.tp_cassandra_nosql.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private UserController userController;
public UserController(UserController userController, UserService userService) {
        this.userController = userController;
    this.userService = userService;
}
    @GetMapping()
    public List<User> getUsers(){
      return userService.getALLUsers();
    }

    @PostMapping()
   public String saveUser(@RequestParam String name,@RequestParam int age,@RequestParam String email){

        userService.addUser(name,age,email);
        return "User saved";
    }


}
