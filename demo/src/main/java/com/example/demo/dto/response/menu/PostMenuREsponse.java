package com.example.demo.dto.response.menu;

import com.example.demo.dto.response.ResponseDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static com.example.demo.common.GlobalConst.SUCCESS_CODE;
import static com.example.demo.common.GlobalConst.SUCCESS_MESSAGE;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostMenuREsponse extends ResponseDto {

    private PostMenuREsponse() {
        super(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    public static ResponseEntity<PostMenuREsponse> success() {
        PostMenuREsponse result = new PostMenuREsponse();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
