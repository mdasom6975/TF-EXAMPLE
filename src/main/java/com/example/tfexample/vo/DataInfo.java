package com.example.tfexample.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;
@Schema(description = "회원정보")
@Data
public class DataInfo{

    @Schema(description = "회원번호")
    private String mbrNo;

    @Schema(description = "회원아이디")
    private String mbrId;

    @Schema(description = "회원명")
    private String mbrNm;

    @Schema(description = "회원구분코드", allowableValues = {"01: 일반회원"
    														+ ", 02: 가상회원"
    														+ ", 03: 체험회원"
    														+ ", 99: 테스트회원"})
    private String mbrDivCd;

    @Schema(description = "등록일시")
    private Date regDttm;

    @Schema(description = "수정일시")
    private Date modDttm;
}
