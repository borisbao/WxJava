package cn.binarywang.wx.miniapp.bean.shop.request;

import cn.binarywang.wx.miniapp.bean.shop.WxMaShopAuditCategoryContent;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class WxMaShopAuditCategoryRequest {

  @SerializedName("audit_req")
  private WxMaShopAuditCategoryContent auditReq;
}
