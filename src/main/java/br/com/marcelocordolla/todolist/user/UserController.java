package br.com.marcelocordolla.todolist.user;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity<String> createUser(@RequestBody UserModel userModel) {
        var existingUser = userRepository.findByUsername(userModel.getUsername());

        if (existingUser != null) {
            return ResponseEntity.status(400).body("Usuario ja existe");
        }
        var passwordHashred = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());

        userModel.setPassword(passwordHashred);

        userRepository.save(userModel);
        return ResponseEntity.status(200).body("Usuario cadastrado com sucesso");
    }
}
