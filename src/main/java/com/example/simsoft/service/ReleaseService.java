package com.example.simsoft.service;

import com.example.simsoft.entity.ReleaseEntity;
import com.example.simsoft.entity.UserEntity;
import com.example.simsoft.repository.ReleaseRepo;
import com.example.simsoft.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ReleaseService {

    @Autowired
    private ReleaseRepo releaseRepo;

    public ReleaseEntity creatRelease(@RequestBody ReleaseEntity releaseEntity){
        System.out.println("В метод creatRelease попал releaseEntity "+releaseEntity);

        return releaseRepo.save(releaseEntity);
    }
}
