package org.license.demo.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.license.demo.ums.model.UmsAdmin;

import java.util.List;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author macro
 * @since 2020-08-21
 */
public interface UmsAdminMapper extends BaseMapper<UmsAdmin> {

    /**
     * 获取资源相关用户ID列表
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);

}
