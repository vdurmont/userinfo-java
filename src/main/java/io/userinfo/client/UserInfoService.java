package io.userinfo.client;

import io.userinfo.client.model.Info;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Interface used by retrofit to performs requests against the userinfo.io API.
 *
 * @author Vincent DURMONT [vdurmont@gmail.com]
 */
public interface UserInfoService {
    @GET("/userinfos")
    Info getInfos(@Query(value = "version_id") String versionId, @Query(value = "ip_address") String ipAddress);
}
