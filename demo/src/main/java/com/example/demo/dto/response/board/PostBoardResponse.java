package com.example.demo.dto.response.board;

import com.example.demo.dto.response.ResponseDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static com.example.demo.common.GlobalConst.SUCCESS_CODE;
import static com.example.demo.common.GlobalConst.SUCCESS_MESSAGE;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostBoardResponse extends ResponseDto {

    private PostBoardResponse() {
        super(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    public static ResponseEntity<PostBoardResponse> success() {
        PostBoardResponse result = new PostBoardResponse();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
