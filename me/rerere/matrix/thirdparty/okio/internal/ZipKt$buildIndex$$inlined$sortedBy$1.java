package me.rerere.matrix.thirdparty.okio.internal;

import java.util.Comparator;
import me.rerere.matrix.thirdparty.kotlin.comparisons.ComparisonsKt;
import me.rerere.matrix.thirdparty.okio.Path;

public final class ZipKt$buildIndex$$inlined$sortedBy$1 implements Comparator {
  public final int compare(Object paramObject1, Object paramObject2) {
    boolean bool1 = false;
    ZipEntry zipEntry = (ZipEntry)paramObject1;
    boolean bool2 = false;
    zipEntry = (ZipEntry)paramObject2;
    Comparable comparable = (Comparable)zipEntry.getCanonicalPath();
    bool2 = false;
    Path path = zipEntry.getCanonicalPath();
    return ComparisonsKt.compareValues(comparable, (Comparable)path);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\ZipKt$buildIndex$$inlined$sortedBy$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */