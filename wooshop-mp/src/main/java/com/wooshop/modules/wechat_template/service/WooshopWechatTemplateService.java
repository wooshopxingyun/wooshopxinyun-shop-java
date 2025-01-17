
package com.wooshop.modules.wechat_template.service;


import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.io.IOException;
import com.wooshop.modules.wechat_template.service.dto.WooshopWechatTemplateDto;
import org.springframework.data.domain.Pageable;
import com.wooshop.modules.service.BaseService;

import com.wooshop.domain.PageResult;
import com.wooshop.modules.wechat_template.domain.WooshopWechatTemplate;

import com.wooshop.modules.wechat_template.service.dto.WooshopWechatTemplateQueryCriteria;

/**
* @author woo
* @date 2022-02-22
* 注意：
* 本软件为www.wooshop.com开发研制，未经购买不得使用
* 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
* 一经发现盗用、分享等行为，将追究法律责任，后果自负
*/


public interface WooshopWechatTemplateService  extends BaseService<WooshopWechatTemplate>{

    /**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    PageResult<WooshopWechatTemplateDto>  queryAll(WooshopWechatTemplateQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<WooshopWechatTemplateDto>
    */
    List<WooshopWechatTemplate> queryAll(WooshopWechatTemplateQueryCriteria criteria);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<WooshopWechatTemplateDto> all, HttpServletResponse response) throws IOException;

    /**
    * 包含新增和更新功能
    * @param resources
    * @return
    */
    PageResult<WooshopWechatTemplateDto> addAndUpdate(WooshopWechatTemplate resources);


    /**
    * 根据id 进行删除
    * @param id
    */
    void cacheRemoveById(Long id);
}
