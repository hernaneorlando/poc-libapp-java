package dev.horc.libraryapp.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> GetAll() {
        return userRepository.findAll();
    }
}
