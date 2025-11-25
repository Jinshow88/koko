package com.example.demo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@AllArgsConstructor//모든 필드를 파라미터로 받는 생성자를 자동 생성
@NoArgsConstructor//파라미터 없는 기본 생성자 자동 생성
@SuperBuilder//부모 클래스를 상속받았을 때도 Builder 패턴을 사용할 수 있게 해주는 기능
@ToString//객체 정보를 문자열로 예쁘게 출력해주는 기능
public class ResponseDto {
    private String code;
    private String message;
}
