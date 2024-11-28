package com.neu.carbon.wms.service;

import java.util.List;
import com.neu.carbon.wms.domain.WmsReplenishApplyDetail;

/**
 * 补货申请明细Service接口
 * 
 * @author neuedu
 * @date 2022-07-20
 */
public interface IWmsReplenishApplyDetailService 
{
    /**
     * 查询补货申请明细
     * 
     * @param id 补货申请明细ID
     * @return 补货申请明细
     */
    public WmsReplenishApplyDetail selectWmsReplenishApplyDetailById(Long id);

    /**
     * 查询补货申请明细列表
     * 
     * @param wmsReplenishApplyDetail 补货申请明细
     * @return 补货申请明细集合
     */
    public List<WmsReplenishApplyDetail> selectWmsReplenishApplyDetailList(WmsReplenishApplyDetail wmsReplenishApplyDetail);

    /**
     * 新增补货申请明细
     * 
     * @param wmsReplenishApplyDetail 补货申请明细
     * @return 结果
     */
    public int insertWmsReplenishApplyDetail(WmsReplenishApplyDetail wmsReplenishApplyDetail);

    /**
     * 修改补货申请明细
     * 
     * @param wmsReplenishApplyDetail 补货申请明细
     * @return 结果
     */
    public int updateWmsReplenishApplyDetail(WmsReplenishApplyDetail wmsReplenishApplyDetail);

    /**
     * 批量删除补货申请明细
     * 
     * @param ids 需要删除的补货申请明细ID
     * @return 结果
     */
    public int deleteWmsReplenishApplyDetailByIds(Long[] ids);

    /**
     * 删除补货申请明细信息
     * 
     * @param id 补货申请明细ID
     * @return 结果
     */
    public int deleteWmsReplenishApplyDetailById(Long id);
}