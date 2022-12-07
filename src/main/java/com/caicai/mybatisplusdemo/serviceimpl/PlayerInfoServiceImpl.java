package com.caicai.mybatisplusdemo.serviceimpl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.caicai.mybatisplusdemo.entity.PlayerInfo;
import com.caicai.mybatisplusdemo.mapper.PlayerInfoMapper;
import com.caicai.mybatisplusdemo.service.IPlayerInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicai.mybatisplusdemo.vo.PlayerInfoVO;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author caicai
 * @since 2022-12-07
 */
@Service
public class PlayerInfoServiceImpl extends ServiceImpl<PlayerInfoMapper, PlayerInfo> implements IPlayerInfoService {

    @Override
    public IPage<PlayerInfoVO> pageSelect(IPage<PlayerInfo> pageParam) {
        return this.baseMapper.selectByPage(pageParam);
    }

    @Override
    public IPage<PlayerInfoVO> pageSelect2(IPage<PlayerInfoVO> pageParam) {
        return this.baseMapper.selectByPage2(pageParam);
    }
}
