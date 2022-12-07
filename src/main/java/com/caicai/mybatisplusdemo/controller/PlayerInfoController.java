package com.caicai.mybatisplusdemo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.caicai.mybatisplusdemo.common.Result;
import com.caicai.mybatisplusdemo.entity.PlayerInfo;
import com.caicai.mybatisplusdemo.service.IPlayerInfoService;
import com.caicai.mybatisplusdemo.vo.PlayerInfoVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/playerInfo")
@Api(tags = "球员信息前端控制器")
public class PlayerInfoController {

    @Autowired
    private IPlayerInfoService playerInfoService;

    @GetMapping("page")
    public Result<IPage<PlayerInfoVO>> page(@RequestParam(value = "pageNum") Integer pageNum,@RequestParam(value = "pageSize") Integer pageSize){
        IPage<PlayerInfo> pageParam = new Page<>(pageNum,pageSize);
        IPage<PlayerInfoVO> result = playerInfoService.pageSelect(pageParam);
        return Result.success(result);
    }

    @GetMapping("page2")
    public Result<IPage<PlayerInfoVO>> page2(@RequestParam(value = "pageNum") Integer pageNum,@RequestParam(value = "pageSize") Integer pageSize){
        IPage<PlayerInfoVO> pageParam = new Page<>(pageNum,pageSize);
        IPage<PlayerInfoVO> result = playerInfoService.pageSelect2(pageParam);
        return Result.success(result);
    }
}
