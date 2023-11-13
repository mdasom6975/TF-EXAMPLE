package com.example.tfexample.controller;

import com.example.tfexample.service.ApiService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/")
public class ApiController {

    /**
     * Field Injection (필드 주입) : @Autowired
     * Constructor Based DI (생성자 기반 DI) : private final
     * 생성자 주입 방법이 더 좋은 이유
     * 순환 참조를 방지할 수 있습니다.
     *  - 순환 참조 발생 시, 애플리케이션이 구동되지 않습니다.
     * 코드의 품질을 높일 수 있습니다.
     * 불변성을 얻을 수 있습니다.
     *  - final을 사용할 수 있습니다.
     *  - 실행 중에 객체가 변하는 것을 막을 수 있습니다.
     * 오류를 방지할 수 있습니다.
     *  - 참고 : https://madplay.github.io/post/why-constructor-injection-is-better-than-field-injection
     */
    /*@Autowired
    private ApiService apiService;*/
    private final ApiService apiService;

    @PostMapping("postData")
    @Operation(summary = "[TF-API-001] 데이터 생성(등록)")
    public Object postData(@RequestBody Object data) throws Exception{

        data = apiService.addData(data);
        data = apiService.saveData(data);

        return data;
    }


}
