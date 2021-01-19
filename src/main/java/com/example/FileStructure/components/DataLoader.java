package com.example.FileStructure.components;

import com.example.FileStructure.models.File;
import com.example.FileStructure.models.Folder;
import com.example.FileStructure.models.User;
import com.example.FileStructure.repositories.FileRepository;
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

    @Autowired
    FileRepository fileRepository;

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
        File goldSoundz = new File("Gold Soundz", "mp3", 250, music);
        fileRepository.save(goldSoundz);
        File freja = new File("Freja posing", "jpg", 25, pictures);
        fileRepository.save(freja);
        File joseph = new File("Joseph's First Day At School", "png", 20, pictures);
        fileRepository.save(joseph);
        File debaser = new File("Debaser", "mp3", 200, music);
        fileRepository.save(debaser);

    }
}
