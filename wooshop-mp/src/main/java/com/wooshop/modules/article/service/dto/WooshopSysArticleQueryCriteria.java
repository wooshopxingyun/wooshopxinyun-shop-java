

package com.wooshop.modules.article.service.dto;

import com.wooshop.common.Query;
import lombok.Data;


/**
* @author woo
* @date 2021-12-19
* 注意：
* 本软件为www.wooshopxingyun.com开发研制，未经购买不得使用
* 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
* 一经发现盗用、分享等行为，将追究法律责任，后果自负
*/


@Data
public class WooshopSysArticleQueryCriteria{

    /** 精确 */
    @Query
    private Integer categoryId;

    /** 模糊 */
    @Query(type = Query.Type.INNER_LIKE)
    private String articleTitel;

    /** 精确 */
    @Query
    private Integer isStart;
}
