// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_master.proto

package com.tencent.client.master.protos;

public interface RegisterWorkerRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ClientMaster.RegisterWorkerResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 ret = 1;</code>
   */
  int getRet();

  /**
   * <code>int64 workId = 2;</code>
   */
  long getWorkId();

  /**
   * <code>bool isChief = 3;</code>
   */
  boolean getIsChief();

  /**
   * <code>.AsyncModel asyncModel = 5;</code>
   */
  int getAsyncModelValue();
  /**
   * <code>.AsyncModel asyncModel = 5;</code>
   */
  com.tencent.client.common.protos.AsyncModel getAsyncModel();

  /**
   * <code>map&lt;string, string&gt; conf = 6;</code>
   */
  int getConfCount();
  /**
   * <code>map&lt;string, string&gt; conf = 6;</code>
   */
  boolean containsConf(
      java.lang.String key);
  /**
   * Use {@link #getConfMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getConf();
  /**
   * <code>map&lt;string, string&gt; conf = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getConfMap();
  /**
   * <code>map&lt;string, string&gt; conf = 6;</code>
   */

  java.lang.String getConfOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; conf = 6;</code>
   */

  java.lang.String getConfOrThrow(
      java.lang.String key);

  /**
   * <code>int32 heartBeatInterval = 7;</code>
   */
  int getHeartBeatInterval();
}
