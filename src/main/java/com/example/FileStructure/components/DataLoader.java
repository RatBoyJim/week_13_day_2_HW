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
        User michael = new User("Michael");
        userRepository.save(michael);
        User marie = new User("Marie");
        userRepository.save(marie);
        Folder pictures = new Folder("Pictures", marie);
        folderRepository.save(pictures);
        Folder music = new Folder("Music", michael);
        folderRepository.save(music);

    }
}
