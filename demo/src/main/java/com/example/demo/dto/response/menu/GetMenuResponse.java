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
public class GetMenuResponse extends ResponseDto {

    private GetMenuResponse() {
        super(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    public static ResponseEntity<GetMenuResponse> success() {
        GetMenuResponse result = new GetMenuResponse();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
