package com.dld.hll.financial.emp;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Author yue chao
 * @Date 2019/8/9 0009 下午 22:39
 */

public class EmpAddDoAction extends ActionSupport {

    private EmpModel empModel;


    public void setEmpModel(EmpModel empModel) {
        this.empModel = empModel;
    }

    public EmpModel getEmpModel() {
        return empModel;
    }

    @Override
    public String execute() throws Exception {
        EmpModel empModel = getEmpModel();

        EmpServiceImpl empService = new EmpServiceImpl();
        empService.addDo(empModel);
        return SUCCESS;
    }
}
