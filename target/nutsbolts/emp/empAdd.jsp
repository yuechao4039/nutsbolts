<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Emp add!</title>
</head>
<body>


<s:url var="emplistLink" action='emplist'>
</s:url>
<a href="${emplistLink}">返回</a>


<s:form action="empaddDo" method="POST">
    <s:textfield name="empModel.empCode" label="员工编号"></s:textfield>
    <s:textfield name="empModel.empName" label="员工名称"></s:textfield>

    <s:textfield name="empModel.jobPosition" label="职称"></s:textfield>
    <s:textfield name="empModel.basicSalary" label="基本薪水"></s:textfield>
    <s:textfield name="empModel.transportationAllowance" label="交通补助"></s:textfield>
    <s:textfield name="empModel.allowancePercent" label="补贴调整率"></s:textfield>
    <s:textfield name="empModel.totalSalary" label="合计工资"></s:textfield>
    <s:textfield name="empModel.deptId" label="所属部门"></s:textfield>

    <s:submit value="提交"/>
</s:form>



</body>
</html>
