package com.lyln.fabos.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyln.fabos.system.entity.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu>{
    /**
     * 查找用户权限集
     *
     * @param username 用户名
     * @return 用户权限集合
     */
    List<Menu> findUserPermissions(String username);

    /**
     * 查找用户菜单集合
     *
     * @param username 用户名
     * @return 用户菜单集合
     */
    List<Menu> findUserMenus(String username);
}
