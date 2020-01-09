package club.mrxiao.kdniao.bean.order;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * <pre>
 *     客户号推送接口请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2020-01-09
 */
@Data
@Builder
public class KdniaoApplyCodePushRequest implements Serializable {

    private static final long serialVersionUID = -2927951559696162734L;

    /**
     * 客户编号
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="ApplyCode")
    private String applyCode;

    /**
     * 电子面单客户号
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="CustomerName")
    private String customerName;

    /**
     * 电子面单密码
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="CustomerPwd")
    private String customerPwd;

    /**
     * 网点编码
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="StationCode")
    private String stationCode;

    /**
     * 网点名称
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="StationName")
    private String stationName;
}
