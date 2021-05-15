package cn.binarywang.wx.miniapp.bean.shop.request;

import cn.binarywang.wx.miniapp.bean.shop.WxMaShopAuditBrandContent;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class WxMaShopAuditBrandRequest {

  @SerializedName("audit_req")
  private WxMaShopAuditBrandContent auditReq;
}
