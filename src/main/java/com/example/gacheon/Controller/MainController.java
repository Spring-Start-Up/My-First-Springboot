package com.example.gacheon.Controller;

import com.example.gacheon.DTO.TestDto;
import com.example.gacheon.Entity.TestEntity;
import com.example.gacheon.Service.TestService;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public String[] hello() {
        return new String[]{"hello", "world"};
    }

    @PostMapping("/save")
    public String save(@RequestBody TestDto dto) {
        System.out.println(dto.getTitle());
        System.out.println(dto.getContent());
        TestEntity entity = TestEntity.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .build();
        System.out.println(entity.toString());
        testService.saveEntity(entity);
        return "저장됐슈";
    }

}
