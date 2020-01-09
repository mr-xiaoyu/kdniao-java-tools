package club.mrxiao.kdniao.bean.order;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * <pre>
 *     商品信息对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2020-01-09
 */
@Data
@Builder
public class KdniaoAddCommodity implements Serializable {

    private static final long serialVersionUID = 1637791849495216978L;

    /**
     * 商品名称
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="GoodsName")
    private String goodsName;

    /**
     * 商品编码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="GoodsCode")
    private String goodsCode;

    /**
     * 商品数量
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="Goodsquantity")
    private int goodsquantity;

    /**
     * 商品价格
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="GoodsPrice")
    private Double goodsPrice;

    /**
     * 商品重量kg
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="GoodsWeight")
    private Double goodsWeight;

    /**
     * 商品描述
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="GoodsDesc")
    private String goodsDesc;

    /**
     * 商品体积m3
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="GoodsVol")
    private Double goodsVol;
}
