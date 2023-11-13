package com.example.tfexample.service;

import com.example.tfexample.vo.DataInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ApiService {

    /**
     * Service Class 작성 시
     * C : add , save
     * R : get
     * U : mod , save
     * D : del
     * insert / select / update / delete 와 같이 Query Id와 동일한 서비스명은 사용을 금한다.
     */


    /**
     * 데이터 등록 시
     * @throws Exception
     */
    public void addData(DataInfo data) throws Exception{

    }

    /**
     * 데이터 등록 또는 수정 시
     * @throws Exception
     */
    public void saveData(DataInfo data) throws Exception{
    }

    /**
     * 데이터 조회 시
     * @throws Exception
     */
    public Object getData(String data) throws Exception{
        return data;
    }

    /**
     * 데이터 수정 시
     * @throws Exception
     */
    public void modData(DataInfo data) throws Exception{
    }

    /**
     * 데이터 삭제 시
     * @throws Exception
     */
    public void delDate(DataInfo data) throws Exception{

    }
}
