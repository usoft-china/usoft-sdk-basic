package com.usoft.sdk.basic.client.sso.open;

import com.usoft.sdk.basic.utils.ProtoBufUtil;
import com.usoft.sso.external.api.entity.AttachFile;
import com.usoft.sso.external.open.api.protobuf.*;
import org.junit.Test;

/**
 * @author uas
 * @date 2020/6/19 16:26
 */
public class OpenEntSdkTest {
    /**
     * 测试地址
     */
    private OpenEntSdk openEntSdk = new OpenEntSdk("https://ssorest.uuzcc.cn", "10042875", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");

    /**
     * 正式地址
     */
//	private RatingSdk ratingSdk = new RatingSdk("http://api-product.usoftchina.com");

    @Test
    public void getEnterpriseInfo() throws Exception {
        GetEnterpriseInfoReq.Builder req = GetEnterpriseInfoReq.newBuilder();
        req.setBusinessCode("CSTEST082533");
        GetEnterpriseInfoResp resp = openEntSdk.getEnterpriseInfo(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void updateEnterprise() throws Exception {
        UpdateEnterpriseReq.Builder req = UpdateEnterpriseReq.newBuilder();
        req.setEnuu(50000099);
        req.setAddr("WCY-1");
        req.setPhone("13686489132");
        req.setFax("123456");
        req.setBusinessAF(AttachFile.newBuilder().setUrl("https://static.usoftchina.com/appb2b/12200811710911241349.jpg").setName("123.jpg").build());
        UpdateEnterpriseResp resp = openEntSdk.updateEnterprise(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void bindUserEnt() throws Exception {
        BindUserEntReq.Builder req = BindUserEntReq.newBuilder();
        req.setEnuu(50000099);
        req.setUu(200040196);
        BindUserEntResp resp = openEntSdk.bindUserEnt(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void unbindUserEnt() throws Exception {
        UnbindUserEntReq.Builder req = UnbindUserEntReq.newBuilder();
        req.setEnuu(50000099);
        req.setUu(200040196);
        UnbindUserEntResp resp = openEntSdk.unbindUserEnt(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
