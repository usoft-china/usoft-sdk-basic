package com.usoft.sdk.basic.sso.client.open;

/**
 * @author uas
 * @date 2020/6/19 16:26
 */
public class OpenDemandSdkTest {
    /**
     * 测试地址
     */
    private OpenDemandSdk openDemandSdk = new OpenDemandSdk("https://b2btraderest.uuzcc.cn", "10042875", "c49f7be6a861461ab951e55030055a5c");

    /**
     * 正式地址
     */
//	private RatingSdk ratingSdk = new RatingSdk("http://api-product.usoftchina.com");

//    @Test
//    public void getSellerDemandDetail() throws Exception {
//        GetSellerDemandDetailReq.Builder req = GetSellerDemandDetailReq.newBuilder();
//        req.setCode("DD200509900416450200");
//        GetSellerDemandDetailResp resp = openDemandSdk.getSellerDemandDetail(req);
//        System.out.println(ProtoBufUtil.toJSON(resp));
//    }
//
//    @Test
//    public void offerDemandProduct() throws Exception {
//        OfferDemandProductReq.Builder req = OfferDemandProductReq.newBuilder();
//        req.setDemandProductCode("MP200619254984927037");
//        req.setDemandProductOfferCode("PO200619255294707203");
//        req.setDeliveryTime(1);
//        req.setTaxRate(1);
//        req.setMpq(2);
//        req.setMoq(2);
//        req.setMaterialBrand("MaterialBrand");
//        req.setMaterialCode("MaterialCode");
////		req.setAttachFileCode("");
//        req.setUu(200040196);
//        req.addLadderP(LadderPrice.newBuilder().setStart(1).setPrice(1.0));
//        req.addLadderP(LadderPrice.newBuilder().setStart(10).setPrice(10.0));
//        AttachFile.Builder file2 = AttachFile.newBuilder();
//        file2.setUrl("https://static.uuzcc.cn/appmall/12200604123893460688.jpg");
//        file2.setName("test1.jpg");
//        req.setAttachFile(file2);
//        OfferDemandProductResp resp = openDemandSdk.offerDemandProduct(req);
//        System.out.println(ProtoBufUtil.toJSON(resp));
//    }
}
