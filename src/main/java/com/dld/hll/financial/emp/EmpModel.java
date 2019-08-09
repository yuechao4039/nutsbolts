package com.dld.hll.financial.emp;

import java.math.BigDecimal;

/**
 * @Author yue chao
 * @Date 2019/8/9 0009 下午 17:22
 */

public class EmpModel {

//    CREATE TABLE `emp` (
//            `empId` varchar(32) COLLATE utf8_bin DEFAULT NULL,
//  `empCode` varchar(100) COLLATE utf8_bin DEFAULT NULL,
//  `empName` varchar(100) COLLATE utf8_bin DEFAULT NULL,
//  `jobPosition` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '职位',
//            `deptId` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '部门ID',
//            `basicSalary` decimal(10,0) DEFAULT NULL,
//  `transportationAllowance` decimal(10,0) DEFAULT NULL COMMENT '交通补贴',
//            `totalSalary` decimal(10,0) DEFAULT NULL,
//  `allowancePercent` decimal(10,0) DEFAULT NULL COMMENT '补贴调整率'
//            ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin

    private String empId;
    private String empCode;
    private String empName;
    private String jobPosition;

    private BigDecimal basicSalary;
    private BigDecimal transportationAllowance;
    private BigDecimal allowancePercent;
    private BigDecimal totalSalary;

    private String deptId;


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public BigDecimal getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(BigDecimal basicSalary) {
        this.basicSalary = basicSalary;
    }

    public BigDecimal getTransportationAllowance() {
        return transportationAllowance;
    }

    public void setTransportationAllowance(BigDecimal transportationAllowance) {
        this.transportationAllowance = transportationAllowance;
    }

    public BigDecimal getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(BigDecimal totalSalary) {
        this.totalSalary = totalSalary;
    }

    public BigDecimal getAllowancePercent() {
        return allowancePercent;
    }

    public void setAllowancePercent(BigDecimal allowancePercent) {
        this.allowancePercent = allowancePercent;
    }
}
