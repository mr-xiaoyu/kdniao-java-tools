package club.mrxiao.kdniao.bean.order;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * <pre>
 *     取消订单接口请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2020-01-09
 */
@Data
@Builder
public class KdniaoCancelOrderRequest implements Serializable {

    private static final long serialVersionUID = 6564112350082328113L;

    /**
     * 快递公司编码
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="ShipperCode")
    private String shipperCode;

    /**
     * 订单编号
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="OrderCode")
    private String orderCode;

    /**
     * 快递单号
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="ExpNo")
    private String expNo;

    /**
     * 电子面单客户号
     * <pre>
     * 是否必填： 一定条件下可选
     * </pre>
     */
    @JSONField(name="CustomerName")
    private String customerName;

    /**
     * 电子面单密码
     * <pre>
     * 是否必填： 一定条件下可选
     * </pre>
     */
    @JSONField(name="CustomerPwd")
    private String customerPwd;

}
