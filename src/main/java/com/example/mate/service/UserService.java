package com.example.mate.service;

import com.example.mate.dto.request.user.GetUserRequestDto;

import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<?super GetUserResponseDto> getUser(GetUserRequestDto dto);


} 
