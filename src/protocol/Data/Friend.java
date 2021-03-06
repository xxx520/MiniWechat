// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Friend.proto

package protocol.Data;

public final class Friend {
  private Friend() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface FriendItemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.FriendItem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string userId = 1;</code>
     */
    boolean hasUserId();
    /**
     * <code>required string userId = 1;</code>
     */
    java.lang.String getUserId();
    /**
     * <code>required string userId = 1;</code>
     */
    com.google.protobuf.ByteString
        getUserIdBytes();

    /**
     * <code>required string friendId = 2;</code>
     */
    boolean hasFriendId();
    /**
     * <code>required string friendId = 2;</code>
     */
    java.lang.String getFriendId();
    /**
     * <code>required string friendId = 2;</code>
     */
    com.google.protobuf.ByteString
        getFriendIdBytes();

    /**
     * <code>optional string friendName = 3;</code>
     */
    boolean hasFriendName();
    /**
     * <code>optional string friendName = 3;</code>
     */
    java.lang.String getFriendName();
    /**
     * <code>optional string friendName = 3;</code>
     */
    com.google.protobuf.ByteString
        getFriendNameBytes();

    /**
     * <code>optional string headPath = 4;</code>
     */
    boolean hasHeadPath();
    /**
     * <code>optional string headPath = 4;</code>
     */
    java.lang.String getHeadPath();
    /**
     * <code>optional string headPath = 4;</code>
     */
    com.google.protobuf.ByteString
        getHeadPathBytes();

    /**
     * <code>optional int64 creatTime = 5;</code>
     */
    boolean hasCreatTime();
    /**
     * <code>optional int64 creatTime = 5;</code>
     */
    long getCreatTime();
  }
  /**
   * Protobuf type {@code protocol.FriendItem}
   */
  public static final class FriendItem extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:protocol.FriendItem)
      FriendItemOrBuilder {
    // Use FriendItem.newBuilder() to construct.
    private FriendItem(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FriendItem(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FriendItem defaultInstance;
    public static FriendItem getDefaultInstance() {
      return defaultInstance;
    }

    public FriendItem getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FriendItem(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              userId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              friendId_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              friendName_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              headPath_ = bs;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              creatTime_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.Data.Friend.internal_static_protocol_FriendItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.Data.Friend.internal_static_protocol_FriendItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.Data.Friend.FriendItem.class, protocol.Data.Friend.FriendItem.Builder.class);
    }

    public static com.google.protobuf.Parser<FriendItem> PARSER =
        new com.google.protobuf.AbstractParser<FriendItem>() {
      public FriendItem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FriendItem(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FriendItem> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int USERID_FIELD_NUMBER = 1;
    private java.lang.Object userId_;
    /**
     * <code>required string userId = 1;</code>
     */
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string userId = 1;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          userId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string userId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FRIENDID_FIELD_NUMBER = 2;
    private java.lang.Object friendId_;
    /**
     * <code>required string friendId = 2;</code>
     */
    public boolean hasFriendId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string friendId = 2;</code>
     */
    public java.lang.String getFriendId() {
      java.lang.Object ref = friendId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          friendId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string friendId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFriendIdBytes() {
      java.lang.Object ref = friendId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        friendId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FRIENDNAME_FIELD_NUMBER = 3;
    private java.lang.Object friendName_;
    /**
     * <code>optional string friendName = 3;</code>
     */
    public boolean hasFriendName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string friendName = 3;</code>
     */
    public java.lang.String getFriendName() {
      java.lang.Object ref = friendName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          friendName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string friendName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFriendNameBytes() {
      java.lang.Object ref = friendName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        friendName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HEADPATH_FIELD_NUMBER = 4;
    private java.lang.Object headPath_;
    /**
     * <code>optional string headPath = 4;</code>
     */
    public boolean hasHeadPath() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string headPath = 4;</code>
     */
    public java.lang.String getHeadPath() {
      java.lang.Object ref = headPath_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          headPath_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string headPath = 4;</code>
     */
    public com.google.protobuf.ByteString
        getHeadPathBytes() {
      java.lang.Object ref = headPath_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        headPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CREATTIME_FIELD_NUMBER = 5;
    private long creatTime_;
    /**
     * <code>optional int64 creatTime = 5;</code>
     */
    public boolean hasCreatTime() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int64 creatTime = 5;</code>
     */
    public long getCreatTime() {
      return creatTime_;
    }

    private void initFields() {
      userId_ = "";
      friendId_ = "";
      friendName_ = "";
      headPath_ = "";
      creatTime_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasUserId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFriendId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getUserIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getFriendIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getFriendNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getHeadPathBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, creatTime_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getUserIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getFriendIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getFriendNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getHeadPathBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, creatTime_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static protocol.Data.Friend.FriendItem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.Data.Friend.FriendItem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.Data.Friend.FriendItem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.Data.Friend.FriendItem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.Data.Friend.FriendItem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protocol.Data.Friend.FriendItem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protocol.Data.Friend.FriendItem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protocol.Data.Friend.FriendItem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protocol.Data.Friend.FriendItem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protocol.Data.Friend.FriendItem parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protocol.Data.Friend.FriendItem prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.FriendItem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.FriendItem)
        protocol.Data.Friend.FriendItemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protocol.Data.Friend.internal_static_protocol_FriendItem_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protocol.Data.Friend.internal_static_protocol_FriendItem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protocol.Data.Friend.FriendItem.class, protocol.Data.Friend.FriendItem.Builder.class);
      }

      // Construct using protocol.Data.Friend.FriendItem.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        userId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        friendId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        friendName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        headPath_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        creatTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protocol.Data.Friend.internal_static_protocol_FriendItem_descriptor;
      }

      public protocol.Data.Friend.FriendItem getDefaultInstanceForType() {
        return protocol.Data.Friend.FriendItem.getDefaultInstance();
      }

      public protocol.Data.Friend.FriendItem build() {
        protocol.Data.Friend.FriendItem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protocol.Data.Friend.FriendItem buildPartial() {
        protocol.Data.Friend.FriendItem result = new protocol.Data.Friend.FriendItem(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userId_ = userId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.friendId_ = friendId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.friendName_ = friendName_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.headPath_ = headPath_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.creatTime_ = creatTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protocol.Data.Friend.FriendItem) {
          return mergeFrom((protocol.Data.Friend.FriendItem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protocol.Data.Friend.FriendItem other) {
        if (other == protocol.Data.Friend.FriendItem.getDefaultInstance()) return this;
        if (other.hasUserId()) {
          bitField0_ |= 0x00000001;
          userId_ = other.userId_;
          onChanged();
        }
        if (other.hasFriendId()) {
          bitField0_ |= 0x00000002;
          friendId_ = other.friendId_;
          onChanged();
        }
        if (other.hasFriendName()) {
          bitField0_ |= 0x00000004;
          friendName_ = other.friendName_;
          onChanged();
        }
        if (other.hasHeadPath()) {
          bitField0_ |= 0x00000008;
          headPath_ = other.headPath_;
          onChanged();
        }
        if (other.hasCreatTime()) {
          setCreatTime(other.getCreatTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasUserId()) {
          
          return false;
        }
        if (!hasFriendId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protocol.Data.Friend.FriendItem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protocol.Data.Friend.FriendItem) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object userId_ = "";
      /**
       * <code>required string userId = 1;</code>
       */
      public boolean hasUserId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string userId = 1;</code>
       */
      public java.lang.String getUserId() {
        java.lang.Object ref = userId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            userId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string userId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUserIdBytes() {
        java.lang.Object ref = userId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string userId = 1;</code>
       */
      public Builder setUserId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string userId = 1;</code>
       */
      public Builder clearUserId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userId_ = getDefaultInstance().getUserId();
        onChanged();
        return this;
      }
      /**
       * <code>required string userId = 1;</code>
       */
      public Builder setUserIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        userId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object friendId_ = "";
      /**
       * <code>required string friendId = 2;</code>
       */
      public boolean hasFriendId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string friendId = 2;</code>
       */
      public java.lang.String getFriendId() {
        java.lang.Object ref = friendId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            friendId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string friendId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getFriendIdBytes() {
        java.lang.Object ref = friendId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          friendId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string friendId = 2;</code>
       */
      public Builder setFriendId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        friendId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string friendId = 2;</code>
       */
      public Builder clearFriendId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        friendId_ = getDefaultInstance().getFriendId();
        onChanged();
        return this;
      }
      /**
       * <code>required string friendId = 2;</code>
       */
      public Builder setFriendIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        friendId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object friendName_ = "";
      /**
       * <code>optional string friendName = 3;</code>
       */
      public boolean hasFriendName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string friendName = 3;</code>
       */
      public java.lang.String getFriendName() {
        java.lang.Object ref = friendName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            friendName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string friendName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getFriendNameBytes() {
        java.lang.Object ref = friendName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          friendName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string friendName = 3;</code>
       */
      public Builder setFriendName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        friendName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string friendName = 3;</code>
       */
      public Builder clearFriendName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        friendName_ = getDefaultInstance().getFriendName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string friendName = 3;</code>
       */
      public Builder setFriendNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        friendName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object headPath_ = "";
      /**
       * <code>optional string headPath = 4;</code>
       */
      public boolean hasHeadPath() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string headPath = 4;</code>
       */
      public java.lang.String getHeadPath() {
        java.lang.Object ref = headPath_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            headPath_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string headPath = 4;</code>
       */
      public com.google.protobuf.ByteString
          getHeadPathBytes() {
        java.lang.Object ref = headPath_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          headPath_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string headPath = 4;</code>
       */
      public Builder setHeadPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        headPath_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string headPath = 4;</code>
       */
      public Builder clearHeadPath() {
        bitField0_ = (bitField0_ & ~0x00000008);
        headPath_ = getDefaultInstance().getHeadPath();
        onChanged();
        return this;
      }
      /**
       * <code>optional string headPath = 4;</code>
       */
      public Builder setHeadPathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        headPath_ = value;
        onChanged();
        return this;
      }

      private long creatTime_ ;
      /**
       * <code>optional int64 creatTime = 5;</code>
       */
      public boolean hasCreatTime() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int64 creatTime = 5;</code>
       */
      public long getCreatTime() {
        return creatTime_;
      }
      /**
       * <code>optional int64 creatTime = 5;</code>
       */
      public Builder setCreatTime(long value) {
        bitField0_ |= 0x00000010;
        creatTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 creatTime = 5;</code>
       */
      public Builder clearCreatTime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        creatTime_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protocol.FriendItem)
    }

    static {
      defaultInstance = new FriendItem(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocol.FriendItem)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_FriendItem_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocol_FriendItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Friend.proto\022\010protocol\"g\n\nFriendItem\022\016" +
      "\n\006userId\030\001 \002(\t\022\020\n\010friendId\030\002 \002(\t\022\022\n\nfrie" +
      "ndName\030\003 \001(\t\022\020\n\010headPath\030\004 \001(\t\022\021\n\tcreatT" +
      "ime\030\005 \001(\003B\017\n\rprotocol.Data"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_protocol_FriendItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_FriendItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_protocol_FriendItem_descriptor,
        new java.lang.String[] { "UserId", "FriendId", "FriendName", "HeadPath", "CreatTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
