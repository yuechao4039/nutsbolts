package com.dld.hll.financial.emp;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * @Author yue chao
 * @Date 2019/8/9 0009 下午 17:21
 */

public class EmpQueryAction extends ActionSupport {

    private List<EmpModel> models;

    private EmpModel empModel;

    public void setEmpModel(EmpModel empModel) {
        this.empModel = empModel;
    }

    public EmpModel getEmpModel() {
        return empModel;
    }

    @Override
    public String execute() throws Exception {


        EmpServiceImpl empService = new EmpServiceImpl();

        models = empService.query(getEmpModel());


        return SUCCESS;
    }


    public List<EmpModel> getModels() {
        return models;
    }
}
