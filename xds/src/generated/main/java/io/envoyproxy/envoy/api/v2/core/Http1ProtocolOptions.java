// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/protocol.proto

package io.envoyproxy.envoy.api.v2.core;

/**
 * Protobuf type {@code envoy.api.v2.core.Http1ProtocolOptions}
 */
public  final class Http1ProtocolOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.core.Http1ProtocolOptions)
    Http1ProtocolOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Http1ProtocolOptions.newBuilder() to construct.
  private Http1ProtocolOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Http1ProtocolOptions() {
    acceptHttp10_ = false;
    defaultHostForHttp10_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Http1ProtocolOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.BoolValue.Builder subBuilder = null;
            if (allowAbsoluteUrl_ != null) {
              subBuilder = allowAbsoluteUrl_.toBuilder();
            }
            allowAbsoluteUrl_ = input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(allowAbsoluteUrl_);
              allowAbsoluteUrl_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            acceptHttp10_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            defaultHostForHttp10_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.api.v2.core.ProtocolProto.internal_static_envoy_api_v2_core_Http1ProtocolOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.api.v2.core.ProtocolProto.internal_static_envoy_api_v2_core_Http1ProtocolOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions.class, io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions.Builder.class);
  }

  public static final int ALLOW_ABSOLUTE_URL_FIELD_NUMBER = 1;
  private com.google.protobuf.BoolValue allowAbsoluteUrl_;
  /**
   * <pre>
   * Handle HTTP requests with absolute URLs in the requests. These requests
   * are generally sent by clients to forward/explicit proxies. This allows clients to configure
   * envoy as their HTTP proxy. In Unix, for example, this is typically done by setting the
   * *http_proxy* environment variable.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue allow_absolute_url = 1;</code>
   */
  public boolean hasAllowAbsoluteUrl() {
    return allowAbsoluteUrl_ != null;
  }
  /**
   * <pre>
   * Handle HTTP requests with absolute URLs in the requests. These requests
   * are generally sent by clients to forward/explicit proxies. This allows clients to configure
   * envoy as their HTTP proxy. In Unix, for example, this is typically done by setting the
   * *http_proxy* environment variable.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue allow_absolute_url = 1;</code>
   */
  public com.google.protobuf.BoolValue getAllowAbsoluteUrl() {
    return allowAbsoluteUrl_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : allowAbsoluteUrl_;
  }
  /**
   * <pre>
   * Handle HTTP requests with absolute URLs in the requests. These requests
   * are generally sent by clients to forward/explicit proxies. This allows clients to configure
   * envoy as their HTTP proxy. In Unix, for example, this is typically done by setting the
   * *http_proxy* environment variable.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue allow_absolute_url = 1;</code>
   */
  public com.google.protobuf.BoolValueOrBuilder getAllowAbsoluteUrlOrBuilder() {
    return getAllowAbsoluteUrl();
  }

  public static final int ACCEPT_HTTP_10_FIELD_NUMBER = 2;
  private boolean acceptHttp10_;
  /**
   * <pre>
   * Handle incoming HTTP/1.0 and HTTP 0.9 requests.
   * This is off by default, and not fully standards compliant. There is support for pre-HTTP/1.1
   * style connect logic, dechunking, and handling lack of client host iff
   * *default_host_for_http_10* is configured.
   * </pre>
   *
   * <code>bool accept_http_10 = 2;</code>
   */
  public boolean getAcceptHttp10() {
    return acceptHttp10_;
  }

  public static final int DEFAULT_HOST_FOR_HTTP_10_FIELD_NUMBER = 3;
  private volatile java.lang.Object defaultHostForHttp10_;
  /**
   * <pre>
   * A default host for HTTP/1.0 requests. This is highly suggested if *accept_http_10* is true as
   * Envoy does not otherwise support HTTP/1.0 without a Host header.
   * This is a no-op if *accept_http_10* is not true.
   * </pre>
   *
   * <code>string default_host_for_http_10 = 3;</code>
   */
  public java.lang.String getDefaultHostForHttp10() {
    java.lang.Object ref = defaultHostForHttp10_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      defaultHostForHttp10_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A default host for HTTP/1.0 requests. This is highly suggested if *accept_http_10* is true as
   * Envoy does not otherwise support HTTP/1.0 without a Host header.
   * This is a no-op if *accept_http_10* is not true.
   * </pre>
   *
   * <code>string default_host_for_http_10 = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDefaultHostForHttp10Bytes() {
    java.lang.Object ref = defaultHostForHttp10_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      defaultHostForHttp10_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (allowAbsoluteUrl_ != null) {
      output.writeMessage(1, getAllowAbsoluteUrl());
    }
    if (acceptHttp10_ != false) {
      output.writeBool(2, acceptHttp10_);
    }
    if (!getDefaultHostForHttp10Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, defaultHostForHttp10_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (allowAbsoluteUrl_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAllowAbsoluteUrl());
    }
    if (acceptHttp10_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, acceptHttp10_);
    }
    if (!getDefaultHostForHttp10Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, defaultHostForHttp10_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions other = (io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions) obj;

    boolean result = true;
    result = result && (hasAllowAbsoluteUrl() == other.hasAllowAbsoluteUrl());
    if (hasAllowAbsoluteUrl()) {
      result = result && getAllowAbsoluteUrl()
          .equals(other.getAllowAbsoluteUrl());
    }
    result = result && (getAcceptHttp10()
        == other.getAcceptHttp10());
    result = result && getDefaultHostForHttp10()
        .equals(other.getDefaultHostForHttp10());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAllowAbsoluteUrl()) {
      hash = (37 * hash) + ALLOW_ABSOLUTE_URL_FIELD_NUMBER;
      hash = (53 * hash) + getAllowAbsoluteUrl().hashCode();
    }
    hash = (37 * hash) + ACCEPT_HTTP_10_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAcceptHttp10());
    hash = (37 * hash) + DEFAULT_HOST_FOR_HTTP_10_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultHostForHttp10().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code envoy.api.v2.core.Http1ProtocolOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.core.Http1ProtocolOptions)
      io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.api.v2.core.ProtocolProto.internal_static_envoy_api_v2_core_Http1ProtocolOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.api.v2.core.ProtocolProto.internal_static_envoy_api_v2_core_Http1ProtocolOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions.class, io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (allowAbsoluteUrlBuilder_ == null) {
        allowAbsoluteUrl_ = null;
      } else {
        allowAbsoluteUrl_ = null;
        allowAbsoluteUrlBuilder_ = null;
      }
      acceptHttp10_ = false;

      defaultHostForHttp10_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.api.v2.core.ProtocolProto.internal_static_envoy_api_v2_core_Http1ProtocolOptions_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions getDefaultInstanceForType() {
      return io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions build() {
      io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions buildPartial() {
      io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions result = new io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions(this);
      if (allowAbsoluteUrlBuilder_ == null) {
        result.allowAbsoluteUrl_ = allowAbsoluteUrl_;
      } else {
        result.allowAbsoluteUrl_ = allowAbsoluteUrlBuilder_.build();
      }
      result.acceptHttp10_ = acceptHttp10_;
      result.defaultHostForHttp10_ = defaultHostForHttp10_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions) {
        return mergeFrom((io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions other) {
      if (other == io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions.getDefaultInstance()) return this;
      if (other.hasAllowAbsoluteUrl()) {
        mergeAllowAbsoluteUrl(other.getAllowAbsoluteUrl());
      }
      if (other.getAcceptHttp10() != false) {
        setAcceptHttp10(other.getAcceptHttp10());
      }
      if (!other.getDefaultHostForHttp10().isEmpty()) {
        defaultHostForHttp10_ = other.defaultHostForHttp10_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.BoolValue allowAbsoluteUrl_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> allowAbsoluteUrlBuilder_;
    /**
     * <pre>
     * Handle HTTP requests with absolute URLs in the requests. These requests
     * are generally sent by clients to forward/explicit proxies. This allows clients to configure
     * envoy as their HTTP proxy. In Unix, for example, this is typically done by setting the
     * *http_proxy* environment variable.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_absolute_url = 1;</code>
     */
    public boolean hasAllowAbsoluteUrl() {
      return allowAbsoluteUrlBuilder_ != null || allowAbsoluteUrl_ != null;
    }
    /**
     * <pre>
     * Handle HTTP requests with absolute URLs in the requests. These requests
     * are generally sent by clients to forward/explicit proxies. This allows clients to configure
     * envoy as their HTTP proxy. In Unix, for example, this is typically done by setting the
     * *http_proxy* environment variable.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_absolute_url = 1;</code>
     */
    public com.google.protobuf.BoolValue getAllowAbsoluteUrl() {
      if (allowAbsoluteUrlBuilder_ == null) {
        return allowAbsoluteUrl_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : allowAbsoluteUrl_;
      } else {
        return allowAbsoluteUrlBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Handle HTTP requests with absolute URLs in the requests. These requests
     * are generally sent by clients to forward/explicit proxies. This allows clients to configure
     * envoy as their HTTP proxy. In Unix, for example, this is typically done by setting the
     * *http_proxy* environment variable.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_absolute_url = 1;</code>
     */
    public Builder setAllowAbsoluteUrl(com.google.protobuf.BoolValue value) {
      if (allowAbsoluteUrlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        allowAbsoluteUrl_ = value;
        onChanged();
      } else {
        allowAbsoluteUrlBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Handle HTTP requests with absolute URLs in the requests. These requests
     * are generally sent by clients to forward/explicit proxies. This allows clients to configure
     * envoy as their HTTP proxy. In Unix, for example, this is typically done by setting the
     * *http_proxy* environment variable.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_absolute_url = 1;</code>
     */
    public Builder setAllowAbsoluteUrl(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (allowAbsoluteUrlBuilder_ == null) {
        allowAbsoluteUrl_ = builderForValue.build();
        onChanged();
      } else {
        allowAbsoluteUrlBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Handle HTTP requests with absolute URLs in the requests. These requests
     * are generally sent by clients to forward/explicit proxies. This allows clients to configure
     * envoy as their HTTP proxy. In Unix, for example, this is typically done by setting the
     * *http_proxy* environment variable.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_absolute_url = 1;</code>
     */
    public Builder mergeAllowAbsoluteUrl(com.google.protobuf.BoolValue value) {
      if (allowAbsoluteUrlBuilder_ == null) {
        if (allowAbsoluteUrl_ != null) {
          allowAbsoluteUrl_ =
            com.google.protobuf.BoolValue.newBuilder(allowAbsoluteUrl_).mergeFrom(value).buildPartial();
        } else {
          allowAbsoluteUrl_ = value;
        }
        onChanged();
      } else {
        allowAbsoluteUrlBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Handle HTTP requests with absolute URLs in the requests. These requests
     * are generally sent by clients to forward/explicit proxies. This allows clients to configure
     * envoy as their HTTP proxy. In Unix, for example, this is typically done by setting the
     * *http_proxy* environment variable.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_absolute_url = 1;</code>
     */
    public Builder clearAllowAbsoluteUrl() {
      if (allowAbsoluteUrlBuilder_ == null) {
        allowAbsoluteUrl_ = null;
        onChanged();
      } else {
        allowAbsoluteUrl_ = null;
        allowAbsoluteUrlBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Handle HTTP requests with absolute URLs in the requests. These requests
     * are generally sent by clients to forward/explicit proxies. This allows clients to configure
     * envoy as their HTTP proxy. In Unix, for example, this is typically done by setting the
     * *http_proxy* environment variable.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_absolute_url = 1;</code>
     */
    public com.google.protobuf.BoolValue.Builder getAllowAbsoluteUrlBuilder() {
      
      onChanged();
      return getAllowAbsoluteUrlFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Handle HTTP requests with absolute URLs in the requests. These requests
     * are generally sent by clients to forward/explicit proxies. This allows clients to configure
     * envoy as their HTTP proxy. In Unix, for example, this is typically done by setting the
     * *http_proxy* environment variable.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_absolute_url = 1;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getAllowAbsoluteUrlOrBuilder() {
      if (allowAbsoluteUrlBuilder_ != null) {
        return allowAbsoluteUrlBuilder_.getMessageOrBuilder();
      } else {
        return allowAbsoluteUrl_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : allowAbsoluteUrl_;
      }
    }
    /**
     * <pre>
     * Handle HTTP requests with absolute URLs in the requests. These requests
     * are generally sent by clients to forward/explicit proxies. This allows clients to configure
     * envoy as their HTTP proxy. In Unix, for example, this is typically done by setting the
     * *http_proxy* environment variable.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_absolute_url = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getAllowAbsoluteUrlFieldBuilder() {
      if (allowAbsoluteUrlBuilder_ == null) {
        allowAbsoluteUrlBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getAllowAbsoluteUrl(),
                getParentForChildren(),
                isClean());
        allowAbsoluteUrl_ = null;
      }
      return allowAbsoluteUrlBuilder_;
    }

    private boolean acceptHttp10_ ;
    /**
     * <pre>
     * Handle incoming HTTP/1.0 and HTTP 0.9 requests.
     * This is off by default, and not fully standards compliant. There is support for pre-HTTP/1.1
     * style connect logic, dechunking, and handling lack of client host iff
     * *default_host_for_http_10* is configured.
     * </pre>
     *
     * <code>bool accept_http_10 = 2;</code>
     */
    public boolean getAcceptHttp10() {
      return acceptHttp10_;
    }
    /**
     * <pre>
     * Handle incoming HTTP/1.0 and HTTP 0.9 requests.
     * This is off by default, and not fully standards compliant. There is support for pre-HTTP/1.1
     * style connect logic, dechunking, and handling lack of client host iff
     * *default_host_for_http_10* is configured.
     * </pre>
     *
     * <code>bool accept_http_10 = 2;</code>
     */
    public Builder setAcceptHttp10(boolean value) {
      
      acceptHttp10_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Handle incoming HTTP/1.0 and HTTP 0.9 requests.
     * This is off by default, and not fully standards compliant. There is support for pre-HTTP/1.1
     * style connect logic, dechunking, and handling lack of client host iff
     * *default_host_for_http_10* is configured.
     * </pre>
     *
     * <code>bool accept_http_10 = 2;</code>
     */
    public Builder clearAcceptHttp10() {
      
      acceptHttp10_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object defaultHostForHttp10_ = "";
    /**
     * <pre>
     * A default host for HTTP/1.0 requests. This is highly suggested if *accept_http_10* is true as
     * Envoy does not otherwise support HTTP/1.0 without a Host header.
     * This is a no-op if *accept_http_10* is not true.
     * </pre>
     *
     * <code>string default_host_for_http_10 = 3;</code>
     */
    public java.lang.String getDefaultHostForHttp10() {
      java.lang.Object ref = defaultHostForHttp10_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultHostForHttp10_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A default host for HTTP/1.0 requests. This is highly suggested if *accept_http_10* is true as
     * Envoy does not otherwise support HTTP/1.0 without a Host header.
     * This is a no-op if *accept_http_10* is not true.
     * </pre>
     *
     * <code>string default_host_for_http_10 = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDefaultHostForHttp10Bytes() {
      java.lang.Object ref = defaultHostForHttp10_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        defaultHostForHttp10_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A default host for HTTP/1.0 requests. This is highly suggested if *accept_http_10* is true as
     * Envoy does not otherwise support HTTP/1.0 without a Host header.
     * This is a no-op if *accept_http_10* is not true.
     * </pre>
     *
     * <code>string default_host_for_http_10 = 3;</code>
     */
    public Builder setDefaultHostForHttp10(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      defaultHostForHttp10_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A default host for HTTP/1.0 requests. This is highly suggested if *accept_http_10* is true as
     * Envoy does not otherwise support HTTP/1.0 without a Host header.
     * This is a no-op if *accept_http_10* is not true.
     * </pre>
     *
     * <code>string default_host_for_http_10 = 3;</code>
     */
    public Builder clearDefaultHostForHttp10() {
      
      defaultHostForHttp10_ = getDefaultInstance().getDefaultHostForHttp10();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A default host for HTTP/1.0 requests. This is highly suggested if *accept_http_10* is true as
     * Envoy does not otherwise support HTTP/1.0 without a Host header.
     * This is a no-op if *accept_http_10* is not true.
     * </pre>
     *
     * <code>string default_host_for_http_10 = 3;</code>
     */
    public Builder setDefaultHostForHttp10Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      defaultHostForHttp10_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.core.Http1ProtocolOptions)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.core.Http1ProtocolOptions)
  private static final io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions();
  }

  public static io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Http1ProtocolOptions>
      PARSER = new com.google.protobuf.AbstractParser<Http1ProtocolOptions>() {
    @java.lang.Override
    public Http1ProtocolOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Http1ProtocolOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Http1ProtocolOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Http1ProtocolOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.Http1ProtocolOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

