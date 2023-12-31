package com.example.service.Impl;

import com.example.entity.Menu;
import com.example.mapper.MenuMapper;
import com.example.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
