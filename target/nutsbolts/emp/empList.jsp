<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>emp list!</title>
</head>
<body>
<a href="<s:url action='empadd'/>">ADD</a>
<%--
<a href="<s:url action='empadel'/>">DEL</a>
<a href="<s:url action='empupdate'/>">UPDATE</a>--%>

<s:url var="emplistLink" action='emplist'>
    <s:param name="userName">Bruce Phillips</s:param>
</s:url>

<a href="${emplistLink}">QUERY</a>


<table border="2px">
    <thead>
    <tr>
        <th>员工ID</th>
        <th>员工编码</th>
        <th>员工名称</th>
        <th>职位</th>
        <th>基本薪水</th>
        <th>交通补贴</th>
        <th>补贴调整率</th>
        <th>合计工资</th>
        <th>部门ID</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="models" step="1" var="model">
        <tr>
            <td><s:property value="#model.empId"/></td>
            <td><s:property value="#model.empCode"/></td>
            <td><s:property value="#model.empName"/></td>
            <td><s:property value="#model.jobPosition"/></td>
            <td><s:property value="#model.basicSalary"/></td>
            <td><s:property value="#model.transportationAllowance"/></td>
            <td><s:property value="#model.allowancePercent"/></td>
            <td><s:property value="#model.totalSalary"/></td>
            <td><s:property value="#model.deptId"/></td>
        </tr>

    </s:iterator>
    </tbody>

</table>
</body>
</html>