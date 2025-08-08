CREATE TABLE `prizes` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `maxAmount` decimal(11,2) DEFAULT NULL,
  `minAmount` decimal(11,2) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `budget` decimal(11,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4

transactions, CREATE TABLE `transactions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `acctnbr` decimal(10,0) DEFAULT NULL COMMENT '信用卡账号',
  `inp_date` decimal(8,0) DEFAULT NULL COMMENT '交易日期',
  `inp_time` decimal(8,0) DEFAULT NULL COMMENT '交易时间',
  `xtranno` decimal(6,0) DEFAULT NULL COMMENT '交易序号',
  `bill_amt` decimal(11,2) DEFAULT NULL COMMENT '交易金额',
  `org1_code` varchar(20) DEFAULT NULL COMMENT '支行号',
  `org_no` varchar(20) DEFAULT NULL COMMENT '网点号',
  `cust_isn` varchar(45) DEFAULT NULL COMMENT '客户内码',
  `card_status_txt` varchar(20) DEFAULT NULL COMMENT '卡片状态',
  `cust_name` varchar(20) DEFAULT NULL COMMENT '客户名称',
  `cert_no` varchar(20) DEFAULT NULL COMMENT '身份证号码',
  `card_no` varchar(45) DEFAULT NULL COMMENT '信用卡卡号',
  `org_name` varchar(45) DEFAULT NULL COMMENT '机构名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10434 DEFAULT CHARSET=utf8mb4 COMMENT='交易记录表'

CREATE TABLE `win_transactions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `time` int(11) DEFAULT '0',
  `acctnbr` decimal(10,0) DEFAULT NULL,
  `inp_date` decimal(8,0) DEFAULT NULL,
  `inp_time` decimal(8,0) DEFAULT NULL,
  `xtranno` decimal(6,0) DEFAULT NULL,
  `bill_amt` decimal(11,2) DEFAULT NULL,
  `org1_code` varchar(20) DEFAULT NULL,
  `org_no` varchar(20) DEFAULT NULL,
  `cust_isn` varchar(45) DEFAULT NULL,
  `card_status_txt` varchar(20) DEFAULT NULL,
  `cust_name` varchar(20) DEFAULT NULL,
  `cert_no` varchar(20) DEFAULT NULL,
  `card_no` varchar(45) DEFAULT NULL,
  `org_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='中奖交易记录'

