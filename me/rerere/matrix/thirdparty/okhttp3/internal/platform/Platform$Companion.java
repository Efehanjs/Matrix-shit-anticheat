package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import java.lang.invoke.MethodHandles;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Protocol;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.AndroidLog;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Platform$Companion {
  private static final long a = o3.a(-8713923599660352597L, -3261475045306511809L, MethodHandles.lookup().lookupClass()).a(149001304134113L);
  
  @NotNull
  public final List alpnProtocolNames(@NotNull List<Protocol> paramList) {
    long l = a ^ 0x1C1851E1E5DEL;
    Intrinsics.checkNotNullParameter(paramList, "protocols");
    List<Protocol> list1 = paramList;
    boolean bool1 = false;
    List<Protocol> list2 = list1;
    ArrayList<Protocol> arrayList = new ArrayList();
    boolean bool2 = false;
    for (Protocol protocol1 : list2) {
      Protocol protocol2 = protocol1;
      boolean bool = false;
      try {
        if ((protocol2 != Protocol.HTTP_1_0))
          arrayList.add(protocol1); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    list1 = arrayList;
    bool1 = false;
    list2 = list1;
    arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list1, 10));
    bool2 = false;
    for (Protocol protocol1 : list2) {
      Protocol protocol2 = protocol1;
      ArrayList<Protocol> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(protocol2.toString());
    } 
    return arrayList;
  }
  
  @NotNull
  public final Platform get() {
    return Platform.access$getPlatform$cp();
  }
  
  public final void resetForTests(@NotNull Platform paramPlatform) {
    long l = a ^ 0x70C890C0A377L;
    Intrinsics.checkNotNullParameter(paramPlatform, "platform");
    Platform.access$setPlatform$cp(paramPlatform);
  }
  
  @NotNull
  public final byte[] concatLengthPrefixed(@NotNull List paramList) {
    long l = a ^ 0xA9F4E5BB5C5L;
    Intrinsics.checkNotNullParameter(paramList, "protocols");
    Buffer buffer = new Buffer();
    for (String str : alpnProtocolNames(paramList)) {
      buffer.writeByte(str.length());
      buffer.writeUtf8(str);
    } 
    return buffer.readByteArray();
  }
  
  public final boolean isAndroid() {
    long l = a ^ 0x1130DE3024E3L;
    return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\Platform$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */