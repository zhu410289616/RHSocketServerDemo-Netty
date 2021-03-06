// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RHBaseMessage.proto

package com.zrh.socket.core.codec.proto;

public final class BaseProtocol {
  private BaseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RHBaseMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RHBaseMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 protobuf_type = 1;</code>
     */
    boolean hasProtobufType();
    /**
     * <code>optional int32 protobuf_type = 1;</code>
     */
    int getProtobufType();

    /**
     * <code>required string protobuf_class_name = 2;</code>
     */
    boolean hasProtobufClassName();
    /**
     * <code>required string protobuf_class_name = 2;</code>
     */
    java.lang.String getProtobufClassName();
    /**
     * <code>required string protobuf_class_name = 2;</code>
     */
    com.google.protobuf.ByteString
        getProtobufClassNameBytes();

    /**
     * <code>required bytes protobuf_data = 3;</code>
     */
    boolean hasProtobufData();
    /**
     * <code>required bytes protobuf_data = 3;</code>
     */
    com.google.protobuf.ByteString getProtobufData();
  }
  /**
   * Protobuf type {@code RHBaseMessage}
   */
  public static final class RHBaseMessage extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:RHBaseMessage)
      RHBaseMessageOrBuilder {
    // Use RHBaseMessage.newBuilder() to construct.
    private RHBaseMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RHBaseMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RHBaseMessage defaultInstance;
    public static RHBaseMessage getDefaultInstance() {
      return defaultInstance;
    }

    public RHBaseMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RHBaseMessage(
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
            case 8: {
              bitField0_ |= 0x00000001;
              protobufType_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              protobufClassName_ = bs;
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              protobufData_ = input.readBytes();
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
      return com.zrh.socket.core.codec.proto.BaseProtocol.internal_static_RHBaseMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zrh.socket.core.codec.proto.BaseProtocol.internal_static_RHBaseMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage.class, com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<RHBaseMessage> PARSER =
        new com.google.protobuf.AbstractParser<RHBaseMessage>() {
      public RHBaseMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RHBaseMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RHBaseMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int PROTOBUF_TYPE_FIELD_NUMBER = 1;
    private int protobufType_;
    /**
     * <code>optional int32 protobuf_type = 1;</code>
     */
    public boolean hasProtobufType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 protobuf_type = 1;</code>
     */
    public int getProtobufType() {
      return protobufType_;
    }

    public static final int PROTOBUF_CLASS_NAME_FIELD_NUMBER = 2;
    private java.lang.Object protobufClassName_;
    /**
     * <code>required string protobuf_class_name = 2;</code>
     */
    public boolean hasProtobufClassName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string protobuf_class_name = 2;</code>
     */
    public java.lang.String getProtobufClassName() {
      java.lang.Object ref = protobufClassName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          protobufClassName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string protobuf_class_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProtobufClassNameBytes() {
      java.lang.Object ref = protobufClassName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        protobufClassName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PROTOBUF_DATA_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString protobufData_;
    /**
     * <code>required bytes protobuf_data = 3;</code>
     */
    public boolean hasProtobufData() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required bytes protobuf_data = 3;</code>
     */
    public com.google.protobuf.ByteString getProtobufData() {
      return protobufData_;
    }

    private void initFields() {
      protobufType_ = 0;
      protobufClassName_ = "";
      protobufData_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasProtobufClassName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasProtobufData()) {
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
        output.writeInt32(1, protobufType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getProtobufClassNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, protobufData_);
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
          .computeInt32Size(1, protobufType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getProtobufClassNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, protobufData_);
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

    public static com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage prototype) {
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
     * Protobuf type {@code RHBaseMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RHBaseMessage)
        com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zrh.socket.core.codec.proto.BaseProtocol.internal_static_RHBaseMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zrh.socket.core.codec.proto.BaseProtocol.internal_static_RHBaseMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage.class, com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage.Builder.class);
      }

      // Construct using com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage.newBuilder()
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
        protobufType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        protobufClassName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        protobufData_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zrh.socket.core.codec.proto.BaseProtocol.internal_static_RHBaseMessage_descriptor;
      }

      public com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage getDefaultInstanceForType() {
        return com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage.getDefaultInstance();
      }

      public com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage build() {
        com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage buildPartial() {
        com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage result = new com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.protobufType_ = protobufType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.protobufClassName_ = protobufClassName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.protobufData_ = protobufData_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage) {
          return mergeFrom((com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage other) {
        if (other == com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage.getDefaultInstance()) return this;
        if (other.hasProtobufType()) {
          setProtobufType(other.getProtobufType());
        }
        if (other.hasProtobufClassName()) {
          bitField0_ |= 0x00000002;
          protobufClassName_ = other.protobufClassName_;
          onChanged();
        }
        if (other.hasProtobufData()) {
          setProtobufData(other.getProtobufData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasProtobufClassName()) {
          
          return false;
        }
        if (!hasProtobufData()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zrh.socket.core.codec.proto.BaseProtocol.RHBaseMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int protobufType_ ;
      /**
       * <code>optional int32 protobuf_type = 1;</code>
       */
      public boolean hasProtobufType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 protobuf_type = 1;</code>
       */
      public int getProtobufType() {
        return protobufType_;
      }
      /**
       * <code>optional int32 protobuf_type = 1;</code>
       */
      public Builder setProtobufType(int value) {
        bitField0_ |= 0x00000001;
        protobufType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 protobuf_type = 1;</code>
       */
      public Builder clearProtobufType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        protobufType_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object protobufClassName_ = "";
      /**
       * <code>required string protobuf_class_name = 2;</code>
       */
      public boolean hasProtobufClassName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string protobuf_class_name = 2;</code>
       */
      public java.lang.String getProtobufClassName() {
        java.lang.Object ref = protobufClassName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            protobufClassName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string protobuf_class_name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getProtobufClassNameBytes() {
        java.lang.Object ref = protobufClassName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          protobufClassName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string protobuf_class_name = 2;</code>
       */
      public Builder setProtobufClassName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        protobufClassName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string protobuf_class_name = 2;</code>
       */
      public Builder clearProtobufClassName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        protobufClassName_ = getDefaultInstance().getProtobufClassName();
        onChanged();
        return this;
      }
      /**
       * <code>required string protobuf_class_name = 2;</code>
       */
      public Builder setProtobufClassNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        protobufClassName_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString protobufData_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes protobuf_data = 3;</code>
       */
      public boolean hasProtobufData() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required bytes protobuf_data = 3;</code>
       */
      public com.google.protobuf.ByteString getProtobufData() {
        return protobufData_;
      }
      /**
       * <code>required bytes protobuf_data = 3;</code>
       */
      public Builder setProtobufData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        protobufData_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes protobuf_data = 3;</code>
       */
      public Builder clearProtobufData() {
        bitField0_ = (bitField0_ & ~0x00000004);
        protobufData_ = getDefaultInstance().getProtobufData();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:RHBaseMessage)
    }

    static {
      defaultInstance = new RHBaseMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:RHBaseMessage)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RHBaseMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RHBaseMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023RHBaseMessage.proto\"Z\n\rRHBaseMessage\022\025" +
      "\n\rprotobuf_type\030\001 \001(\005\022\033\n\023protobuf_class_" +
      "name\030\002 \002(\t\022\025\n\rprotobuf_data\030\003 \002(\014B/\n\037com" +
      ".zrh.socket.core.codec.protoB\014BaseProtoc" +
      "ol"
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
    internal_static_RHBaseMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RHBaseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_RHBaseMessage_descriptor,
        new java.lang.String[] { "ProtobufType", "ProtobufClassName", "ProtobufData", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
