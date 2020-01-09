package club.mrxiao.kdniao.bean.order;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * <pre>
 *     增值服务对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2020-01-09
 */
@Data
@Builder
public class KdniaoAddService implements Serializable {

    private static final long serialVersionUID = -8943897222364499553L;

    /**
     * 增值服务名称
     * <pre>
     * 是否必填： 一定条件下可选
     * </pre>
     */
    @JSONField(name="Name")
    private String name;

    /**
     * 增值服务值
     * <pre>
     * 是否必填： 一定条件下可选
     * </pre>
     */
    @JSONField(name="Value")
    private String value;

    /**
     * 客户标识
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="CustomerID")
    private String customerId;
}
