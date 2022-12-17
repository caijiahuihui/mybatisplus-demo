# mybatisplus-demo

# 一、数据库准备
自己安装数据库，设置密码为123456，因为配置文件的密码是这个，如果你有比较喜欢的密码，那么可以使用你自己喜欢的密码，修改application.yml中datasource的密码即可

# 二、数据库脚本
create database myp;
use myp;
CREATE TABLE `player_info` (
`id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '主键ID',
`player_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '姓名',
`nation` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '国籍',
`price` decimal(10,2) DEFAULT NULL COMMENT '身价',
`team_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '队伍ID',
`number` int DEFAULT NULL COMMENT '号码',
`age` int DEFAULT NULL COMMENT '年龄',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

# 三、随便插入一条数据即可

# 四、启动MybatisplusDemoApplication类即可开始使用
