package com.usoft.sdk.basic.client.sso.open;

import com.usoft.sdk.basic.utils.ProtoBufUtil;
import com.usoft.sso.external.open.api.protobuf.*;
import org.junit.Test;

/**
 * 登录sdk测试类
 * @author uas
 * @date 2020/6/19 16:26
 */
public class OpenLoginSdkTest {
    /**
     * 测试地址
     */
    private OpenLoginSdk openLoginSdk = new OpenLoginSdk("https://ssorest.uuzcc.cn", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");

    /**
     * 正式地址
     */
//	private RatingSdk ratingSdk = new RatingSdk("http://api-product.usoftchina.com");

    @Test
    public void userLogin() throws Exception {
        UserLoginReq.Builder req = UserLoginReq.newBuilder();
        req.setEnuu(50000099);
        req.setUu(200040196);
        UserLoginResp resp = openLoginSdk.userLogin(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void switchEnterprise() throws Exception {
        SwitchEnterpriseReq.Builder req = SwitchEnterpriseReq.newBuilder();
        req.setToken("c0986eb0-95ed-461c-adce-da53ef50e63f");
        req.setEnuu(50000099);
        SwitchEnterpriseResp resp = openLoginSdk.switchEnterprise(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getLoginState() throws Exception {
        GetLoginStateReq.Builder req = GetLoginStateReq.newBuilder();
        req.setToken("ed27ee39-9fe8-40fb-b593-2ba73aa8160b");
        GetLoginStateResp resp = openLoginSdk.getLoginState(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
