package com.caicai.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.caicai.mybatisplusdemo.entity.PlayerInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.caicai.mybatisplusdemo.vo.PlayerInfoVO;


public interface PlayerInfoMapper extends BaseMapper<PlayerInfo> {
    /**
     * 查询翻页
     * @param pageParam
     * @return
     */
    IPage<PlayerInfoVO> selectByPage(IPage<PlayerInfo> pageParam);

    /**
     *
     */
    IPage<PlayerInfoVO> selectByPage2(IPage<PlayerInfoVO> pageParam);
}
