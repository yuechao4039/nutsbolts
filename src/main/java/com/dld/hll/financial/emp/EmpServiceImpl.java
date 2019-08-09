package com.dld.hll.financial.emp;

import com.dld.hll.financial.DbUtil;
import org.apache.commons.io.IOUtils;
import org.h2.util.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author yue chao
 * @Date 2019/8/9 0009 下午 17:26
 */

public class EmpServiceImpl {


    public List<EmpModel> query()  {
        List<EmpModel> models = new ArrayList<>();
        try (Connection conn = DbUtil.getConn();) {
            String sql = "SELECT t.empId, t.empCode, t.empName, t.jobPosition, t.basicSalary, t.transportationAllowance, t.allowancePercent, t.totalSalary, t.deptId FROM emp t";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                EmpModel empModel = new EmpModel();
                empModel.setEmpId(rs.getString("empId"));
                empModel.setEmpCode(rs.getString("empCode"));
                empModel.setEmpName(rs.getString("empName"));
                empModel.setJobPosition(rs.getString("jobPosition"));
                empModel.setBasicSalary(rs.getBigDecimal("basicSalary"));
                empModel.setTransportationAllowance(rs.getBigDecimal("transportationAllowance"));
                empModel.setAllowancePercent(rs.getBigDecimal("allowancePercent"));
                empModel.setTotalSalary(rs.getBigDecimal("totalSalary"));

                empModel.setDeptId(rs.getString("deptId"));
                models.add(empModel);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return models;
    }


    public int addDo(EmpModel empModel)  {
        try {
            try (Connection conn = DbUtil.getConn()) {
                String sql = "insert into emp (empId, empCode, empName, jobPosition, deptId, basicSalary, transportationAllowance, totalSalary, allowancePercent)" +
                        " values(?, ?,?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, UUID.randomUUID().toString().replace("-", ""));
                ps.setString(2, empModel.getEmpCode());
                ps.setString(3, empModel.getEmpName());
                ps.setString(4, empModel.getJobPosition());
                ps.setString(5, empModel.getDeptId());
                ps.setBigDecimal(6, empModel.getBasicSalary());
                ps.setBigDecimal(7, empModel.getTransportationAllowance());
                ps.setBigDecimal(8, empModel.getTotalSalary());
                ps.setBigDecimal(9, empModel.getAllowancePercent());
                return ps.executeUpdate();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
