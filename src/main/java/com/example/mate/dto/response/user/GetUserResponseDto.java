package com.example.mate.dto.response.user;

import lombok.Getter;
import lombok.Setter;
import static com.example.mate.common.GlobalConst.SUCCESS_CODE;
import static com.example.mate.common.GlobalConst.SUCCESS_MESSAGE;

import com.example.mate.dto.response.ResponseDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Setter
@Getter
public class GetUserResponseDto {
    
    private GetUserResponseDto(){super(SUCCESS_CODE, SUCCESS_MESSAGE);}
    public static ResponseEntity<ResponseDto> success() {
        ResponseDto result = new ResponseDto(SUCCESS_CODE, SUCCESS_MESSAGE);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
