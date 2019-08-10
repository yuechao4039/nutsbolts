
DROP TABLE IF EXISTS EMP;
CREATE TABLE EMP (
  `empId` varchar(32)  ,
  `empCode` varchar(100) ,
  `empName` varchar(100) ,
  `jobPosition` varchar(100) ,
  `basicSalary` decimal(10,0) ,
  `allowancePercent` decimal(10,0),
  `transportationAllowance` decimal(10,0) ,
  `totalSalary` decimal(10,0),
  `deptId` varchar(32)
);


