// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/android/voicemail/impl/transcribe/grpc/voicemail_transcription.proto

package com.google.internal.communications.voicemailtranscription.v1;

/**
 * <pre>
 * Enum that specifies the user's consent to donate a specific voicemail.
 * </pre>
 *
 * Protobuf enum {@code google.internal.communications.voicemailtranscription.v1.DonationPreference}
 */
public enum DonationPreference
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <pre>
   * Default but invalid value.
   * </pre>
   *
   * <code>USER_PREFERENCE_UNSPECIFIED = 0;</code>
   */
  USER_PREFERENCE_UNSPECIFIED(0),
  /**
   * <pre>
   * User does not consent to donating this voicemail.
   * </pre>
   *
   * <code>DO_NOT_DONATE = 1;</code>
   */
  DO_NOT_DONATE(1),
  /**
   * <pre>
   * User consents to donating this voicemail.
   * </pre>
   *
   * <code>DONATE = 2;</code>
   */
  DONATE(2),
  ;

  /**
   * <pre>
   * Default but invalid value.
   * </pre>
   *
   * <code>USER_PREFERENCE_UNSPECIFIED = 0;</code>
   */
  public static final int USER_PREFERENCE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * User does not consent to donating this voicemail.
   * </pre>
   *
   * <code>DO_NOT_DONATE = 1;</code>
   */
  public static final int DO_NOT_DONATE_VALUE = 1;
  /**
   * <pre>
   * User consents to donating this voicemail.
   * </pre>
   *
   * <code>DONATE = 2;</code>
   */
  public static final int DONATE_VALUE = 2;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DonationPreference valueOf(int value) {
    return forNumber(value);
  }

  public static DonationPreference forNumber(int value) {
    switch (value) {
      case 0: return USER_PREFERENCE_UNSPECIFIED;
      case 1: return DO_NOT_DONATE;
      case 2: return DONATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DonationPreference>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DonationPreference> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DonationPreference>() {
          public DonationPreference findValueByNumber(int number) {
            return DonationPreference.forNumber(number);
          }
        };

  private final int value;

  private DonationPreference(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.internal.communications.voicemailtranscription.v1.DonationPreference)
}
