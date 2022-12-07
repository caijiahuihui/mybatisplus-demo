package com.caicai.mybatisplusdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.caicai.mybatisplusdemo.entity.PlayerInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.caicai.mybatisplusdemo.vo.PlayerInfoVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caicai
 * @since 2022-12-07
 */
public interface IPlayerInfoService extends IService<PlayerInfo> {
    IPage<PlayerInfoVO> pageSelect(IPage<PlayerInfo> pageParam);

    IPage<PlayerInfoVO> pageSelect2(IPage<PlayerInfoVO> pageParam);
}
