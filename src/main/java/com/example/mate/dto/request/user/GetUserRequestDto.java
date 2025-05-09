package com.example.mate.dto.request.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class GetUserRequestDto {
    private String userId;
    private String email;
}