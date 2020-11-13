package com.lyln.fabos.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_data_permission")
public class UserDataPermission {
    @TableId("USER_ID")
    private Long userId;
    @TableId("DEPT_ID")
    private Long deptId;

}
