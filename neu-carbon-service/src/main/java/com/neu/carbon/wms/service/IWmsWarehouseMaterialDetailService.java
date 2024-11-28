package com.neu.carbon.wms.service;

import java.util.List;
import com.neu.carbon.wms.domain.WmsWarehouseMaterialDetail;

/**
 * 仓库物料明细Service接口
 * 
 * @author neusoft
 * @date 2022-06-24
 */
public interface IWmsWarehouseMaterialDetailService 
{
    /**
     * 查询仓库物料明细
     * 
     * @param id 仓库物料明细ID
     * @return 仓库物料明细
     */
    public WmsWarehouseMaterialDetail selectWmsWarehouseMaterialDetailById(Long id);

    /**
     * 查询仓库物料明细列表
     * 
     * @param wmsWarehouseMaterialDetail 仓库物料明细
     * @return 仓库物料明细集合
     */
    public List<WmsWarehouseMaterialDetail> selectWmsWarehouseMaterialDetailList(WmsWarehouseMaterialDetail wmsWarehouseMaterialDetail);

    /**
     * 新增仓库物料明细
     * 
     * @param wmsWarehouseMaterialDetail 仓库物料明细
     * @return 结果
     */
    public int insertWmsWarehouseMaterialDetail(WmsWarehouseMaterialDetail wmsWarehouseMaterialDetail);

    /**
     * 修改仓库物料明细
     * 
     * @param wmsWarehouseMaterialDetail 仓库物料明细
     * @return 结果
     */
    public int updateWmsWarehouseMaterialDetail(WmsWarehouseMaterialDetail wmsWarehouseMaterialDetail);

    /**
     * 批量删除仓库物料明细
     * 
     * @param ids 需要删除的仓库物料明细ID
     * @return 结果
     */
    public int deleteWmsWarehouseMaterialDetailByIds(Long[] ids);

    /**
     * 删除仓库物料明细信息
     * 
     * @param id 仓库物料明细ID
     * @return 结果
     */
    public int deleteWmsWarehouseMaterialDetailById(Long id);
}