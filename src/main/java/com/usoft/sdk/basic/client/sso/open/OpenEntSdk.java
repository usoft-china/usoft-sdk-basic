package com.usoft.sdk.basic.client.sso.open;

import com.usoft.sdk.basic.client.BaseSdk;
import com.usoft.sdk.basic.utils.HttpUtil;
import com.usoft.sdk.basic.utils.ProtoBufUtil;
import com.usoft.sso.external.open.api.protobuf.*;

import java.util.Map;

/**
 * 企业sdk
 * @author uas
 * @date 2020/8/11 15:59
 */
public class OpenEntSdk extends BaseSdk {

    public OpenEntSdk(String baseUrl, String secretKey) {
        super(baseUrl, secretKey);
    }

    public OpenEntSdk(String baseUrl, String secretKey, int timeout) {
        super(baseUrl, secretKey, timeout);
    }

    /**
     * 获取企业信息
     *
     * @param req
     * @return
     */
    public GetEnterpriseInfoResp getEnterpriseInfo(GetEnterpriseInfoReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/enterprise/info/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetEnterpriseInfoResp.Builder resp = ProtoBufUtil.toProtoBuf(GetEnterpriseInfoResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 修改企业信息
     *
     * @param req
     * @return
     */
    public UpdateEnterpriseResp updateEnterprise(UpdateEnterpriseReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/enterprise/update";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        UpdateEnterpriseResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdateEnterpriseResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 用户企业绑定
     *
     * @param req
     * @return
     */
    public BindUserEntResp bindUserEnt(BindUserEntReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/enterprise/userent/bind";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        BindUserEntResp.Builder resp = ProtoBufUtil.toProtoBuf(BindUserEntResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 解绑用户企业关联
     *
     * @param req
     * @return
     */
    public UnbindUserEntResp unbindUserEnt(UnbindUserEntReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/enterprise/userent/unbind";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        UnbindUserEntResp.Builder resp = ProtoBufUtil.toProtoBuf(UnbindUserEntResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 分页获取企业列表
     *
     * @param req
     * @return
     */
    public PagingEnterpriseResp pagingEnterprise(PagingEnterpriseReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/enterprise/paging";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        PagingEnterpriseResp.Builder resp = ProtoBufUtil.toProtoBuf(PagingEnterpriseResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 获取企业印章
     *
     * @param req
     * @return
     */
    public GetEntSignetResp getEntSignet(GetEntSignetReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/enterprise/signet/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetEntSignetResp.Builder resp = ProtoBufUtil.toProtoBuf(GetEntSignetResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 更新企业印章
     *
     * @param req
     * @return
     */
    public UpdateEntSignetResp updateEntSignet(UpdateEntSignetReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/enterprise/signet/update";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        UpdateEntSignetResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdateEntSignetResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 企业更换管理员
     *
     * @param req
     * @return
     */
    public ChangeEnterpriseAdminResp changeEnterpriseAdmin(ChangeEnterpriseAdminReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/enterprise/admin/update";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        ChangeEnterpriseAdminResp.Builder resp = ProtoBufUtil.toProtoBuf(ChangeEnterpriseAdminResp.newBuilder(), respJson);
        return resp.build();
    }
}
