package com.example.simsoft.service;

import com.example.simsoft.entity.ReleaseEntity;
import com.example.simsoft.entity.UserEntity;
import com.example.simsoft.repository.ReleaseRepo;
import com.example.simsoft.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseService {

    @Autowired
    private ReleaseRepo releaseRepo;

    @Autowired
    private UserRepo userRepo;

    public ReleaseEntity creatRelease(ReleaseEntity releaseEntity, Long userId){
        UserEntity userEntity = userRepo.findById(userId).get();
        releaseEntity.setUser(userEntity);
        return releaseRepo.save(releaseEntity);
    }
}
