package com.example.demo.dto.response.board;

import com.example.demo.dto.response.ResponseDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static com.example.demo.common.GlobalConst.SUCCESS_CODE;
import static com.example.demo.common.GlobalConst.SUCCESS_MESSAGE;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DeleteBoardResponse extends ResponseDto {

    private DeleteBoardResponse() {
        super(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    public static ResponseEntity<DeleteBoardResponse> success(){
        DeleteBoardResponse result = new DeleteBoardResponse();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
