UserInfo-java
=============

Java wrapper for [userinfo.io](http://userinfo.io) API.

## Install

The wrapper has not been published on the maven central repository yet so you will have to clone this github repository, launch `mvn clean install` and add this dependency to your `pom.xml`:

    <dependency>
      <groupId>io.userinfo</groupId>
      <artifactId>userinfo-java<artifactId>
      <version>1.0.0-SNAPSHOT</version>
    </dependency>

## Usage

Get your user's info by calling:

    String ipAddress = // your user's IP
    Info info = UserInfo.getInfo(ipAddress);
    System.out.println(info);

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
