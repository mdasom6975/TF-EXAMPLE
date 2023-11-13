package com.example.tfexample.mapper;

import com.example.tfexample.vo.DataInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiMapper {

    /**
     * 데이터 등록 시
     * @param data
     */
    void insertDate(DataInfo data);

    /**
     * 데이터 조회 시
     * @param data
     * @return
     */
    DataInfo selectDate(String data);

    /**
     * 데이터 수정 시
     * @param data
     */
    void updateDate(DataInfo data);

    /**
     * 데이터 삭제 시
     * @param data
     */
    void deleteDate(DataInfo data);

}
