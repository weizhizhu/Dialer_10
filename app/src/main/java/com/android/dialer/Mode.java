// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/android/incallui/callconfiguration/call_configuration.proto

package com.android.dialer;

/**
 * Protobuf enum {@code com.android.dialer.Mode}
 */
public enum Mode
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>MODE_UNSPECIFIED = 0;</code>
   */
  MODE_UNSPECIFIED(0),
  /**
   * <code>BUBBLE = 1;</code>
   */
  BUBBLE(1),
  ;

  /**
   * <code>MODE_UNSPECIFIED = 0;</code>
   */
  public static final int MODE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>BUBBLE = 1;</code>
   */
  public static final int BUBBLE_VALUE = 1;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Mode valueOf(int value) {
    return forNumber(value);
  }

  public static Mode forNumber(int value) {
    switch (value) {
      case 0: return MODE_UNSPECIFIED;
      case 1: return BUBBLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Mode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Mode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Mode>() {
          public Mode findValueByNumber(int number) {
            return Mode.forNumber(number);
          }
        };

  private final int value;

  private Mode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.android.dialer.Mode)
}

