package com.example.gacheon.Repository;

import com.example.gacheon.Entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {

    List<TestEntity> findAllByContent(String content);

}
