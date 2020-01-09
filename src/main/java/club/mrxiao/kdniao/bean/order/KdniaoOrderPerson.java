package club.mrxiao.kdniao.bean.order;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * <pre>
 *     发件人/收件人信息对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2020-01-09
 */
@Data
@Builder
public class KdniaoOrderPerson implements Serializable {

    private static final long serialVersionUID = 4972036206271395863L;

    /**
     * 发件人/收件人公司
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="Company")
    private String company;

    /**
     * 发件人/收件人
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="Name")
    private String name;

    /**
     * 电话
     * <pre>
     * 是否必填： 电话与手机，必填一个
     * </pre>
     */
    @JSONField(name="Tel")
    private String tel;

    /**
     * 手机
     * <pre>
     * 是否必填： 电话与手机，必填一个
     * </pre>
     */
    @JSONField(name="Mobile")
    private String mobile;

    /**
     * 发件人/收件人邮编
     * <pre>
     * 是否必填： 一定条件下可选
     * </pre>
     */
    @JSONField(name="PostCode")
    private String postCode;

    /**
     * 省
     * <pre>
     * 是否必填： 是
     * 描述：如广东省，不要缺少“省”；如是直辖市，请直接传北京、上海等； 如是自治区，请直接传广西壮族自治区等
     * </pre>
     */
    @JSONField(name="ProvinceName")
    private String provinceName;

    /**
     * 市
     * <pre>
     * 是否必填： 是
     * 描述：如深圳市，不要缺少“市”； 如果是市辖区，请直接传北京市、上海市等
     * </pre>
     */
    @JSONField(name="CityName")
    private String cityName;

    /**
     * 区/县
     * <pre>
     * 是否必填： 是
     * 描述：如福田区，不要缺少“区”或“县”
     * </pre>
     */
    @JSONField(name="ExpAreaName")
    private String expAreaName;

    /**
     * 收件人详细地址
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="Address")
    private String address;

}
