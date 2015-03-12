package io.userinfo.client;

import io.userinfo.client.model.Info;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Query;

/**
 * Interface used by retrofit to performs requests against the userinfo.io API.
 *
 * @author Vincent DURMONT [vdurmont@gmail.com]
 */
public interface UserInfoService {
    @GET("/userinfos")
    @Headers("X-Userinfo-Client-Id:" + UserInfo.CLIENT_VERSION_ID)
    Info getInfos(@Query(value = "ip_address") String ipAddress);
}
