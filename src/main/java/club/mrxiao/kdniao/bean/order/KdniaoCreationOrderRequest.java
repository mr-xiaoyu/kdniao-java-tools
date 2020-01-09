package club.mrxiao.kdniao.bean.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <pre>
 *     电子面单创建订单接口请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2020-01-09
 */
@Data
@Builder
public class KdniaoCreationOrderRequest implements Serializable {

    private static final long serialVersionUID = 2518967827431881770L;

    /**
     * ERP系统、电商平台等系统或平台类型用户的会员ID或店铺账号等唯一性标识，用于区分其用户
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="MemberID")
    private String memberId;

    /**
     * 参考《快递鸟电子面单客户号参数对照表.xlsx》
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="CustomerName")
    private String customerName;

    /**
     * 参考《快递鸟电子面单客户号参数对照表.xlsx》
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="CustomerPwd")
    private String customerPwd;

    /**
     * 参考《快递鸟电子面单客户号参数对照表.xlsx》
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="SendSite")
    private String sendSite;

    /**
     * 参考《快递鸟电子面单客户号参数对照表.xlsx》
     * <pre>
     * 是否必填： 一定条件下可选
     * </pre>
     */
    @JSONField(name="SendStaff")
    private String sendStaff;

    /**
     * 参考《快递鸟电子面单客户号参数对照表.xlsx》
     * <pre>
     * 是否必填： 一定条件下可选
     * </pre>
     */
    @JSONField(name="MonthCode")
    private String monthCode;

    /**
     * 商家自定义区域
     * <pre>
     * 是否必填： 一定条件下可选
     * </pre>
     */
    @JSONField(name="CustomArea")
    private String customArea;


    /**
     * 发货仓编码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="WareHouseID")
    private String wareHouseId;

    /**
     * 运输方式
     * <pre>
     * 是否必填： 否
     * 描述：1- 陆运 2- 空运 不填默认为1
     * </pre>
     */
    @JSONField(name="TransType")
    private int transType;

    /**
     * 快递公司编码
     * <pre>
     * 是否必填： 是
     * 描述：详细编码参考《2019快递鸟接口支持快递公司编码.xlsx》
     * </pre>
     */
    @JSONField(name="ShipperCode")
    private String shipperCode;

    /**
     * 快递单号(仅宅急送可用)
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="LogisticCode")
    private String logisticCode;

    /**
     * 第三方订单号 (ShipperCode为JD且ExpType为1时必填)
     * <pre>
     * 是否必填： 一定条件下可选
     * </pre>
     */
    @JSONField(name="ThrOrderCode")
    private String thrOrderCode;

    /**
     * 第三方订单号 订单编号(自定义，不可重复)
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="OrderCode")
    private String orderCode;

    /**
     * 邮费支付方式
     * <pre>
     * 是否必填： 是
     * 描述：1-现付，2-到付，3-月结，4-第三方支付(仅SF支持)
     * </pre>
     */
    @JSONField(name="PayType")
    private int payType;

    /**
     * 快递类型
     * <pre>
     * 是否必填： 是
     * 描述：1-标准快件 ,详细快递类型参考《快递公司快递业务类型.xlsx》
     * </pre>
     */
    @JSONField(name="ExpType")
    private String expType;

    /**
     * 是否要求签回单
     * <pre>
     * 是否必填： 否
     * 描述：1- 要求 0-不要求
     * </pre>
     */
    @JSONField(name="IsReturnSignBill")
    private int isReturnSignBill;

    /**
     * 签回单操作要求(如：签名、盖章、身份证复印件等)
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="OperateRequire")
    private String operateRequire;

    /**
     * 快递运费
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="Cost")
    private Double cost;

    /**
     * 其他费用
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="OtherCost")
    private Double otherCost;

    /**
     * 是否通知快递员上门揽件
     * <pre>
     * 是否必填： 否
     * 描述：0- 通知 1- 不通知 不填则默认为1
     * </pre>
     */
    @JSONField(name="IsNotice")
    private int isNotice;

    /**
     * 上门取货时间段-开始
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="StartDate",format="yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /**
     * 上门取货时间段-结束
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="EndDate",format="yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /**
     * 包裹总重量kg
     * <pre>
     * 是否必填： 一定条件下可选
     * 描述：当为快运的订单时必填，不填时快递鸟将根据各个快运公司要求传对应的默认值
     * </pre>
     */
    @JSONField(name="Weight")
    private Double weight;


    /**
     * 包裹数(最多支持30件)
     * <pre>
     * 是否必填： 是
     * 描述：一个包裹对应一个运单号，如果是大于1个包裹，返回则按照子母件的方式返回母运单号和子运单号
     * </pre>
     */
    @JSONField(name="Quantity")
    private int quantity;

    /**
     * 包裹总体积m3
     * <pre>
     * 是否必填： 一定条件下可选
     * 描述：当为快运的订单时必填，不填时快递鸟将根据各个快运公司要求传对应的默认值
     * </pre>
     */
    @JSONField(name="Volume")
    private Double volume;


    /**
     * 备注
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="Remark")
    private String remark;

    /**
     * 返回电子面单模板
     * <pre>
     * 是否必填： 否
     * 描述：0-不需要；1-需要
     * </pre>
     */
    @JSONField(name="IsReturnPrintTemplate")
    private String isReturnPrintTemplate;

    /**
     * 是否订阅短信
     * <pre>
     * 是否必填： 否
     * 描述：0-不需要；1-需要
     * </pre>
     */
    @JSONField(name="IsSendMessage")
    private String isSendMessage;

    /**
     * 模板规格
     * <pre>
     * 是否必填： 否
     * 描述：默认的模板无需传值，非默认模板传对应模板尺寸
     * </pre>
     */
    @JSONField(name="TemplateSize")
    private String templateSize;


    /**
     * 包装类型(快运字段)
     * <pre>
     * 是否必填： 一定条件下可选
     * 描述：默认为0； 0- 纸 1- 纤 2- 木 3- 托膜 4- 木托 99-其他
     * </pre>
     */
    @JSONField(name="PackingType")
    private int packingType;


    /**
     * 送货方式(快运字段)
     * <pre>
     * 是否必填： 一定条件下可选
     * 描述：默认为0； 0- 自提 1- 送货上门（不含上楼） 2- 送货上楼
     * </pre>
     */
    @JSONField(name="DeliveryMethod")
    private int deliveryMethod;

    /**
     * 发件人对象
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="Sender")
    private KdniaoOrderPerson sender;

    /**
     * 发件人对象
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    @JSONField(name="receiver")
    private KdniaoOrderPerson receiver;

    /**
     * 增值服务对象
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="AddServices")
    private KdniaoAddServices addServices;


    /**
     * 商品信息列表
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    @JSONField(name="Commoditys")
    private List<KdniaoAddCommodity> commoditys;

    /**
     * 对象转json字符串
     * @return json字符串
     */
    public String toJson(){
        return JSON.toJSONString(this);
    }
}
