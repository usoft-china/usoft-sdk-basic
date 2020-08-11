package com.usoft.sdk.basic.client.sso.open;

import com.usoft.sdk.basic.utils.ProtoBufUtil;
import com.usoft.sso.external.open.api.protobuf.*;
import org.junit.Test;

/**
 * 注册sdk测试类
 * @author uas
 * @date 2020/6/19 16:26
 */
public class OpenRegisterSdkTest {
    /**
     * 测试地址
     */
    private OpenRegisterSdk openRegisterSdk = new OpenRegisterSdk("https://ssorest.uuzcc.cn", "10042875", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");

    /**
     * 正式地址
     */
//	private RatingSdk ratingSdk = new RatingSdk("http://api-product.usoftchina.com");

    @Test
    public void personRegister() throws Exception {
        PersonRegisterReq.Builder req = PersonRegisterReq.newBuilder();
        req.setName("YYYY6");
        req.setMobile("13686489139");
//		builder.setPassword("123456");
        req.setSource("APP-SSO");
        req.setEnuu(50000099);
        PersonRegisterResp resp = openRegisterSdk.personRegister(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void enterpriseRegister() throws Exception {
        EnterpriseRegisterReq.Builder req = EnterpriseRegisterReq.newBuilder();
        req.setEnName("一个企业2");
        req.setMobile("13308649049");
        req.setBusinessCode("123456780000000007");
        EnterpriseRegisterResp resp = openRegisterSdk.enterpriseRegister(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
