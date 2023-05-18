package me.rerere.matrix.thirdparty.org.apache.commons.codec.digest;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.apache.commons.codec.binary.Hex;
import me.rerere.matrix.thirdparty.org.apache.commons.codec.binary.StringUtils;

public class DigestUtils {
  private final MessageDigest messageDigest;
  
  private static final int STREAM_BUFFER_LENGTH = 1024;
  
  private static final long a = o3.a(5158681055952747102L, -6807330960949681757L, MethodHandles.lookup().lookupClass()).a(242573091514488L);
  
  public static byte[] sha3_384(InputStream paramInputStream) throws IOException {
    return digest(getSha3_384Digest(), paramInputStream);
  }
  
  public byte[] digest(File paramFile) throws IOException {
    return updateDigest(this.messageDigest, paramFile).digest();
  }
  
  public static String sha3_256Hex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(sha3_256(paramInputStream));
  }
  
  public static MessageDigest updateDigest(MessageDigest paramMessageDigest, byte[] paramArrayOfbyte) {
    paramMessageDigest.update(paramArrayOfbyte);
    return paramMessageDigest;
  }
  
  public String digestAsHex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(digest(paramArrayOfbyte));
  }
  
  public static String sha384Hex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(sha384(paramInputStream));
  }
  
  public static MessageDigest getSha384Digest() {
    long l = a ^ 0x35F5EBCD1291L;
    return getDigest("SHA-384");
  }
  
  public static MessageDigest updateDigest(MessageDigest paramMessageDigest, ByteBuffer paramByteBuffer) {
    paramMessageDigest.update(paramByteBuffer);
    return paramMessageDigest;
  }
  
  public static MessageDigest getDigest(String paramString) {
    try {
      return MessageDigest.getInstance(paramString);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new IllegalArgumentException(noSuchAlgorithmException);
    } 
  }
  
  public static MessageDigest getSha3_512Digest() {
    long l = a ^ 0x5A3A2AC24721L;
    return getDigest("SHA3-512");
  }
  
  public static byte[] digest(MessageDigest paramMessageDigest, Path paramPath, OpenOption... paramVarArgs) throws IOException {
    return updateDigest(paramMessageDigest, paramPath, paramVarArgs).digest();
  }
  
  public static String md2Hex(String paramString) {
    return Hex.encodeHexString(md2(paramString));
  }
  
  public static MessageDigest getDigest(String paramString, MessageDigest paramMessageDigest) {
    try {
      return MessageDigest.getInstance(paramString);
    } catch (Exception exception) {
      return paramMessageDigest;
    } 
  }
  
  public static MessageDigest getSha512_256Digest() {
    long l = a ^ 0x272C41EB59C9L;
    return getDigest("SHA-512/256");
  }
  
  public static byte[] sha3_512(String paramString) {
    return sha3_512(StringUtils.getBytesUtf8(paramString));
  }
  
  public static String sha512_224Hex(String paramString) {
    return Hex.encodeHexString(sha512_224(paramString));
  }
  
  public static String md5Hex(String paramString) {
    return Hex.encodeHexString(md5(paramString));
  }
  
  public static String sha1Hex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(sha1(paramInputStream));
  }
  
  @Deprecated
  public static byte[] sha(InputStream paramInputStream) throws IOException {
    return sha1(paramInputStream);
  }
  
  public static String sha512Hex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(sha512(paramInputStream));
  }
  
  public static byte[] digest(MessageDigest paramMessageDigest, File paramFile) throws IOException {
    return updateDigest(paramMessageDigest, paramFile).digest();
  }
  
  public static byte[] sha3_384(String paramString) {
    return sha3_384(StringUtils.getBytesUtf8(paramString));
  }
  
  @Deprecated
  public static String shaHex(String paramString) {
    return sha1Hex(paramString);
  }
  
  public static MessageDigest getSha1Digest() {
    long l = a ^ 0x1A58B9D8FF8FL;
    return getDigest("SHA-1");
  }
  
  public static byte[] sha512(InputStream paramInputStream) throws IOException {
    return digest(getSha512Digest(), paramInputStream);
  }
  
  public static byte[] md5(byte[] paramArrayOfbyte) {
    return getMd5Digest().digest(paramArrayOfbyte);
  }
  
  public static String sha512_256Hex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(sha512_256(paramArrayOfbyte));
  }
  
  public static byte[] sha3_384(byte[] paramArrayOfbyte) {
    return getSha3_384Digest().digest(paramArrayOfbyte);
  }
  
  public static String sha1Hex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(sha1(paramArrayOfbyte));
  }
  
  public static byte[] sha3_256(String paramString) {
    return sha3_256(StringUtils.getBytesUtf8(paramString));
  }
  
  public static byte[] digest(MessageDigest paramMessageDigest, RandomAccessFile paramRandomAccessFile) throws IOException {
    return updateDigest(paramMessageDigest, paramRandomAccessFile).digest();
  }
  
  public static byte[] sha3_512(byte[] paramArrayOfbyte) {
    return getSha3_512Digest().digest(paramArrayOfbyte);
  }
  
  public byte[] digest(String paramString) {
    return updateDigest(this.messageDigest, paramString).digest();
  }
  
  public static String md2Hex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(md2(paramInputStream));
  }
  
  public static byte[] md2(byte[] paramArrayOfbyte) {
    return getMd2Digest().digest(paramArrayOfbyte);
  }
  
  public byte[] digest(InputStream paramInputStream) throws IOException {
    return updateDigest(this.messageDigest, paramInputStream).digest();
  }
  
  public MessageDigest getMessageDigest() {
    return this.messageDigest;
  }
  
  public static MessageDigest getSha3_224Digest() {
    long l = a ^ 0x174D6242DB11L;
    return getDigest("SHA3-224");
  }
  
  public static MessageDigest getMd5Digest() {
    long l = a ^ 0x6DECC7E1ECA5L;
    return getDigest("MD5");
  }
  
  public static byte[] digest(MessageDigest paramMessageDigest, ByteBuffer paramByteBuffer) {
    paramMessageDigest.update(paramByteBuffer);
    return paramMessageDigest.digest();
  }
  
  public static String sha3_512Hex(String paramString) {
    return Hex.encodeHexString(sha3_512(paramString));
  }
  
  public String digestAsHex(ByteBuffer paramByteBuffer) {
    return Hex.encodeHexString(digest(paramByteBuffer));
  }
  
  public static String sha384Hex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(sha384(paramArrayOfbyte));
  }
  
  public static String sha512Hex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(sha512(paramArrayOfbyte));
  }
  
  public static String sha512Hex(String paramString) {
    return Hex.encodeHexString(sha512(paramString));
  }
  
  public static String md2Hex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(md2(paramArrayOfbyte));
  }
  
  public static byte[] md5(InputStream paramInputStream) throws IOException {
    return digest(getMd5Digest(), paramInputStream);
  }
  
  public static byte[] sha3_224(String paramString) {
    return sha3_224(StringUtils.getBytesUtf8(paramString));
  }
  
  public static byte[] md2(InputStream paramInputStream) throws IOException {
    return digest(getMd2Digest(), paramInputStream);
  }
  
  public static byte[] sha512_224(String paramString) {
    return sha512_224(StringUtils.getBytesUtf8(paramString));
  }
  
  public static String sha3_384Hex(String paramString) {
    return Hex.encodeHexString(sha3_384(paramString));
  }
  
  public static byte[] sha512_224(InputStream paramInputStream) throws IOException {
    return digest(getSha512_224Digest(), paramInputStream);
  }
  
  public static byte[] sha3_256(byte[] paramArrayOfbyte) {
    return getSha3_256Digest().digest(paramArrayOfbyte);
  }
  
  public static byte[] md2(String paramString) {
    return md2(StringUtils.getBytesUtf8(paramString));
  }
  
  public static String sha3_512Hex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(sha3_512(paramInputStream));
  }
  
  public static String md5Hex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(md5(paramInputStream));
  }
  
  public byte[] digest(Path paramPath, OpenOption... paramVarArgs) throws IOException {
    return updateDigest(this.messageDigest, paramPath, paramVarArgs).digest();
  }
  
  public static MessageDigest getSha256Digest() {
    long l = a ^ 0x7F85F0B894C8L;
    return getDigest("SHA-256");
  }
  
  public static String sha256Hex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(sha256(paramArrayOfbyte));
  }
  
  public static MessageDigest getSha512_224Digest() {
    long l = a ^ 0x1FAF6DA70FCEL;
    return getDigest("SHA-512/224");
  }
  
  public String digestAsHex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(digest(paramInputStream));
  }
  
  public static MessageDigest updateDigest(MessageDigest paramMessageDigest, Path paramPath, OpenOption... paramVarArgs) throws IOException {
    BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(paramPath, paramVarArgs));
    Throwable throwable = null;
    try {
      return updateDigest(paramMessageDigest, bufferedInputStream);
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      try {
        if (bufferedInputStream != null)
          if (throwable != null) {
            try {
              bufferedInputStream.close();
            } catch (Throwable throwable1) {
              throwable.addSuppressed(throwable1);
            } 
          } else {
            bufferedInputStream.close();
          }  
      } catch (Throwable throwable1) {
        throw a(null);
      } 
    } 
  }
  
  public DigestUtils(MessageDigest paramMessageDigest) {
    this.messageDigest = paramMessageDigest;
  }
  
  public static MessageDigest getMd2Digest() {
    long l = a ^ 0x7FDD99BCFA5DL;
    return getDigest("MD2");
  }
  
  public static String sha3_224Hex(String paramString) {
    return Hex.encodeHexString(sha3_224(paramString));
  }
  
  public static byte[] sha256(InputStream paramInputStream) throws IOException {
    return digest(getSha256Digest(), paramInputStream);
  }
  
  public static byte[] sha384(byte[] paramArrayOfbyte) {
    return getSha384Digest().digest(paramArrayOfbyte);
  }
  
  public static byte[] sha3_224(byte[] paramArrayOfbyte) {
    return getSha3_224Digest().digest(paramArrayOfbyte);
  }
  
  public static MessageDigest getSha3_256Digest() {
    long l = a ^ 0x710BB41F629FL;
    return getDigest("SHA3-256");
  }
  
  public static byte[] sha384(InputStream paramInputStream) throws IOException {
    return digest(getSha384Digest(), paramInputStream);
  }
  
  @Deprecated
  public DigestUtils() {
    this.messageDigest = null;
  }
  
  public static byte[] sha256(String paramString) {
    return sha256(StringUtils.getBytesUtf8(paramString));
  }
  
  public static byte[] sha512_224(byte[] paramArrayOfbyte) {
    return getSha512_224Digest().digest(paramArrayOfbyte);
  }
  
  public static byte[] sha512(byte[] paramArrayOfbyte) {
    return getSha512Digest().digest(paramArrayOfbyte);
  }
  
  public static MessageDigest updateDigest(MessageDigest paramMessageDigest, String paramString) {
    paramMessageDigest.update(StringUtils.getBytesUtf8(paramString));
    return paramMessageDigest;
  }
  
  @Deprecated
  public static String shaHex(byte[] paramArrayOfbyte) {
    return sha1Hex(paramArrayOfbyte);
  }
  
  @Deprecated
  public static byte[] sha(byte[] paramArrayOfbyte) {
    return sha1(paramArrayOfbyte);
  }
  
  public byte[] digest(byte[] paramArrayOfbyte) {
    return updateDigest(this.messageDigest, paramArrayOfbyte).digest();
  }
  
  public static byte[] sha512_256(byte[] paramArrayOfbyte) {
    return getSha512_256Digest().digest(paramArrayOfbyte);
  }
  
  public static byte[] sha512(String paramString) {
    return sha512(StringUtils.getBytesUtf8(paramString));
  }
  
  public static String sha512_224Hex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(sha512_224(paramArrayOfbyte));
  }
  
  public static MessageDigest updateDigest(MessageDigest paramMessageDigest, InputStream paramInputStream) throws IOException {
    byte[] arrayOfByte = new byte[1024];
    for (int i = paramInputStream.read(arrayOfByte, 0, 1024); i > -1; i = paramInputStream.read(arrayOfByte, 0, 1024))
      paramMessageDigest.update(arrayOfByte, 0, i); 
    return paramMessageDigest;
  }
  
  public static String sha3_224Hex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(sha3_224(paramArrayOfbyte));
  }
  
  public static byte[] md5(String paramString) {
    return md5(StringUtils.getBytesUtf8(paramString));
  }
  
  public static MessageDigest getSha512Digest() {
    long l = a ^ 0x1A1E075488E4L;
    return getDigest("SHA-512");
  }
  
  public static MessageDigest updateDigest(MessageDigest paramMessageDigest, File paramFile) throws IOException {
    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(paramFile));
    Throwable throwable = null;
    try {
      return updateDigest(paramMessageDigest, bufferedInputStream);
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      try {
        if (bufferedInputStream != null)
          if (throwable != null) {
            try {
              bufferedInputStream.close();
            } catch (Throwable throwable1) {
              throwable.addSuppressed(throwable1);
            } 
          } else {
            bufferedInputStream.close();
          }  
      } catch (Throwable throwable1) {
        throw a(null);
      } 
    } 
  }
  
  public byte[] digest(ByteBuffer paramByteBuffer) {
    return updateDigest(this.messageDigest, paramByteBuffer).digest();
  }
  
  public static MessageDigest updateDigest(MessageDigest paramMessageDigest, RandomAccessFile paramRandomAccessFile) throws IOException {
    return updateDigest(paramMessageDigest, paramRandomAccessFile.getChannel());
  }
  
  public static String sha3_256Hex(String paramString) {
    return Hex.encodeHexString(sha3_256(paramString));
  }
  
  public static boolean isAvailable(String paramString) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (getDigest(paramString, null) != null);
  }
  
  public static String sha256Hex(String paramString) {
    return Hex.encodeHexString(sha256(paramString));
  }
  
  public static String sha1Hex(String paramString) {
    return Hex.encodeHexString(sha1(paramString));
  }
  
  public static byte[] sha1(byte[] paramArrayOfbyte) {
    return getSha1Digest().digest(paramArrayOfbyte);
  }
  
  public static byte[] sha384(String paramString) {
    return sha384(StringUtils.getBytesUtf8(paramString));
  }
  
  public DigestUtils(String paramString) {
    this(getDigest(paramString));
  }
  
  public static String sha3_512Hex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(sha3_512(paramArrayOfbyte));
  }
  
  public static byte[] sha1(InputStream paramInputStream) throws IOException {
    return digest(getSha1Digest(), paramInputStream);
  }
  
  public static String sha512_256Hex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(sha512_256(paramInputStream));
  }
  
  public static String sha3_384Hex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(sha3_384(paramArrayOfbyte));
  }
  
  public static byte[] sha3_256(InputStream paramInputStream) throws IOException {
    return digest(getSha3_256Digest(), paramInputStream);
  }
  
  public static byte[] sha3_224(InputStream paramInputStream) throws IOException {
    return digest(getSha3_224Digest(), paramInputStream);
  }
  
  public static byte[] sha3_512(InputStream paramInputStream) throws IOException {
    return digest(getSha3_512Digest(), paramInputStream);
  }
  
  public static byte[] sha1(String paramString) {
    return sha1(StringUtils.getBytesUtf8(paramString));
  }
  
  @Deprecated
  public static byte[] sha(String paramString) {
    return sha1(paramString);
  }
  
  public String digestAsHex(String paramString) {
    return Hex.encodeHexString(digest(paramString));
  }
  
  public String digestAsHex(Path paramPath, OpenOption... paramVarArgs) throws IOException {
    return Hex.encodeHexString(digest(paramPath, paramVarArgs));
  }
  
  public static byte[] sha256(byte[] paramArrayOfbyte) {
    return getSha256Digest().digest(paramArrayOfbyte);
  }
  
  public static String sha384Hex(String paramString) {
    return Hex.encodeHexString(sha384(paramString));
  }
  
  @Deprecated
  public static String shaHex(InputStream paramInputStream) throws IOException {
    return sha1Hex(paramInputStream);
  }
  
  public static String sha512_224Hex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(sha512_224(paramInputStream));
  }
  
  public static byte[] sha512_256(String paramString) {
    return sha512_256(StringUtils.getBytesUtf8(paramString));
  }
  
  public static String sha3_384Hex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(sha3_384(paramInputStream));
  }
  
  public static MessageDigest getSha3_384Digest() {
    long l = a ^ 0x58DF46F8CB11L;
    return getDigest("SHA3-384");
  }
  
  public static String md5Hex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(md5(paramArrayOfbyte));
  }
  
  @Deprecated
  public static MessageDigest getShaDigest() {
    return getSha1Digest();
  }
  
  public static String sha3_256Hex(byte[] paramArrayOfbyte) {
    return Hex.encodeHexString(sha3_256(paramArrayOfbyte));
  }
  
  public static String sha512_256Hex(String paramString) {
    return Hex.encodeHexString(sha512_256(paramString));
  }
  
  public static byte[] digest(MessageDigest paramMessageDigest, byte[] paramArrayOfbyte) {
    return paramMessageDigest.digest(paramArrayOfbyte);
  }
  
  public static String sha256Hex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(sha256(paramInputStream));
  }
  
  public static byte[] sha512_256(InputStream paramInputStream) throws IOException {
    return digest(getSha512_256Digest(), paramInputStream);
  }
  
  public static String sha3_224Hex(InputStream paramInputStream) throws IOException {
    return Hex.encodeHexString(sha3_224(paramInputStream));
  }
  
  public static byte[] digest(MessageDigest paramMessageDigest, InputStream paramInputStream) throws IOException {
    return updateDigest(paramMessageDigest, paramInputStream).digest();
  }
  
  public String digestAsHex(File paramFile) throws IOException {
    return Hex.encodeHexString(digest(paramFile));
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\apache\commons\codec\digest\DigestUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */