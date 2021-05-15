package cn.binarywang.wx.miniapp.bean.shop.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class WxMaShopAuditResponse extends WxMaShopBaseResponse {
  /**
   * 审核id
   * <pre>
   * 是否必填：
   * </pre>
   */
  @SerializedName("audit_id")
  private String auditId;
}
