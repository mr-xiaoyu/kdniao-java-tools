package club.mrxiao.kdniao.bean.order;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * <pre>
 *     客户号申请接口请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2020-01-09
 */
@Data
@Builder
public class KdniaoApplyCodeApplyForRequest implements Serializable {

    private static final long serialVersionUID = -1115552106355368627L;

    /**
     * 快递公司编码
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="ShipperCode")
    private String shipperCode;

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

    /**
     * 申请ID(用户记录在快递公司的标识)
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="ApplyID")
    private String applyId;

    /**
     * 公司名称
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="Company")
    private String company;

    /**
     * 联系人
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="Name")
    private String name;

    /**
     * 联系人
     * <pre>
     * 是否必填： 一定条件下可选
     * </pre>
     */
    @JSONField(name="Tel")
    private String tel;

    /**
     * 手机
     * <pre>
     * 是否必填： 一定条件下可选
     * </pre>
     */
    @JSONField(name="Mobile")
    private String mobile;

    /**
     * 省份
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="ProvinceName")
    private String provinceName;

    /**
     * 省份编码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="ProivnceCode")
    private String proivnceCode;

    /**
     * 城市
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="CityName")
    private String cityName;

    /**
     * 城市编码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="CityCode")
    private String cityCode;

    /**
     * 区县
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="ExpAreaName")
    private String expAreaName;

    /**
     * 区县编码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="ExpAreaCode")
    private String expAreaCode;

    /**
     * 详细地址
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="Address")
    private String address;
}
