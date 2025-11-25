package com.example.demo.dto.response.member;

import com.example.demo.dto.response.ResponseDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static com.example.demo.common.GlobalConst.SUCCESS_CODE;
import static com.example.demo.common.GlobalConst.SUCCESS_MESSAGE;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetMemberResponse extends ResponseDto {

    private GetMemberResponse() {
        super(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    public static ResponseEntity<GetMemberResponse> success() {
        GetMemberResponse result = new GetMemberResponse();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
