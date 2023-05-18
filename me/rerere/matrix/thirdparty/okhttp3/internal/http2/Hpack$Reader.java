package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Hpack$Reader {
  private int nextHeaderIndex;
  
  @JvmField
  public int headerCount;
  
  @NotNull
  private final List headerList;
  
  private final int headerTableSizeSetting;
  
  @JvmField
  public int dynamicTableByteCount;
  
  @JvmField
  @NotNull
  public Header[] dynamicTable;
  
  private int maxDynamicTableByteCount;
  
  @NotNull
  private final BufferedSource source;
  
  private static final long a = o3.a(-6627171367994657981L, -8929487315067222893L, MethodHandles.lookup().lookupClass()).a(244430790666022L);
  
  public final int readInt(int paramInt1, int paramInt2) throws IOException {
    int i = paramInt1 & paramInt2;
    try {
      if (i < paramInt2)
        return i; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int j = paramInt2;
    byte b = 0;
    while (true) {
      int k = readByte();
      if ((k & 0x80) != 0) {
        j += (k & 0x7F) << b;
        b += 7;
        continue;
      } 
      j += k << b;
      return j;
    } 
  }
  
  public final void readHeaders() throws IOException {
    long l = a ^ 0xB73E539E403L;
    while (true) {
      if (!this.source.exhausted()) {
        int i = Util.and(this.source.readByte(), 255);
        try {
          if (i == 128)
            throw new IOException("index == 0"); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        if ((i & 0x80) == 128) {
          int j = readInt(i, 127);
          readIndexedHeader(j - 1);
          continue;
        } 
        try {
          if (i == 64) {
            readLiteralHeaderWithIncrementalIndexingNewName();
            continue;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        if ((i & 0x40) == 64) {
          int j = readInt(i, 63);
          readLiteralHeaderWithIncrementalIndexingIndexedName(j - 1);
          continue;
        } 
        try {
          if ((i & 0x20) == 32) {
            try {
              this.maxDynamicTableByteCount = readInt(i, 31);
              if (this.maxDynamicTableByteCount >= 0)
                try {
                  if (this.maxDynamicTableByteCount <= this.headerTableSizeSetting) {
                    adjustDynamicTableByteCount();
                    continue;
                  } 
                  throw new IOException(Intrinsics.stringPlus("Invalid dynamic table size update ", Integer.valueOf(this.maxDynamicTableByteCount)));
                } catch (IOException iOException) {
                  throw a(null);
                }  
            } catch (IOException iOException) {
              throw a(null);
            } 
            throw new IOException(Intrinsics.stringPlus("Invalid dynamic table size update ", Integer.valueOf(this.maxDynamicTableByteCount)));
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (i != 16) {
            try {
              if (i != 0) {
                int j = readInt(i, 15);
                readLiteralHeaderWithoutIndexingIndexedName(j - 1);
                continue;
              } 
              readLiteralHeaderWithoutIndexingNewName();
            } catch (IOException iOException) {
              throw a(null);
            } 
            continue;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } else {
        break;
      } 
      readLiteralHeaderWithoutIndexingNewName();
    } 
  }
  
  @JvmOverloads
  public Hpack$Reader(@NotNull Source paramSource, int paramInt1, int paramInt2) {
    this.headerTableSizeSetting = paramInt1;
    this.maxDynamicTableByteCount = paramInt2;
    this.headerList = new ArrayList();
    this.source = Okio.buffer(paramSource);
    this.dynamicTable = new Header[8];
    this.nextHeaderIndex = this.dynamicTable.length - 1;
  }
  
  @NotNull
  public final List getAndResetHeaderList() {
    List list = CollectionsKt.toList(this.headerList);
    this.headerList.clear();
    return list;
  }
  
  @NotNull
  public final ByteString readByteString() throws IOException {
    int i = readByte();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool = ((i & 0x80) == 128) ? true : false;
    long l = readInt(i, 127);
    Buffer buffer = new Buffer();
    Huffman.INSTANCE.decode(this.source, l, (BufferedSink)buffer);
    return bool ? buffer.readByteString() : this.source.readByteString(l);
  }
  
  public final int maxDynamicTableByteCount() {
    return this.maxDynamicTableByteCount;
  }
  
  @JvmOverloads
  public Hpack$Reader(@NotNull Source paramSource, int paramInt) {
    this(paramSource, paramInt, 0, 4, null);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Hpack$Reader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */