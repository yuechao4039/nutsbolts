package com.dld.hll.financial.emp;

import com.dld.hll.financial.DbUtil;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
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


    public List<EmpModel> query(EmpModel queryEmpModel) {
        List<EmpModel> models = new ArrayList<>();
        try (Connection conn = DbUtil.getConn();) {
            String sql = "SELECT t.empId, t.empCode, t.empName, t.jobPosition, " +
                    "t.basicSalary, t.transportationAllowance, t.allowancePercent, t.totalSalary, t.deptId " +
                    "FROM emp t where 1";
            int i = 0;
            if (StringUtils.isNotEmpty(queryEmpModel.getEmpCode())) {
                i++;
                sql += " and  t.empCode = ? ";
            }
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            if (StringUtils.isNotEmpty(queryEmpModel.getEmpCode())) {
                preparedStatement.setString(i, queryEmpModel.getEmpCode());
            }

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


    public EmpModel findByEmpId(String empId) {

        try (Connection conn = DbUtil.getConn();) {
            String sql = "SELECT t.empId, t.empCode, t.empName, t.jobPosition, t.basicSalary, " +
                    " t.transportationAllowance, t.allowancePercent, t.totalSalary, t.deptId FROM emp t where t.empId = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, empId);
            ResultSet rs = ps.executeQuery();

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

                return empModel;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public int addDo(EmpModel empModel) {
        try {
            try (Connection conn = DbUtil.getConn()) {
                String sql = "insert into emp (empId, empCode, empName, jobPosition, deptId, basicSalary, transportationAllowance, totalSalary, allowancePercent)" +
                        " values(?, ?,?,?,?,?,?,?,?)";
                int i = 0;
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(++i, UUID.randomUUID().toString().replace("-", ""));
                ps.setString(++i, empModel.getEmpCode());
                ps.setString(++i, empModel.getEmpName());
                ps.setString(++i, empModel.getJobPosition());
                ps.setString(++i, empModel.getDeptId());
                ps.setBigDecimal(++i, empModel.getBasicSalary());
                ps.setBigDecimal(++i, empModel.getTransportationAllowance());
                ps.setBigDecimal(++i, empModel.getTotalSalary());
                ps.setBigDecimal(++i, empModel.getAllowancePercent());
                return ps.executeUpdate();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public int modifyDo(EmpModel empModel) {

        try (Connection conn = DbUtil.getConn()) {
            String sql = "update emp set empCode = ?, empName = ?, jobPosition = ?, deptId = ?, basicSalary = ?, transportationAllowance = ?, totalSalary = ?, allowancePercent = ? where empId =? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            int i = 0;
            ps.setString(++i, empModel.getEmpCode());
            ps.setString(++i, empModel.getEmpName());
            ps.setString(++i, empModel.getJobPosition());
            ps.setString(++i, empModel.getDeptId());
            ps.setBigDecimal(++i, empModel.getBasicSalary());
            ps.setBigDecimal(++i, empModel.getTransportationAllowance());
            ps.setBigDecimal(++i, empModel.getTotalSalary());
            ps.setBigDecimal(++i, empModel.getAllowancePercent());
            ps.setString(++i, empModel.getEmpId());
            return ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public int delDo(EmpModel empModel) {

        try (Connection conn = DbUtil.getConn()) {
            String sql = "delete from emp where empId = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            int i = 0;
            ps.setString(++i, empModel.getEmpId());
            return ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
