package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MessageDeflaterKt {
  private static final int LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION = 4;
  
  @NotNull
  private static final ByteString EMPTY_DEFLATE_BLOCK = ByteString.Companion.decodeHex("000000ffff");
  
  static {
    long l = o3.a(-6298070725655601940L, -1827448412407478903L, MethodHandles.lookup().lookupClass()).a(193890614684836L) ^ 0x695DE9FD95EEL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\MessageDeflaterKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */