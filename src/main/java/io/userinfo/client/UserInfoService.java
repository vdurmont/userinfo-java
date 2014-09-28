package io.userinfo.client;

import io.userinfo.client.model.Info;
import retrofit.http.GET;
import retrofit.http.Query;

public interface UserInfoService {
    @GET("/userinfos")
    Info getInfos(@Query(value = "version_id") String versionId, @Query(value = "ip_address") String ipAddress);
}
