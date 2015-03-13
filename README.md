UserInfo-java
=============

Java wrapper for [userinfo.io](http://userinfo.io) API.

## Install

Simply add this dependency to your `pom.xml`:

```xml
<dependency>
  <groupId>io.userinfo</groupId>
  <artifactId>userinfo-java<artifactId>
  <version>1.1.0</version>
</dependency>
```

You can also clone this github repository and launch `mvn clean install`.

## Usage

Get your user's info by calling:

```java
String ipAddress = // your user's IP
Info info = UserInfo.getInfo(ipAddress);
System.out.println(info);
```

## Error handling

If a communication error with the API occurs or if the given IP address is malformed, the `getInfo` method will throw a `retofit.RetrofitError`.

The `retrofit.RetrofitError` has a useful `getResponse()` method that will give you access to the status code, the message returned by the server, etc.

## Model

### Info

* `DateTime getRequestDate()`: returns the request date
* `String getIpAddress()`: returns the IP address
* `Position getPosition()`: returns the position of the user
* `Place getContinent()`: returns the place defining the continent
* `Place getCountry()`: returns the place defining the country
* `Place getCity()`: returns the place defining the city

### Position

* `Double getLatitude()`: the latitude
* `Double getLongitude()`: the longitude
* `Double getAccurracy()`: the accuracy (in km)

### Place

* `String getName()`: the name of the place
* `String getCode()`: the international code of the place (for a city, it will be the postal code)

## Dependencies

* `joda-time:joda-time:2.4`
* `com.squareup.retrofit:retrofit:1.6.1`
* `junit:junit:4.11` (tests only)

## Changelog

* **v1.1.0**
    * The API url is now in https
    * Sending a `X-Userinfo-Client-Id` header with the requests to identify the client
* **v1.0.0**
    * Initial release
