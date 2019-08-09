package com.dld.hll.financial.emp;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * @Author yue chao
 * @Date 2019/8/9 0009 下午 17:21
 */

public class EmpQueryAction extends ActionSupport {

    private List<EmpModel> models;

    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(userName);

        EmpServiceImpl empService = new EmpServiceImpl();

        models = empService.query();


        return SUCCESS;
    }


    public List<EmpModel> getModels() {
        return models;
    }
}
