// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/android/dialer/dialercontact/dialer_contact.proto

package com.android.dialer.dialercontact;

public interface DialerContactOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.android.dialer.dialercontact.DialerContact)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional fixed64 photo_id = 1;</code>
   */
  boolean hasPhotoId();
  /**
   * <code>optional fixed64 photo_id = 1;</code>
   */
  long getPhotoId();

  /**
   * <code>optional string photo_uri = 2;</code>
   */
  boolean hasPhotoUri();
  /**
   * <code>optional string photo_uri = 2;</code>
   */
  java.lang.String getPhotoUri();
  /**
   * <code>optional string photo_uri = 2;</code>
   */
  com.google.protobuf.ByteString
      getPhotoUriBytes();

  /**
   * <code>optional string contact_uri = 3;</code>
   */
  boolean hasContactUri();
  /**
   * <code>optional string contact_uri = 3;</code>
   */
  java.lang.String getContactUri();
  /**
   * <code>optional string contact_uri = 3;</code>
   */
  com.google.protobuf.ByteString
      getContactUriBytes();

  /**
   * <code>optional string name_or_number = 4;</code>
   */
  boolean hasNameOrNumber();
  /**
   * <code>optional string name_or_number = 4;</code>
   */
  java.lang.String getNameOrNumber();
  /**
   * <code>optional string name_or_number = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameOrNumberBytes();

  /**
   * <pre>
   * Contact's phone number. Should not contain post dial digits.
   * </pre>
   *
   * <code>optional string number = 6;</code>
   */
  boolean hasNumber();
  /**
   * <pre>
   * Contact's phone number. Should not contain post dial digits.
   * </pre>
   *
   * <code>optional string number = 6;</code>
   */
  java.lang.String getNumber();
  /**
   * <pre>
   * Contact's phone number. Should not contain post dial digits.
   * </pre>
   *
   * <code>optional string number = 6;</code>
   */
  com.google.protobuf.ByteString
      getNumberBytes();

  /**
   * <code>optional string display_number = 7;</code>
   */
  boolean hasDisplayNumber();
  /**
   * <code>optional string display_number = 7;</code>
   */
  java.lang.String getDisplayNumber();
  /**
   * <code>optional string display_number = 7;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNumberBytes();

  /**
   * <code>optional string number_label = 8;</code>
   */
  boolean hasNumberLabel();
  /**
   * <code>optional string number_label = 8;</code>
   */
  java.lang.String getNumberLabel();
  /**
   * <code>optional string number_label = 8;</code>
   */
  com.google.protobuf.ByteString
      getNumberLabelBytes();

  /**
   * <code>optional int32 contact_type = 9;</code>
   */
  boolean hasContactType();
  /**
   * <code>optional int32 contact_type = 9;</code>
   */
  int getContactType();

  /**
   * <code>optional .com.android.dialer.dialercontact.SimDetails sim_details = 10;</code>
   */
  boolean hasSimDetails();
  /**
   * <code>optional .com.android.dialer.dialercontact.SimDetails sim_details = 10;</code>
   */
  com.android.dialer.dialercontact.SimDetails getSimDetails();

  /**
   * <pre>
   * {&#64;link CallLog.Calls#POST_DIAL_DIGITS}.
   * </pre>
   *
   * <code>optional string post_dial_digits = 11;</code>
   */
  boolean hasPostDialDigits();
  /**
   * <pre>
   * {&#64;link CallLog.Calls#POST_DIAL_DIGITS}.
   * </pre>
   *
   * <code>optional string post_dial_digits = 11;</code>
   */
  java.lang.String getPostDialDigits();
  /**
   * <pre>
   * {&#64;link CallLog.Calls#POST_DIAL_DIGITS}.
   * </pre>
   *
   * <code>optional string post_dial_digits = 11;</code>
   */
  com.google.protobuf.ByteString
      getPostDialDigitsBytes();
}
