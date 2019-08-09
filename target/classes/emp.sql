
DROP TABLE IF EXISTS EMP;
CREATE TABLE EMP (
  `empId` varchar(32)  ,
  `empCode` varchar(100) ,
  `empName` varchar(100) ,
  `jobPosition` varchar(100) ,
  `deptId` varchar(32) ,
  `basicSalary` decimal(10,0) ,
  `transportationAllowance` decimal(10,0) ,
  `totalSalary` decimal(10,0) ,
  `allowancePercent` decimal(10,0)
);


insert into `emp` (`empId`, `empCode`, `empName`, `jobPosition`, `deptId`, `basicSalary`, `transportationAllowance`, `totalSalary`, `allowancePercent`) values('1','code1','name1','Java','1001','11.22','22.00','33.00','44.00');
insert into `emp` (`empId`, `empCode`, `empName`, `jobPosition`, `deptId`, `basicSalary`, `transportationAllowance`, `totalSalary`, `allowancePercent`) values('2','code1','name1','Java','1001','11.22','22.00','33.00','44.00');
insert into `emp` (`empId`, `empCode`, `empName`, `jobPosition`, `deptId`, `basicSalary`, `transportationAllowance`, `totalSalary`, `allowancePercent`) values('3','code1','name1','Java','1001','11.22','22.00','33.00','44.00');
insert into `emp` (`empId`, `empCode`, `empName`, `jobPosition`, `deptId`, `basicSalary`, `transportationAllowance`, `totalSalary`, `allowancePercent`) values('4','code1','name1','Java','1001','11.22','22.00','33.00','44.00');
