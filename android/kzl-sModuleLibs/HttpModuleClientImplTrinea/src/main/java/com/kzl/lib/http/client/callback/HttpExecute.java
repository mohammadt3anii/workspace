package com.kzl.lib.http.client.callback;

import cn.trinea.android.common.entity.HttpResponse;

/**
 * 回调执行接口，执行http请求
 * Project:LuLuModuleLibs<br/>
 * Module:HttpModuleClientImplTrinea<br/>
 * Email: <A href="kezhenlu@qq.com">kezhenlu@qq.com</A><br/>
 * User: kenny.ke<br/>
 * Date: 2014/4/21<br/>
 * Time: 17:32<br/>
 * To change this template use File | Settings | File Templates.
 */
public interface HttpExecute {
    /**
     * execute a http request
     * eg:baseGet , basePost ,delete ...
     *
     * @return the response from http
     */
    HttpResponse execute();
}
