package com.usoft.sdk.basic.client.sso.open;

import com.usoft.sdk.basic.utils.ProtoBufUtil;
import com.usoft.sso.external.api.entity.AttachFile;
import com.usoft.sso.external.open.api.protobuf.*;
import org.junit.Test;

/**
 * 企业sdk测试类
 *
 * @author uas
 * @date 2020/6/19 16:26
 */
public class OpenEntSdkTest {
    /**
     * 测试地址
     */
    private OpenEntSdk openEntSdk = new OpenEntSdk("https://ssorest.uuzcc.cn", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");

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
        req.setName("一个测试的企业1");
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

    @Test
    public void pagingEnterprise() throws Exception {
        PagingEnterpriseReq.Builder req = PagingEnterpriseReq.newBuilder();
        // 数据修改时间 时间戳(单位：毫秒)
        req.setUpdateTime(1600153312000l);
        // 分页参数不传 默认返回10条
        req.setPageNumber(1);
        req.setPageSize(100);
        PagingEnterpriseResp resp = openEntSdk.pagingEnterprise(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getEntSignet() throws Exception {
        GetEntSignetReq.Builder req = GetEntSignetReq.newBuilder();
        req.setEnuu(10050624);
        GetEntSignetResp resp = openEntSdk.getEntSignet(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void updateEntSignet() throws Exception {
        UpdateEntSignetReq.Builder req = UpdateEntSignetReq.newBuilder();
        //企业ENUU号
        req.setEnuu(10050624);
        //公章文件
        AttachFile.Builder builder = AttachFile.newBuilder();
        // 文件编号
//		builder.setCode("12210104974310428258");
        // 文件名称
        builder.setName("1.png");
        // 文件地址
        builder.setUrl("https://static.uuzcc.cn/appsso/12210104974125509055.png");
        // 文件大小
        builder.setSize(241571);
        req.setCommonFile(builder);
        UpdateEntSignetResp resp = openEntSdk.updateEntSignet(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void changeEnterpriseAdmin() throws Exception {
        ChangeEnterpriseAdminReq.Builder req = ChangeEnterpriseAdminReq.newBuilder();
        req.setEnuu(10050624);
        ChangeEnterpriseAdminReq.ChangeEntAdmin.Builder admin1 = ChangeEnterpriseAdminReq.ChangeEntAdmin.newBuilder();
        admin1.setName("123");
        admin1.setMobile("18566650467");
        req.addChangeEntAdmin(admin1);
        ChangeEnterpriseAdminReq.ChangeEntAdmin.Builder admin2 = ChangeEnterpriseAdminReq.ChangeEntAdmin.newBuilder();
        admin2.setName("y");
        admin2.setMobile("13308649041");
        req.addChangeEntAdmin(admin2);
        ChangeEnterpriseAdminResp resp = openEntSdk.changeEnterpriseAdmin(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
