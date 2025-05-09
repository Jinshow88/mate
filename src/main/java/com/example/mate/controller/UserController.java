package com.example.mate.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.mate.service.UserService;
import com.example.mate.dto.request.user.GetUserRequestDto;
import com.example.mate.dto.response.user.GetUserResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;



@Slf4j
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
// @Tag(name="유저 컨트롤러")

public class UserController {
    private final UserService service;

    public ResponseEntity<? super GetUserResponseDto> getUser(GetUserRequestDto dto){
        
    }
}
