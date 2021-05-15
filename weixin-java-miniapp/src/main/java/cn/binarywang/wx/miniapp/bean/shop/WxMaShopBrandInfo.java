package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Data;

@Data
public class WxMaShopBrandInfo {
  /**
   * 认证审核类型 RegisterType
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("brand_audit_type")
  private Integer brandAuditType;
  /**
   * 商标分类 TrademarkType
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("trademark_type")
  private String trademarkType;
  /**
   * 选择品牌经营类型 BrandManagementType
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("brand_management_type")
  private Integer brandManagementType;
  /**
   * 商品产地是否进口 CommodityOriginType
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("commodity_origin_type")
  private Integer commodityOriginType;
  /**
   * 商标/品牌词
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("brand_wording")
  private String brandWording;
  /**
   * 销售授权书（如商持人为自然人，还需提供有其签名的身份证正反面扫描件)，图片url/media_id
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("sale_authorization")
  private List<String> saleAuthorization;
  /**
   * 商标注册证书，图片url/media_id
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("trademark_registration_certificate")
  private List<String> trademarkRegistrationCertificate;
  /**
   * 商标变更证明，图片url/media_id
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("trademark_change_certificate")
  private List<String> trademarkChangeCertificate;
  /**
   * 商标注册人姓名
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("trademark_registrant")
  private String trademarkRegistrant;
  /**
   * 商标注册号/申请号
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("trademark_registrant_nu")
  private String trademarkRegistrantNu;
  /**
   * 商标有效期，yyyy-MM-dd HH:mm:ss
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("trademark_authorization_period")
  private String trademarkAuthorizationPeriod;
  /**
   * 商标注册申请受理通知书，图片url/media_id
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("trademark_registration_application")
  private List<String> trademarkRegistrationApplication;
  /**
   * 商标申请人姓名
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("trademark_applicant")
  private String trademarkApplicant;
  /**
   * 商标申请时间, yyyy-MM-dd HH:mm:ss
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("trademark_application_time")
  private String trademarkApplicationTime;
  /**
   * 中华人民共和国海关进口货物报关单，图片url/media_i
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("imported_goods_form")
  private List<String> importedGoodsForm;

}
