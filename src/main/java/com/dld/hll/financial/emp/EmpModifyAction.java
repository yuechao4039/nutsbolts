package com.dld.hll.financial.emp;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Author yue chao
 * @Date 2019/8/9 0009 下午 22:39
 */

public class EmpModifyAction extends ActionSupport {


    private EmpModel empModel;

    public EmpModel getEmpModel() {
        return empModel;
    }

    public void setEmpModel(EmpModel empModel) {
        this.empModel = empModel;
    }

    @Override
    public String execute() throws Exception {

        EmpServiceImpl empService = new EmpServiceImpl();
        setEmpModel(empService.findByEmpId(getEmpModel().getEmpId()));


        return SUCCESS;
    }
}
