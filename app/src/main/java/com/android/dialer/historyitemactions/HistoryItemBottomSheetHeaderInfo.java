// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/android/dialer/historyitemactions/history_item_bottom_sheet_header_info.proto

package com.android.dialer.historyitemactions;

/**
 * <pre>
 * Contains information necessary to construct the header for a history item's
 * bottom sheet.
 * A history item is one that is displayed in the call log or the voicemail
 * fragment.
 * Next ID: 5
 * </pre>
 *
 * Protobuf type {@code com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo}
 */
public  final class HistoryItemBottomSheetHeaderInfo extends
    com.google.protobuf.GeneratedMessageLite<
        HistoryItemBottomSheetHeaderInfo, HistoryItemBottomSheetHeaderInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo)
    HistoryItemBottomSheetHeaderInfoOrBuilder {
  private HistoryItemBottomSheetHeaderInfo() {
    primaryText_ = "";
    secondaryText_ = "";
  }
  private int bitField0_;
  public static final int NUMBER_FIELD_NUMBER = 1;
  private com.android.dialer.DialerPhoneNumber number_;
  /**
   * <pre>
   * The phone number associated with the item.
   * </pre>
   *
   * <code>optional .com.android.dialer.DialerPhoneNumber number = 1;</code>
   */
  public boolean hasNumber() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * The phone number associated with the item.
   * </pre>
   *
   * <code>optional .com.android.dialer.DialerPhoneNumber number = 1;</code>
   */
  public com.android.dialer.DialerPhoneNumber getNumber() {
    return number_ == null ? com.android.dialer.DialerPhoneNumber.getDefaultInstance() : number_;
  }
  /**
   * <pre>
   * The phone number associated with the item.
   * </pre>
   *
   * <code>optional .com.android.dialer.DialerPhoneNumber number = 1;</code>
   */
  private void setNumber(com.android.dialer.DialerPhoneNumber value) {
    if (value == null) {
      throw new NullPointerException();
    }
    number_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The phone number associated with the item.
   * </pre>
   *
   * <code>optional .com.android.dialer.DialerPhoneNumber number = 1;</code>
   */
  private void setNumber(
      com.android.dialer.DialerPhoneNumber.Builder builderForValue) {
    number_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The phone number associated with the item.
   * </pre>
   *
   * <code>optional .com.android.dialer.DialerPhoneNumber number = 1;</code>
   */
  private void mergeNumber(com.android.dialer.DialerPhoneNumber value) {
    if (number_ != null &&
        number_ != com.android.dialer.DialerPhoneNumber.getDefaultInstance()) {
      number_ =
        com.android.dialer.DialerPhoneNumber.newBuilder(number_).mergeFrom(value).buildPartial();
    } else {
      number_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The phone number associated with the item.
   * </pre>
   *
   * <code>optional .com.android.dialer.DialerPhoneNumber number = 1;</code>
   */
  private void clearNumber() {  number_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int PHOTO_INFO_FIELD_NUMBER = 2;
  private com.android.dialer.glidephotomanager.PhotoInfo photoInfo_;
  /**
   * <pre>
   * Information used to load the contact photo.
   * </pre>
   *
   * <code>optional .com.android.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
   */
  public boolean hasPhotoInfo() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * Information used to load the contact photo.
   * </pre>
   *
   * <code>optional .com.android.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
   */
  public com.android.dialer.glidephotomanager.PhotoInfo getPhotoInfo() {
    return photoInfo_ == null ? com.android.dialer.glidephotomanager.PhotoInfo.getDefaultInstance() : photoInfo_;
  }
  /**
   * <pre>
   * Information used to load the contact photo.
   * </pre>
   *
   * <code>optional .com.android.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
   */
  private void setPhotoInfo(com.android.dialer.glidephotomanager.PhotoInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    photoInfo_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * Information used to load the contact photo.
   * </pre>
   *
   * <code>optional .com.android.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
   */
  private void setPhotoInfo(
      com.android.dialer.glidephotomanager.PhotoInfo.Builder builderForValue) {
    photoInfo_ = builderForValue.build();
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * Information used to load the contact photo.
   * </pre>
   *
   * <code>optional .com.android.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
   */
  private void mergePhotoInfo(com.android.dialer.glidephotomanager.PhotoInfo value) {
    if (photoInfo_ != null &&
        photoInfo_ != com.android.dialer.glidephotomanager.PhotoInfo.getDefaultInstance()) {
      photoInfo_ =
        com.android.dialer.glidephotomanager.PhotoInfo.newBuilder(photoInfo_).mergeFrom(value).buildPartial();
    } else {
      photoInfo_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * Information used to load the contact photo.
   * </pre>
   *
   * <code>optional .com.android.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
   */
  private void clearPhotoInfo() {  photoInfo_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int PRIMARY_TEXT_FIELD_NUMBER = 3;
  private java.lang.String primaryText_;
  /**
   * <pre>
   * Primary text of the header, which can be
   * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
   * (2) the contact name, or
   * (3) the formatted number.
   * </pre>
   *
   * <code>optional string primary_text = 3;</code>
   */
  public boolean hasPrimaryText() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * Primary text of the header, which can be
   * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
   * (2) the contact name, or
   * (3) the formatted number.
   * </pre>
   *
   * <code>optional string primary_text = 3;</code>
   */
  public java.lang.String getPrimaryText() {
    return primaryText_;
  }
  /**
   * <pre>
   * Primary text of the header, which can be
   * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
   * (2) the contact name, or
   * (3) the formatted number.
   * </pre>
   *
   * <code>optional string primary_text = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPrimaryTextBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(primaryText_);
  }
  /**
   * <pre>
   * Primary text of the header, which can be
   * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
   * (2) the contact name, or
   * (3) the formatted number.
   * </pre>
   *
   * <code>optional string primary_text = 3;</code>
   */
  private void setPrimaryText(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    primaryText_ = value;
  }
  /**
   * <pre>
   * Primary text of the header, which can be
   * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
   * (2) the contact name, or
   * (3) the formatted number.
   * </pre>
   *
   * <code>optional string primary_text = 3;</code>
   */
  private void clearPrimaryText() {
    bitField0_ = (bitField0_ & ~0x00000004);
    primaryText_ = getDefaultInstance().getPrimaryText();
  }
  /**
   * <pre>
   * Primary text of the header, which can be
   * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
   * (2) the contact name, or
   * (3) the formatted number.
   * </pre>
   *
   * <code>optional string primary_text = 3;</code>
   */
  private void setPrimaryTextBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    primaryText_ = value.toStringUtf8();
  }

  public static final int SECONDARY_TEXT_FIELD_NUMBER = 4;
  private java.lang.String secondaryText_;
  /**
   * <pre>
   * Secondary test of the header, which describes the number.
   * Some examples are:
   *   "Mobile • 555-1234",
   *   "Blocked • Mobile • 555-1234", and
   *   "Spam • Mobile • 555-1234".
   * </pre>
   *
   * <code>optional string secondary_text = 4;</code>
   */
  public boolean hasSecondaryText() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <pre>
   * Secondary test of the header, which describes the number.
   * Some examples are:
   *   "Mobile • 555-1234",
   *   "Blocked • Mobile • 555-1234", and
   *   "Spam • Mobile • 555-1234".
   * </pre>
   *
   * <code>optional string secondary_text = 4;</code>
   */
  public java.lang.String getSecondaryText() {
    return secondaryText_;
  }
  /**
   * <pre>
   * Secondary test of the header, which describes the number.
   * Some examples are:
   *   "Mobile • 555-1234",
   *   "Blocked • Mobile • 555-1234", and
   *   "Spam • Mobile • 555-1234".
   * </pre>
   *
   * <code>optional string secondary_text = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSecondaryTextBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(secondaryText_);
  }
  /**
   * <pre>
   * Secondary test of the header, which describes the number.
   * Some examples are:
   *   "Mobile • 555-1234",
   *   "Blocked • Mobile • 555-1234", and
   *   "Spam • Mobile • 555-1234".
   * </pre>
   *
   * <code>optional string secondary_text = 4;</code>
   */
  private void setSecondaryText(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
    secondaryText_ = value;
  }
  /**
   * <pre>
   * Secondary test of the header, which describes the number.
   * Some examples are:
   *   "Mobile • 555-1234",
   *   "Blocked • Mobile • 555-1234", and
   *   "Spam • Mobile • 555-1234".
   * </pre>
   *
   * <code>optional string secondary_text = 4;</code>
   */
  private void clearSecondaryText() {
    bitField0_ = (bitField0_ & ~0x00000008);
    secondaryText_ = getDefaultInstance().getSecondaryText();
  }
  /**
   * <pre>
   * Secondary test of the header, which describes the number.
   * Some examples are:
   *   "Mobile • 555-1234",
   *   "Blocked • Mobile • 555-1234", and
   *   "Spam • Mobile • 555-1234".
   * </pre>
   *
   * <code>optional string secondary_text = 4;</code>
   */
  private void setSecondaryTextBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
    secondaryText_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getNumber());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getPhotoInfo());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeString(3, getPrimaryText());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeString(4, getSecondaryText());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNumber());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPhotoInfo());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getPrimaryText());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getSecondaryText());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Contains information necessary to construct the header for a history item's
   * bottom sheet.
   * A history item is one that is displayed in the call log or the voicemail
   * fragment.
   * Next ID: 5
   * </pre>
   *
   * Protobuf type {@code com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo)
      com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfoOrBuilder {
    // Construct using com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The phone number associated with the item.
     * </pre>
     *
     * <code>optional .com.android.dialer.DialerPhoneNumber number = 1;</code>
     */
    public boolean hasNumber() {
      return instance.hasNumber();
    }
    /**
     * <pre>
     * The phone number associated with the item.
     * </pre>
     *
     * <code>optional .com.android.dialer.DialerPhoneNumber number = 1;</code>
     */
    public com.android.dialer.DialerPhoneNumber getNumber() {
      return instance.getNumber();
    }
    /**
     * <pre>
     * The phone number associated with the item.
     * </pre>
     *
     * <code>optional .com.android.dialer.DialerPhoneNumber number = 1;</code>
     */
    public Builder setNumber(com.android.dialer.DialerPhoneNumber value) {
      copyOnWrite();
      instance.setNumber(value);
      return this;
      }
    /**
     * <pre>
     * The phone number associated with the item.
     * </pre>
     *
     * <code>optional .com.android.dialer.DialerPhoneNumber number = 1;</code>
     */
    public Builder setNumber(
        com.android.dialer.DialerPhoneNumber.Builder builderForValue) {
      copyOnWrite();
      instance.setNumber(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The phone number associated with the item.
     * </pre>
     *
     * <code>optional .com.android.dialer.DialerPhoneNumber number = 1;</code>
     */
    public Builder mergeNumber(com.android.dialer.DialerPhoneNumber value) {
      copyOnWrite();
      instance.mergeNumber(value);
      return this;
    }
    /**
     * <pre>
     * The phone number associated with the item.
     * </pre>
     *
     * <code>optional .com.android.dialer.DialerPhoneNumber number = 1;</code>
     */
    public Builder clearNumber() {  copyOnWrite();
      instance.clearNumber();
      return this;
    }

    /**
     * <pre>
     * Information used to load the contact photo.
     * </pre>
     *
     * <code>optional .com.android.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
     */
    public boolean hasPhotoInfo() {
      return instance.hasPhotoInfo();
    }
    /**
     * <pre>
     * Information used to load the contact photo.
     * </pre>
     *
     * <code>optional .com.android.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
     */
    public com.android.dialer.glidephotomanager.PhotoInfo getPhotoInfo() {
      return instance.getPhotoInfo();
    }
    /**
     * <pre>
     * Information used to load the contact photo.
     * </pre>
     *
     * <code>optional .com.android.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
     */
    public Builder setPhotoInfo(com.android.dialer.glidephotomanager.PhotoInfo value) {
      copyOnWrite();
      instance.setPhotoInfo(value);
      return this;
      }
    /**
     * <pre>
     * Information used to load the contact photo.
     * </pre>
     *
     * <code>optional .com.android.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
     */
    public Builder setPhotoInfo(
        com.android.dialer.glidephotomanager.PhotoInfo.Builder builderForValue) {
      copyOnWrite();
      instance.setPhotoInfo(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Information used to load the contact photo.
     * </pre>
     *
     * <code>optional .com.android.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
     */
    public Builder mergePhotoInfo(com.android.dialer.glidephotomanager.PhotoInfo value) {
      copyOnWrite();
      instance.mergePhotoInfo(value);
      return this;
    }
    /**
     * <pre>
     * Information used to load the contact photo.
     * </pre>
     *
     * <code>optional .com.android.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
     */
    public Builder clearPhotoInfo() {  copyOnWrite();
      instance.clearPhotoInfo();
      return this;
    }

    /**
     * <pre>
     * Primary text of the header, which can be
     * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
     * (2) the contact name, or
     * (3) the formatted number.
     * </pre>
     *
     * <code>optional string primary_text = 3;</code>
     */
    public boolean hasPrimaryText() {
      return instance.hasPrimaryText();
    }
    /**
     * <pre>
     * Primary text of the header, which can be
     * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
     * (2) the contact name, or
     * (3) the formatted number.
     * </pre>
     *
     * <code>optional string primary_text = 3;</code>
     */
    public java.lang.String getPrimaryText() {
      return instance.getPrimaryText();
    }
    /**
     * <pre>
     * Primary text of the header, which can be
     * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
     * (2) the contact name, or
     * (3) the formatted number.
     * </pre>
     *
     * <code>optional string primary_text = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPrimaryTextBytes() {
      return instance.getPrimaryTextBytes();
    }
    /**
     * <pre>
     * Primary text of the header, which can be
     * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
     * (2) the contact name, or
     * (3) the formatted number.
     * </pre>
     *
     * <code>optional string primary_text = 3;</code>
     */
    public Builder setPrimaryText(
        java.lang.String value) {
      copyOnWrite();
      instance.setPrimaryText(value);
      return this;
    }
    /**
     * <pre>
     * Primary text of the header, which can be
     * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
     * (2) the contact name, or
     * (3) the formatted number.
     * </pre>
     *
     * <code>optional string primary_text = 3;</code>
     */
    public Builder clearPrimaryText() {
      copyOnWrite();
      instance.clearPrimaryText();
      return this;
    }
    /**
     * <pre>
     * Primary text of the header, which can be
     * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
     * (2) the contact name, or
     * (3) the formatted number.
     * </pre>
     *
     * <code>optional string primary_text = 3;</code>
     */
    public Builder setPrimaryTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPrimaryTextBytes(value);
      return this;
    }

    /**
     * <pre>
     * Secondary test of the header, which describes the number.
     * Some examples are:
     *   "Mobile • 555-1234",
     *   "Blocked • Mobile • 555-1234", and
     *   "Spam • Mobile • 555-1234".
     * </pre>
     *
     * <code>optional string secondary_text = 4;</code>
     */
    public boolean hasSecondaryText() {
      return instance.hasSecondaryText();
    }
    /**
     * <pre>
     * Secondary test of the header, which describes the number.
     * Some examples are:
     *   "Mobile • 555-1234",
     *   "Blocked • Mobile • 555-1234", and
     *   "Spam • Mobile • 555-1234".
     * </pre>
     *
     * <code>optional string secondary_text = 4;</code>
     */
    public java.lang.String getSecondaryText() {
      return instance.getSecondaryText();
    }
    /**
     * <pre>
     * Secondary test of the header, which describes the number.
     * Some examples are:
     *   "Mobile • 555-1234",
     *   "Blocked • Mobile • 555-1234", and
     *   "Spam • Mobile • 555-1234".
     * </pre>
     *
     * <code>optional string secondary_text = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSecondaryTextBytes() {
      return instance.getSecondaryTextBytes();
    }
    /**
     * <pre>
     * Secondary test of the header, which describes the number.
     * Some examples are:
     *   "Mobile • 555-1234",
     *   "Blocked • Mobile • 555-1234", and
     *   "Spam • Mobile • 555-1234".
     * </pre>
     *
     * <code>optional string secondary_text = 4;</code>
     */
    public Builder setSecondaryText(
        java.lang.String value) {
      copyOnWrite();
      instance.setSecondaryText(value);
      return this;
    }
    /**
     * <pre>
     * Secondary test of the header, which describes the number.
     * Some examples are:
     *   "Mobile • 555-1234",
     *   "Blocked • Mobile • 555-1234", and
     *   "Spam • Mobile • 555-1234".
     * </pre>
     *
     * <code>optional string secondary_text = 4;</code>
     */
    public Builder clearSecondaryText() {
      copyOnWrite();
      instance.clearSecondaryText();
      return this;
    }
    /**
     * <pre>
     * Secondary test of the header, which describes the number.
     * Some examples are:
     *   "Mobile • 555-1234",
     *   "Blocked • Mobile • 555-1234", and
     *   "Spam • Mobile • 555-1234".
     * </pre>
     *
     * <code>optional string secondary_text = 4;</code>
     */
    public Builder setSecondaryTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSecondaryTextBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo other = (com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo) arg1;
        number_ = visitor.visitMessage(number_, other.number_);
        photoInfo_ = visitor.visitMessage(photoInfo_, other.photoInfo_);
        primaryText_ = visitor.visitString(
            hasPrimaryText(), primaryText_,
            other.hasPrimaryText(), other.primaryText_);
        secondaryText_ = visitor.visitString(
            hasSecondaryText(), secondaryText_,
            other.hasSecondaryText(), other.secondaryText_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                com.android.dialer.DialerPhoneNumber.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = number_.toBuilder();
                }
                number_ = input.readMessage(com.android.dialer.DialerPhoneNumber.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(number_);
                  number_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 18: {
                com.android.dialer.glidephotomanager.PhotoInfo.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = photoInfo_.toBuilder();
                }
                photoInfo_ = input.readMessage(com.android.dialer.glidephotomanager.PhotoInfo.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(photoInfo_);
                  photoInfo_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000004;
                primaryText_ = s;
                break;
              }
              case 34: {
                String s = input.readString();
                bitField0_ |= 0x00000008;
                secondaryText_ = s;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo)
  private static final com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new HistoryItemBottomSheetHeaderInfo();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.android.dialer.historyitemactions.HistoryItemBottomSheetHeaderInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<HistoryItemBottomSheetHeaderInfo> PARSER;

  public static com.google.protobuf.Parser<HistoryItemBottomSheetHeaderInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

