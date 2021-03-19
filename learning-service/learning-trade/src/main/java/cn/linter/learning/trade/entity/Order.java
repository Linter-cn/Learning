package cn.linter.learning.trade.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 订单实体类
 *
 * @author wangxiaoyang
 * @since 2021/03/19
 */
@Data
@ToString
@EqualsAndHashCode
public class Order implements Serializable {

    private static final long serialVersionUID = -21147626328522368L;

    private Long id;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 买家
     */
    private String username;
    /**
     * 商品ID
     */
    private Long productId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 状态：0->未支付 1->已支付 2->已关闭
     */
    private Short status;

}
