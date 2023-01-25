package com.example.gacheon.Service;

import com.example.gacheon.Entity.TestEntity;
import com.example.gacheon.Repository.TestRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public void saveEntity(TestEntity entity) {
        testRepository.save(entity);
    }

}
