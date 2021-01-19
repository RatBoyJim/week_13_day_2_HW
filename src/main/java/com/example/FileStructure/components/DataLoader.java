package com.example.FileStructure.components;

import com.example.FileStructure.models.Folder;
import com.example.FileStructure.models.User;
import com.example.FileStructure.repositories.FolderRepository;
import com.example.FileStructure.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {
        Folder pictures = new Folder("Pictures");
        folderRepository.save(pictures);
        Folder music = new Folder("Music");
        folderRepository.save(music);
        User michael = new User("Michael");
        userRepository.save(michael);
        User marie = new User("Marie");
        userRepository.save(marie);
    }
}
