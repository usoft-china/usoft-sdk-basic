package com.usoft.sdk.basic.client.sso.open;

import com.usoft.sdk.basic.utils.ProtoBufUtil;
import com.usoft.sso.external.open.api.protobuf.*;
import org.junit.Test;

/**
 * @author uas
 * @date 2020/6/19 16:26
 */
public class OpenUserSdkTest {
    /**
     * 测试地址
     */
    private OpenUserSdk openUserSdk = new OpenUserSdk("https://ssorest.uuzcc.cn", "10042875", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");

    /**
     * 正式地址
     */
//	private RatingSdk ratingSdk = new RatingSdk("http://api-product.usoftchina.com");

    @Test
    public void getUserInfo() throws Exception {
        GetUserInfoReq.Builder req = GetUserInfoReq.newBuilder();
        req.setMobile("13686489139");
        GetUserInfoResp resp = openUserSdk.getUserInfo(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void verifyPassword() throws Exception {
        VerifyPasswordReq.Builder req = VerifyPasswordReq.newBuilder();
        req.setPassword("fqs548139");
        req.setUu(200040307);
        VerifyPasswordResp resp = openUserSdk.verifyPassword(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void updatePassword() throws Exception {
        UpdatePasswordReq.Builder req = UpdatePasswordReq.newBuilder();
        req.setPassword("123456");
        req.setUu(200040307);
        UpdatePasswordResp resp = openUserSdk.updatePassword(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void updateMobile() throws Exception {
        UpdateMobileReq.Builder req = UpdateMobileReq.newBuilder();
        req.setMobile("13686489139");
        req.setUu(200040307);
        UpdateMobileResp resp = openUserSdk.updateMobile(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}