package cn.binarywang.wx.miniapp.bean.shop.request;

import cn.binarywang.wx.miniapp.bean.shop.WxMaShopSpuDescInfo;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * 创建spu请求对象
 * </pre>
 * @author <a href="https://github.com/borisbao">boris</a>
 * @since 2021-03-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WxMaShopAddSpuRequest  implements Serializable {

  private static final long serialVersionUID = 1644078222588845853L;
  /**
   * 商家自定义商品ID
   * <pre>
   * 是否必填： 是
   * </pre>
   */
  @SerializedName("out_product_id")
  private String productId;

  /**
   * 标题
   * <pre>
   * 是否必填： 是
   * </pre>
   */
  @SerializedName("title")
  private String title;


  /**
   * 绑定的小程序商品路径
   * <pre>
   * 是否必填： 是
   * </pre>
   */
  @SerializedName("path")
  private String path;

  /**
   * 主图,多张,列表
   * <pre>
   * 是否必填： 是
   * </pre>
   */
  @SerializedName("head_img")
  private List<String> headImgList;


  /**
   * 商品资质图片
   * <pre>
   * 是否必填： 否
   * </pre>
   */
  @SerializedName("qualification_pics")
  private List<String> qualificationPicList;


  /**
   * 商品介绍对象
   * <pre>
   * 是否必填： 否
   * </pre>
   */
  @SerializedName("desc_info")
  private WxMaShopSpuDescInfo SpuDescInfo;

  /**
   * 第三级类目ID
   * <pre>
   * 是否必填： 是
   * </pre>
   */
  @SerializedName("third_cat_id")
  private Long thirdCategoryId;

  /**
   * 品牌id
   * <pre>
   * 是否必填： 否
   * </pre>
   */
  @SerializedName("brand_id")
  private Long brandId;
}
