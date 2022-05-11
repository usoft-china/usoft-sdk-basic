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
    private OpenUserSdk openUserSdk = new OpenUserSdk("https://ssorest.uuzcc.cn", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");

    /**
     * 正式地址
     */
//	private RatingSdk ratingSdk = new RatingSdk("http://api-product.usoftchina.com");

    @Test
    public void getUserInfo() throws Exception {
        GetUserInfoReq.Builder req = GetUserInfoReq.newBuilder();
//        req.setMobile("13686489139");
        req.setWxUnionid("o-oy10-vIQoaZLLov51Swgj9EYms");
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

    @Test
    public void updateUser() throws Exception {
        UpdateUserReq.Builder req = UpdateUserReq.newBuilder();
        req.setUu(200040196);
        req.setName("叶");
        req.setSex(2);
        req.setQq("132442342");
        req.setWechar("rhru0");
        UpdateUserResp resp = openUserSdk.updateUser(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void updateEmail() throws Exception {
        UpdateEmailReq.Builder req = UpdateEmailReq.newBuilder();
        req.setUu(200040196);
        req.setEmail("yejq@worldshinedata.com");
        UpdateEmailResp resp = openUserSdk.updateEmail(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
