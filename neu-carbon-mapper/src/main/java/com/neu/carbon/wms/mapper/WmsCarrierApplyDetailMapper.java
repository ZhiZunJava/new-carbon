package com.neu.carbon.wms.mapper;

import java.util.List;
import com.neu.carbon.wms.domain.WmsCarrierApplyDetail;

/**
 * 产品承运申请明细Mapper接口
 * 
 * @author neuedu
 * @date 2022-07-01
 */
public interface WmsCarrierApplyDetailMapper 
{
    /**
     * 查询产品承运申请明细
     * 
     * @param id 产品承运申请明细ID
     * @return 产品承运申请明细
     */
    public WmsCarrierApplyDetail selectWmsCarrierApplyDetailById(Long id);

    /**
     * 查询产品承运申请明细列表
     * 
     * @param wmsCarrierApplyDetail 产品承运申请明细
     * @return 产品承运申请明细集合
     */
    public List<WmsCarrierApplyDetail> selectWmsCarrierApplyDetailList(WmsCarrierApplyDetail wmsCarrierApplyDetail);

    /**
     * 新增产品承运申请明细
     * 
     * @param wmsCarrierApplyDetail 产品承运申请明细
     * @return 结果
     */
    public int insertWmsCarrierApplyDetail(WmsCarrierApplyDetail wmsCarrierApplyDetail);

    /**
     * 修改产品承运申请明细
     * 
     * @param wmsCarrierApplyDetail 产品承运申请明细
     * @return 结果
     */
    public int updateWmsCarrierApplyDetail(WmsCarrierApplyDetail wmsCarrierApplyDetail);

    /**
     * 删除产品承运申请明细
     * 
     * @param id 产品承运申请明细ID
     * @return 结果
     */
    public int deleteWmsCarrierApplyDetailById(Long id);

    /**
     * 批量删除产品承运申请明细
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWmsCarrierApplyDetailByIds(Long[] ids);
}