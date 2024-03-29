package calculator.server;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

public final class MessageOuterClass {
  private MessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 messageType = 1;</code>
     * @return The messageType.
     */
    int getMessageType();

    /**
     * <code>int32 requestId = 2;</code>
     * @return The requestId.
     */
    int getRequestId();

    /**
     * <code>string objectReference = 3;</code>
     * @return The objectReference.
     */
    String getObjectReference();
    /**
     * <code>string objectReference = 3;</code>
     * @return The bytes for objectReference.
     */
    com.google.protobuf.ByteString
        getObjectReferenceBytes();

    /**
     * <code>string methodId = 4;</code>
     * @return The methodId.
     */
    String getMethodId();
    /**
     * <code>string methodId = 4;</code>
     * @return The bytes for methodId.
     */
    com.google.protobuf.ByteString
        getMethodIdBytes();

    /**
     * <code>bytes arguments = 5;</code>
     * @return The arguments.
     */
    com.google.protobuf.ByteString getArguments();
  }
  /**
   * Protobuf type {@code Message}
   */
  public  static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Message)
      MessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
      objectReference_ = "";
      methodId_ = "";
      arguments_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Message();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
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
            case 8: {

              messageType_ = input.readInt32();
              break;
            }
            case 16: {

              requestId_ = input.readInt32();
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              objectReference_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              methodId_ = s;
              break;
            }
            case 42: {

              arguments_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return MessageOuterClass.internal_static_Message_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageOuterClass.internal_static_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Message.class, Builder.class);
    }

    public static final int MESSAGETYPE_FIELD_NUMBER = 1;
    private int messageType_;
    /**
     * <code>int32 messageType = 1;</code>
     * @return The messageType.
     */
    public int getMessageType() {
      return messageType_;
    }

    public static final int REQUESTID_FIELD_NUMBER = 2;
    private int requestId_;
    /**
     * <code>int32 requestId = 2;</code>
     * @return The requestId.
     */
    public int getRequestId() {
      return requestId_;
    }

    public static final int OBJECTREFERENCE_FIELD_NUMBER = 3;
    private volatile Object objectReference_;
    /**
     * <code>string objectReference = 3;</code>
     * @return The objectReference.
     */
    public String getObjectReference() {
      Object ref = objectReference_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        objectReference_ = s;
        return s;
      }
    }
    /**
     * <code>string objectReference = 3;</code>
     * @return The bytes for objectReference.
     */
    public com.google.protobuf.ByteString
        getObjectReferenceBytes() {
      Object ref = objectReference_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        objectReference_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int METHODID_FIELD_NUMBER = 4;
    private volatile Object methodId_;
    /**
     * <code>string methodId = 4;</code>
     * @return The methodId.
     */
    public String getMethodId() {
      Object ref = methodId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        methodId_ = s;
        return s;
      }
    }
    /**
     * <code>string methodId = 4;</code>
     * @return The bytes for methodId.
     */
    public com.google.protobuf.ByteString
        getMethodIdBytes() {
      Object ref = methodId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        methodId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ARGUMENTS_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString arguments_;
    /**
     * <code>bytes arguments = 5;</code>
     * @return The arguments.
     */
    public com.google.protobuf.ByteString getArguments() {
      return arguments_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (messageType_ != 0) {
        output.writeInt32(1, messageType_);
      }
      if (requestId_ != 0) {
        output.writeInt32(2, requestId_);
      }
      if (!getObjectReferenceBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, objectReference_);
      }
      if (!getMethodIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, methodId_);
      }
      if (!arguments_.isEmpty()) {
        output.writeBytes(5, arguments_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (messageType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, messageType_);
      }
      if (requestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, requestId_);
      }
      if (!getObjectReferenceBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, objectReference_);
      }
      if (!getMethodIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, methodId_);
      }
      if (!arguments_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, arguments_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Message)) {
        return super.equals(obj);
      }
      Message other = (Message) obj;

      if (getMessageType()
          != other.getMessageType()) return false;
      if (getRequestId()
          != other.getRequestId()) return false;
      if (!getObjectReference()
          .equals(other.getObjectReference())) return false;
      if (!getMethodId()
          .equals(other.getMethodId())) return false;
      if (!getArguments()
          .equals(other.getArguments())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MESSAGETYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMessageType();
      hash = (37 * hash) + REQUESTID_FIELD_NUMBER;
      hash = (53 * hash) + getRequestId();
      hash = (37 * hash) + OBJECTREFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + getObjectReference().hashCode();
      hash = (37 * hash) + METHODID_FIELD_NUMBER;
      hash = (53 * hash) + getMethodId().hashCode();
      hash = (37 * hash) + ARGUMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getArguments().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Message prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Message)
        MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MessageOuterClass.internal_static_Message_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MessageOuterClass.internal_static_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Message.class, Builder.class);
      }

      // Construct using MessageOuterClass.Message.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        messageType_ = 0;

        requestId_ = 0;

        objectReference_ = "";

        methodId_ = "";

        arguments_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MessageOuterClass.internal_static_Message_descriptor;
      }

      @Override
      public Message getDefaultInstanceForType() {
        return Message.getDefaultInstance();
      }

      @Override
      public Message build() {
        Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Message buildPartial() {
        Message result = new Message(this);
        result.messageType_ = messageType_;
        result.requestId_ = requestId_;
        result.objectReference_ = objectReference_;
        result.methodId_ = methodId_;
        result.arguments_ = arguments_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Message) {
          return mergeFrom((Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Message other) {
        if (other == Message.getDefaultInstance()) return this;
        if (other.getMessageType() != 0) {
          setMessageType(other.getMessageType());
        }
        if (other.getRequestId() != 0) {
          setRequestId(other.getRequestId());
        }
        if (!other.getObjectReference().isEmpty()) {
          objectReference_ = other.objectReference_;
          onChanged();
        }
        if (!other.getMethodId().isEmpty()) {
          methodId_ = other.methodId_;
          onChanged();
        }
        if (other.getArguments() != com.google.protobuf.ByteString.EMPTY) {
          setArguments(other.getArguments());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Message) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int messageType_ ;
      /**
       * <code>int32 messageType = 1;</code>
       * @return The messageType.
       */
      public int getMessageType() {
        return messageType_;
      }
      /**
       * <code>int32 messageType = 1;</code>
       * @param value The messageType to set.
       * @return This builder for chaining.
       */
      public Builder setMessageType(int value) {
        
        messageType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 messageType = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessageType() {
        
        messageType_ = 0;
        onChanged();
        return this;
      }

      private int requestId_ ;
      /**
       * <code>int32 requestId = 2;</code>
       * @return The requestId.
       */
      public int getRequestId() {
        return requestId_;
      }
      /**
       * <code>int32 requestId = 2;</code>
       * @param value The requestId to set.
       * @return This builder for chaining.
       */
      public Builder setRequestId(int value) {
        
        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 requestId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequestId() {
        
        requestId_ = 0;
        onChanged();
        return this;
      }

      private Object objectReference_ = "";
      /**
       * <code>string objectReference = 3;</code>
       * @return The objectReference.
       */
      public String getObjectReference() {
        Object ref = objectReference_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          objectReference_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string objectReference = 3;</code>
       * @return The bytes for objectReference.
       */
      public com.google.protobuf.ByteString
          getObjectReferenceBytes() {
        Object ref = objectReference_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          objectReference_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string objectReference = 3;</code>
       * @param value The objectReference to set.
       * @return This builder for chaining.
       */
      public Builder setObjectReference(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        objectReference_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string objectReference = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearObjectReference() {
        
        objectReference_ = getDefaultInstance().getObjectReference();
        onChanged();
        return this;
      }
      /**
       * <code>string objectReference = 3;</code>
       * @param value The bytes for objectReference to set.
       * @return This builder for chaining.
       */
      public Builder setObjectReferenceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        objectReference_ = value;
        onChanged();
        return this;
      }

      private Object methodId_ = "";
      /**
       * <code>string methodId = 4;</code>
       * @return The methodId.
       */
      public String getMethodId() {
        Object ref = methodId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          methodId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string methodId = 4;</code>
       * @return The bytes for methodId.
       */
      public com.google.protobuf.ByteString
          getMethodIdBytes() {
        Object ref = methodId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          methodId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string methodId = 4;</code>
       * @param value The methodId to set.
       * @return This builder for chaining.
       */
      public Builder setMethodId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        methodId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string methodId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMethodId() {
        
        methodId_ = getDefaultInstance().getMethodId();
        onChanged();
        return this;
      }
      /**
       * <code>string methodId = 4;</code>
       * @param value The bytes for methodId to set.
       * @return This builder for chaining.
       */
      public Builder setMethodIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        methodId_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString arguments_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes arguments = 5;</code>
       * @return The arguments.
       */
      public com.google.protobuf.ByteString getArguments() {
        return arguments_;
      }
      /**
       * <code>bytes arguments = 5;</code>
       * @param value The arguments to set.
       * @return This builder for chaining.
       */
      public Builder setArguments(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        arguments_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes arguments = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearArguments() {
        
        arguments_ = getDefaultInstance().getArguments();
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Message)
    }

    // @@protoc_insertion_point(class_scope:Message)
    private static final Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Message();
    }

    public static Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      @Override
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Message(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Message> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    @Override
    public Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Message_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rmessage.proto\"o\n\007Message\022\023\n\013messageTyp" +
      "e\030\001 \001(\005\022\021\n\trequestId\030\002 \001(\005\022\027\n\017objectRefe" +
      "rence\030\003 \001(\t\022\020\n\010methodId\030\004 \001(\t\022\021\n\targumen" +
      "ts\030\005 \001(\014b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Message_descriptor,
        new String[] { "MessageType", "RequestId", "ObjectReference", "MethodId", "Arguments", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
