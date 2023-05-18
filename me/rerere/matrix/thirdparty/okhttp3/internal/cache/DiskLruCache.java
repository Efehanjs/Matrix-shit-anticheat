package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.io.CloseableKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Regex;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskQueue;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskRunner;
import me.rerere.matrix.thirdparty.okhttp3.internal.io.FileSystem;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class DiskLruCache implements Closeable, Flushable {
  @JvmField
  @NotNull
  public static final String VERSION_1;
  
  @JvmField
  @NotNull
  public static final Regex LEGAL_KEY_PATTERN;
  
  @Nullable
  private BufferedSink journalWriter;
  
  @NotNull
  private final File journalFileTmp;
  
  private boolean hasJournalErrors;
  
  @NotNull
  private final FileSystem fileSystem;
  
  private int redundantOpCount;
  
  @NotNull
  private final File directory;
  
  private final int valueCount;
  
  @NotNull
  private final File journalFileBackup;
  
  @JvmField
  @NotNull
  public static final String CLEAN;
  
  private boolean closed;
  
  @JvmField
  @NotNull
  public static final String JOURNAL_FILE_TEMP;
  
  @NotNull
  private final TaskQueue cleanupQueue;
  
  @JvmField
  @NotNull
  public static final String REMOVE;
  
  private boolean civilizedFileSystem;
  
  private boolean initialized;
  
  @JvmField
  public static final long ANY_SEQUENCE_NUMBER;
  
  @NotNull
  private final File journalFile;
  
  @JvmField
  @NotNull
  public static final String JOURNAL_FILE;
  
  private boolean mostRecentTrimFailed;
  
  private long nextSequenceNumber;
  
  @JvmField
  @NotNull
  public static final String DIRTY;
  
  @JvmField
  @NotNull
  public static final String READ;
  
  @NotNull
  public static final DiskLruCache$Companion Companion;
  
  @NotNull
  private final DiskLruCache$cleanupTask$1 cleanupTask;
  
  @JvmField
  @NotNull
  public static final String JOURNAL_FILE_BACKUP;
  
  @NotNull
  private final LinkedHashMap lruEntries;
  
  private long size;
  
  private boolean mostRecentRebuildFailed;
  
  private long maxSize;
  
  private final int appVersion;
  
  @JvmField
  @NotNull
  public static final String MAGIC;
  
  private static final long a = o3.a(-5726926379776831548L, 4324272016422707799L, MethodHandles.lookup().lookupClass()).a(167013796981488L);
  
  public final synchronized void evictAll() throws IOException {
    long l = a ^ 0x335335E826BDL;
    initialize();
    Collection collection1 = this.lruEntries.values();
    Intrinsics.checkNotNullExpressionValue(collection1, "lruEntries.values");
    collection1 = collection1;
    int i = 0;
    Collection collection2 = collection1;
    try {
      if (collection2.toArray((Object[])new DiskLruCache$Entry[0]) == null) {
        collection2.toArray((Object[])new DiskLruCache$Entry[0]);
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    DiskLruCache$Entry[] arrayOfDiskLruCache$Entry = (DiskLruCache$Entry[])collection2.toArray((Object[])new DiskLruCache$Entry[0]);
    byte b = 0;
    i = arrayOfDiskLruCache$Entry.length;
    while (b < i) {
      DiskLruCache$Entry diskLruCache$Entry = arrayOfDiskLruCache$Entry[b];
      b++;
      Intrinsics.checkNotNullExpressionValue(diskLruCache$Entry, "entry");
      removeEntry$okhttp(diskLruCache$Entry);
    } 
    this.mostRecentTrimFailed = false;
  }
  
  public final synchronized void rebuildJournal$okhttp() throws IOException {
    try {
      if (this.journalWriter == null) {
      
      } else {
        this.journalWriter.close();
      } 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    Closeable closeable = (Closeable)Okio.buffer(this.fileSystem.sink(this.journalFileTmp));
    Throwable throwable = null;
    try {
      BufferedSink bufferedSink = (BufferedSink)closeable;
      boolean bool = false;
      bufferedSink.writeUtf8(MAGIC).writeByte(10);
      bufferedSink.writeUtf8(VERSION_1).writeByte(10);
      bufferedSink.writeDecimalLong(this.appVersion).writeByte(10);
      bufferedSink.writeDecimalLong(getValueCount$okhttp()).writeByte(10);
      bufferedSink.writeByte(10);
      for (DiskLruCache$Entry diskLruCache$Entry : getLruEntries$okhttp().values()) {
        try {
          if (diskLruCache$Entry.getCurrentEditor$okhttp() != null) {
            bufferedSink.writeUtf8(DIRTY).writeByte(32);
            bufferedSink.writeUtf8(diskLruCache$Entry.getKey$okhttp());
            bufferedSink.writeByte(10);
            continue;
          } 
        } catch (Throwable throwable1) {
          throw a(null);
        } 
        bufferedSink.writeUtf8(CLEAN).writeByte(32);
        bufferedSink.writeUtf8(diskLruCache$Entry.getKey$okhttp());
        diskLruCache$Entry.writeLengths$okhttp(bufferedSink);
        bufferedSink.writeByte(10);
      } 
      Unit unit = Unit.INSTANCE;
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(closeable, throwable);
    } 
    try {
      if (this.fileSystem.exists(this.journalFile))
        this.fileSystem.rename(this.journalFile, this.journalFileBackup); 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    this.fileSystem.rename(this.journalFileTmp, this.journalFile);
    this.fileSystem.delete(this.journalFileBackup);
    this.journalWriter = newJournalWriter();
    this.hasJournalErrors = false;
    this.mostRecentRebuildFailed = false;
  }
  
  public synchronized void flush() throws IOException {
    try {
      if (!this.initialized)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    checkNotClosed();
    trimToSize();
    Intrinsics.checkNotNull(this.journalWriter);
    this.journalWriter.flush();
  }
  
  static {
    long l = a ^ 0x420BF721C784L;
    Companion = new DiskLruCache$Companion(null);
    JOURNAL_FILE = "journal";
    JOURNAL_FILE_TEMP = "journal.tmp";
    JOURNAL_FILE_BACKUP = "journal.bkp";
    MAGIC = "libcore.io.DiskLruCache";
    VERSION_1 = "1";
    ANY_SEQUENCE_NUMBER = -1L;
    LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
    CLEAN = "CLEAN";
    DIRTY = "DIRTY";
    REMOVE = "REMOVE";
    READ = "READ";
  }
  
  public synchronized void close() throws IOException {
    long l = a ^ 0xE4735E7A812L;
    try {
      if (this.initialized)
        try {
          if (!this.closed) {
            Collection collection1 = this.lruEntries.values();
            Intrinsics.checkNotNullExpressionValue(collection1, "lruEntries.values");
            collection1 = collection1;
            int i = 0;
            Collection collection2 = collection1;
            try {
              if (collection2.toArray((Object[])new DiskLruCache$Entry[0]) == null) {
                collection2.toArray((Object[])new DiskLruCache$Entry[0]);
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
            DiskLruCache$Entry[] arrayOfDiskLruCache$Entry = (DiskLruCache$Entry[])collection2.toArray((Object[])new DiskLruCache$Entry[0]);
            byte b = 0;
            i = arrayOfDiskLruCache$Entry.length;
            while (b < i) {
              DiskLruCache$Entry diskLruCache$Entry = arrayOfDiskLruCache$Entry[b];
              b++;
              if (diskLruCache$Entry.getCurrentEditor$okhttp() != null) {
                try {
                  if (diskLruCache$Entry.getCurrentEditor$okhttp() == null) {
                    diskLruCache$Entry.getCurrentEditor$okhttp();
                    continue;
                  } 
                } catch (IOException iOException) {
                  throw a(null);
                } 
                diskLruCache$Entry.getCurrentEditor$okhttp().detach$okhttp();
              } 
            } 
            trimToSize();
            Intrinsics.checkNotNull(this.journalWriter);
            this.journalWriter.close();
            this.journalWriter = null;
            this.closed = true;
            return;
          } 
          this.closed = true;
          return;
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.closed = true;
  }
  
  public final synchronized void setMaxSize(long paramLong) {
    try {
      this.maxSize = paramLong;
      if (this.initialized)
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public final FileSystem getFileSystem$okhttp() {
    return this.fileSystem;
  }
  
  public final synchronized boolean isClosed() {
    return this.closed;
  }
  
  public final boolean getClosed$okhttp() {
    return this.closed;
  }
  
  @JvmOverloads
  @Nullable
  public final synchronized DiskLruCache$Editor edit(@NotNull String paramString, long paramLong) throws IOException {
    long l = a ^ 0x3C5635E469E7L;
    Intrinsics.checkNotNullParameter(paramString, "key");
    initialize();
    checkNotClosed();
    validateKey(paramString);
    DiskLruCache$Entry diskLruCache$Entry = (DiskLruCache$Entry)this.lruEntries.get(paramString);
    try {
      if (paramLong != ANY_SEQUENCE_NUMBER)
        try {
          if (diskLruCache$Entry != null) {
            try {
              if (diskLruCache$Entry.getSequenceNumber$okhttp() != paramLong)
                return null; 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } else {
            return null;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (((diskLruCache$Entry == null) ? null : diskLruCache$Entry.getCurrentEditor$okhttp()) != null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (diskLruCache$Entry != null)
        try {
          if (diskLruCache$Entry.getLockingSourceCount$okhttp() != 0)
            return null; 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!this.mostRecentTrimFailed)
        try {
          if (!this.mostRecentRebuildFailed) {
            Intrinsics.checkNotNull(this.journalWriter);
            BufferedSink bufferedSink = this.journalWriter;
            try {
              bufferedSink.writeUtf8(DIRTY).writeByte(32).writeUtf8(paramString).writeByte(10);
              bufferedSink.flush();
              if (this.hasJournalErrors)
                return null; 
            } catch (IOException iOException) {
              throw a(null);
            } 
            if (diskLruCache$Entry == null) {
              diskLruCache$Entry = new DiskLruCache$Entry(this, paramString);
              this.lruEntries.put(paramString, diskLruCache$Entry);
            } 
            DiskLruCache$Editor diskLruCache$Editor = new DiskLruCache$Editor(this, diskLruCache$Entry);
            diskLruCache$Entry.setCurrentEditor$okhttp(diskLruCache$Editor);
            return diskLruCache$Editor;
          } 
          TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
          return null;
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    return null;
  }
  
  @Nullable
  public final synchronized DiskLruCache$Snapshot get(@NotNull String paramString) throws IOException {
    DiskLruCache$Entry diskLruCache$Entry;
    DiskLruCache$Snapshot diskLruCache$Snapshot;
    long l = a ^ 0x3B4B752CBBC8L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "key");
      initialize();
      checkNotClosed();
      validateKey(paramString);
      if ((DiskLruCache$Entry)this.lruEntries.get(paramString) == null) {
        (DiskLruCache$Entry)this.lruEntries.get(paramString);
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (diskLruCache$Entry.snapshot$okhttp() == null) {
        diskLruCache$Entry.snapshot$okhttp();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = this.redundantOpCount;
    try {
      this.redundantOpCount = i + 1;
      Intrinsics.checkNotNull(this.journalWriter);
      this.journalWriter.writeUtf8(READ).writeByte(32).writeUtf8(paramString).writeByte(10);
      if (journalRebuildRequired())
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return diskLruCache$Snapshot;
  }
  
  public final void delete() throws IOException {
    close();
    this.fileSystem.deleteContents(this.directory);
  }
  
  @NotNull
  public final LinkedHashMap getLruEntries$okhttp() {
    return this.lruEntries;
  }
  
  @NotNull
  public final File getDirectory() {
    return this.directory;
  }
  
  public final void setClosed$okhttp(boolean paramBoolean) {
    this.closed = paramBoolean;
  }
  
  @NotNull
  public final synchronized Iterator snapshots() throws IOException {
    initialize();
    return new DiskLruCache$snapshots$1(this);
  }
  
  public DiskLruCache(@NotNull FileSystem paramFileSystem, @NotNull File paramFile, int paramInt1, int paramInt2, long paramLong, @NotNull TaskRunner paramTaskRunner) {
    this.fileSystem = paramFileSystem;
    this.directory = paramFile;
    this.appVersion = paramInt1;
    this.valueCount = paramInt2;
    this.maxSize = paramLong;
    this.lruEntries = new LinkedHashMap<>(0, 0.75F, true);
    this.cleanupQueue = paramTaskRunner.newQueue();
    String str = Intrinsics.stringPlus(Util.okHttpName, " Cache");
    this.cleanupTask = new DiskLruCache$cleanupTask$1(this, str);
    if (!((paramLong > 0L) ? 1 : 0)) {
      boolean bool = false;
      String str1 = "maxSize <= 0";
      throw new IllegalArgumentException(str1.toString());
    } 
    try {
      if (!((this.valueCount > 0) ? 1 : 0)) {
        boolean bool = false;
        String str1 = "valueCount <= 0";
        throw new IllegalArgumentException(str1.toString());
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.journalFile = new File(this.directory, JOURNAL_FILE);
    this.journalFileTmp = new File(this.directory, JOURNAL_FILE_TEMP);
    this.journalFileBackup = new File(this.directory, JOURNAL_FILE_BACKUP);
  }
  
  public final synchronized void completeEdit$okhttp(@NotNull DiskLruCache$Editor paramDiskLruCache$Editor, boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/cache/DiskLruCache.a : J
    //   3: ldc2_w 136989865916703
    //   6: lxor
    //   7: lstore_3
    //   8: aload_1
    //   9: ldc_w 'editor'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: invokevirtual getEntry$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/cache/DiskLruCache$Entry;
    //   19: astore #5
    //   21: aload #5
    //   23: invokevirtual getCurrentEditor$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/cache/DiskLruCache$Editor;
    //   26: aload_1
    //   27: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   30: ifne -> 51
    //   33: ldc_w 'Check failed.'
    //   36: astore #7
    //   38: new java/lang/IllegalStateException
    //   41: dup
    //   42: aload #7
    //   44: invokevirtual toString : ()Ljava/lang/String;
    //   47: invokespecial <init> : (Ljava/lang/String;)V
    //   50: athrow
    //   51: iload_2
    //   52: ifeq -> 166
    //   55: aload #5
    //   57: invokevirtual getReadable$okhttp : ()Z
    //   60: ifne -> 166
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   69: athrow
    //   70: iconst_0
    //   71: istore #6
    //   73: aload_0
    //   74: getfield valueCount : I
    //   77: istore #7
    //   79: iload #6
    //   81: iload #7
    //   83: if_icmpge -> 166
    //   86: iload #6
    //   88: istore #8
    //   90: iinc #6, 1
    //   93: aload_1
    //   94: invokevirtual getWritten$okhttp : ()[Z
    //   97: dup
    //   98: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   101: iload #8
    //   103: baload
    //   104: ifne -> 134
    //   107: aload_1
    //   108: invokevirtual abort : ()V
    //   111: new java/lang/IllegalStateException
    //   114: dup
    //   115: ldc_w 'Newly created entry didn't create value for index '
    //   118: iload #8
    //   120: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   123: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   126: invokespecial <init> : (Ljava/lang/String;)V
    //   129: athrow
    //   130: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   133: athrow
    //   134: aload_0
    //   135: getfield fileSystem : Lme/rerere/matrix/thirdparty/okhttp3/internal/io/FileSystem;
    //   138: aload #5
    //   140: invokevirtual getDirtyFiles$okhttp : ()Ljava/util/List;
    //   143: iload #8
    //   145: invokeinterface get : (I)Ljava/lang/Object;
    //   150: checkcast java/io/File
    //   153: invokeinterface exists : (Ljava/io/File;)Z
    //   158: ifne -> 79
    //   161: aload_1
    //   162: invokevirtual abort : ()V
    //   165: return
    //   166: iconst_0
    //   167: istore #6
    //   169: aload_0
    //   170: getfield valueCount : I
    //   173: istore #7
    //   175: iload #6
    //   177: iload #7
    //   179: if_icmpge -> 340
    //   182: iload #6
    //   184: istore #8
    //   186: iinc #6, 1
    //   189: aload #5
    //   191: invokevirtual getDirtyFiles$okhttp : ()Ljava/util/List;
    //   194: iload #8
    //   196: invokeinterface get : (I)Ljava/lang/Object;
    //   201: checkcast java/io/File
    //   204: astore #9
    //   206: iload_2
    //   207: ifeq -> 326
    //   210: aload #5
    //   212: invokevirtual getZombie$okhttp : ()Z
    //   215: ifne -> 326
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   224: athrow
    //   225: aload_0
    //   226: getfield fileSystem : Lme/rerere/matrix/thirdparty/okhttp3/internal/io/FileSystem;
    //   229: aload #9
    //   231: invokeinterface exists : (Ljava/io/File;)Z
    //   236: ifeq -> 175
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   245: athrow
    //   246: aload #5
    //   248: invokevirtual getCleanFiles$okhttp : ()Ljava/util/List;
    //   251: iload #8
    //   253: invokeinterface get : (I)Ljava/lang/Object;
    //   258: checkcast java/io/File
    //   261: astore #10
    //   263: aload_0
    //   264: getfield fileSystem : Lme/rerere/matrix/thirdparty/okhttp3/internal/io/FileSystem;
    //   267: aload #9
    //   269: aload #10
    //   271: invokeinterface rename : (Ljava/io/File;Ljava/io/File;)V
    //   276: aload #5
    //   278: invokevirtual getLengths$okhttp : ()[J
    //   281: iload #8
    //   283: laload
    //   284: lstore #11
    //   286: aload_0
    //   287: getfield fileSystem : Lme/rerere/matrix/thirdparty/okhttp3/internal/io/FileSystem;
    //   290: aload #10
    //   292: invokeinterface size : (Ljava/io/File;)J
    //   297: lstore #13
    //   299: aload #5
    //   301: invokevirtual getLengths$okhttp : ()[J
    //   304: iload #8
    //   306: lload #13
    //   308: lastore
    //   309: aload_0
    //   310: aload_0
    //   311: getfield size : J
    //   314: lload #11
    //   316: lsub
    //   317: lload #13
    //   319: ladd
    //   320: putfield size : J
    //   323: goto -> 175
    //   326: aload_0
    //   327: getfield fileSystem : Lme/rerere/matrix/thirdparty/okhttp3/internal/io/FileSystem;
    //   330: aload #9
    //   332: invokeinterface delete : (Ljava/io/File;)V
    //   337: goto -> 175
    //   340: aload #5
    //   342: aconst_null
    //   343: invokevirtual setCurrentEditor$okhttp : (Lme/rerere/matrix/thirdparty/okhttp3/internal/cache/DiskLruCache$Editor;)V
    //   346: aload #5
    //   348: invokevirtual getZombie$okhttp : ()Z
    //   351: ifeq -> 366
    //   354: aload_0
    //   355: aload #5
    //   357: invokevirtual removeEntry$okhttp : (Lme/rerere/matrix/thirdparty/okhttp3/internal/cache/DiskLruCache$Entry;)Z
    //   360: pop
    //   361: return
    //   362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   365: athrow
    //   366: aload_0
    //   367: getfield redundantOpCount : I
    //   370: istore #6
    //   372: aload_0
    //   373: iload #6
    //   375: iconst_1
    //   376: iadd
    //   377: putfield redundantOpCount : I
    //   380: aload_0
    //   381: getfield journalWriter : Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   384: dup
    //   385: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   388: astore #6
    //   390: aload #6
    //   392: astore #7
    //   394: iconst_0
    //   395: istore #8
    //   397: aload #5
    //   399: invokevirtual getReadable$okhttp : ()Z
    //   402: ifne -> 416
    //   405: iload_2
    //   406: ifeq -> 505
    //   409: goto -> 416
    //   412: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   415: athrow
    //   416: aload #5
    //   418: iconst_1
    //   419: invokevirtual setReadable$okhttp : (Z)V
    //   422: aload #7
    //   424: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/cache/DiskLruCache.CLEAN : Ljava/lang/String;
    //   427: invokeinterface writeUtf8 : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   432: bipush #32
    //   434: invokeinterface writeByte : (I)Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   439: pop
    //   440: aload #7
    //   442: aload #5
    //   444: invokevirtual getKey$okhttp : ()Ljava/lang/String;
    //   447: invokeinterface writeUtf8 : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   452: pop
    //   453: aload #5
    //   455: aload #7
    //   457: invokevirtual writeLengths$okhttp : (Lme/rerere/matrix/thirdparty/okio/BufferedSink;)V
    //   460: aload #7
    //   462: bipush #10
    //   464: invokeinterface writeByte : (I)Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   469: pop
    //   470: iload_2
    //   471: ifeq -> 559
    //   474: goto -> 481
    //   477: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   480: athrow
    //   481: aload #5
    //   483: aload_0
    //   484: getfield nextSequenceNumber : J
    //   487: lstore #9
    //   489: aload_0
    //   490: lload #9
    //   492: lconst_1
    //   493: ladd
    //   494: putfield nextSequenceNumber : J
    //   497: lload #9
    //   499: invokevirtual setSequenceNumber$okhttp : (J)V
    //   502: goto -> 559
    //   505: aload_0
    //   506: invokevirtual getLruEntries$okhttp : ()Ljava/util/LinkedHashMap;
    //   509: aload #5
    //   511: invokevirtual getKey$okhttp : ()Ljava/lang/String;
    //   514: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   517: pop
    //   518: aload #7
    //   520: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/cache/DiskLruCache.REMOVE : Ljava/lang/String;
    //   523: invokeinterface writeUtf8 : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   528: bipush #32
    //   530: invokeinterface writeByte : (I)Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   535: pop
    //   536: aload #7
    //   538: aload #5
    //   540: invokevirtual getKey$okhttp : ()Ljava/lang/String;
    //   543: invokeinterface writeUtf8 : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   548: pop
    //   549: aload #7
    //   551: bipush #10
    //   553: invokeinterface writeByte : (I)Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   558: pop
    //   559: aload #7
    //   561: invokeinterface flush : ()V
    //   566: nop
    //   567: nop
    //   568: aload_0
    //   569: getfield size : J
    //   572: aload_0
    //   573: getfield maxSize : J
    //   576: lcmp
    //   577: ifgt -> 594
    //   580: aload_0
    //   581: invokespecial journalRebuildRequired : ()Z
    //   584: ifeq -> 618
    //   587: goto -> 594
    //   590: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   593: athrow
    //   594: aload_0
    //   595: getfield cleanupQueue : Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskQueue;
    //   598: aload_0
    //   599: getfield cleanupTask : Lme/rerere/matrix/thirdparty/okhttp3/internal/cache/DiskLruCache$cleanupTask$1;
    //   602: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/concurrent/Task
    //   605: lconst_0
    //   606: iconst_2
    //   607: aconst_null
    //   608: invokestatic schedule$default : (Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskQueue;Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/Task;JILjava/lang/Object;)V
    //   611: goto -> 618
    //   614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   617: athrow
    //   618: return
    // Exception table:
    //   from	to	target	type
    //   51	63	66	java/io/IOException
    //   90	130	130	java/io/IOException
    //   206	218	221	java/io/IOException
    //   210	239	242	java/io/IOException
    //   340	362	362	java/io/IOException
    //   397	409	412	java/io/IOException
    //   405	474	477	java/io/IOException
    //   559	587	590	java/io/IOException
    //   580	611	614	java/io/IOException
  }
  
  public final synchronized boolean remove(@NotNull String paramString) throws IOException {
    DiskLruCache$Entry diskLruCache$Entry;
    long l = a ^ 0x2505B6B51B77L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "key");
      initialize();
      checkNotClosed();
      validateKey(paramString);
      if ((DiskLruCache$Entry)this.lruEntries.get(paramString) == null) {
        (DiskLruCache$Entry)this.lruEntries.get(paramString);
        return false;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool = removeEntry$okhttp(diskLruCache$Entry);
    try {
      if (bool)
        try {
          if (this.size <= this.maxSize)
            this.mostRecentTrimFailed = false; 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return bool;
  }
  
  public final boolean removeEntry$okhttp(@NotNull DiskLruCache$Entry paramDiskLruCache$Entry) throws IOException {
    long l = a ^ 0x1699E338568FL;
    try {
      Intrinsics.checkNotNullParameter(paramDiskLruCache$Entry, "entry");
      if (!this.civilizedFileSystem) {
        try {
          if (paramDiskLruCache$Entry.getLockingSourceCount$okhttp() > 0)
            try {
              if (this.journalWriter == null) {
              
              } else {
                BufferedSink bufferedSink = this.journalWriter;
                boolean bool = false;
                bufferedSink.writeUtf8(DIRTY);
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(paramDiskLruCache$Entry.getKey$okhttp());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
              } 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (paramDiskLruCache$Entry.getLockingSourceCount$okhttp() <= 0) {
            try {
              if (paramDiskLruCache$Entry.getCurrentEditor$okhttp() != null) {
                paramDiskLruCache$Entry.setZombie$okhttp(true);
                return true;
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } else {
            paramDiskLruCache$Entry.setZombie$okhttp(true);
            return true;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramDiskLruCache$Entry.getCurrentEditor$okhttp() == null) {
        paramDiskLruCache$Entry.getCurrentEditor$okhttp();
      } else {
        paramDiskLruCache$Entry.getCurrentEditor$okhttp().detach$okhttp();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = 0;
    int j = this.valueCount;
    while (i < j) {
      int k = i;
      i++;
      this.fileSystem.delete(paramDiskLruCache$Entry.getCleanFiles$okhttp().get(k));
      this.size -= paramDiskLruCache$Entry.getLengths$okhttp()[k];
      paramDiskLruCache$Entry.getLengths$okhttp()[k] = 0L;
    } 
    i = this.redundantOpCount;
    try {
      this.redundantOpCount = i + 1;
      if (this.journalWriter == null) {
      
      } else {
        BufferedSink bufferedSink;
        boolean bool = false;
        bufferedSink.writeUtf8(REMOVE);
        bufferedSink.writeByte(32);
        bufferedSink.writeUtf8(paramDiskLruCache$Entry.getKey$okhttp());
        bufferedSink.writeByte(10);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.lruEntries.remove(paramDiskLruCache$Entry.getKey$okhttp());
      if (journalRebuildRequired())
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return true;
  }
  
  public final int getValueCount$okhttp() {
    return this.valueCount;
  }
  
  public final synchronized void initialize() throws IOException {
    long l = a ^ 0xA4652E1B60L;
    DiskLruCache diskLruCache = this;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (!Thread.holdsLock(diskLruCache))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.initialized)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.fileSystem.exists(this.journalFileBackup))
        try {
          if (this.fileSystem.exists(this.journalFile)) {
            this.fileSystem.delete(this.journalFileBackup);
          } else {
            this.fileSystem.rename(this.journalFileBackup, this.journalFile);
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
    if (this.fileSystem.exists(this.journalFile))
      try {
        readJournal();
        processJournal();
        this.initialized = true;
        return;
      } catch (IOException null) {
        Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + null.getMessage() + ", removing", 5, null);
        try {
          delete();
        } finally {
          this.closed = false;
        } 
      }  
    rebuildJournal$okhttp();
    this.initialized = true;
  }
  
  public final synchronized long size() throws IOException {
    initialize();
    return this.size;
  }
  
  public final synchronized long getMaxSize() {
    return this.maxSize;
  }
  
  public final void trimToSize() throws IOException {
    while (this.size > this.maxSize) {
      if (!removeOldestEntry())
        return; 
    } 
    this.mostRecentTrimFailed = false;
  }
  
  @JvmOverloads
  @Nullable
  public final DiskLruCache$Editor edit(@NotNull String paramString) throws IOException {
    long l = a ^ 0x17997D04F370L;
    Intrinsics.checkNotNullParameter(paramString, "key");
    return edit$default(this, paramString, 0L, 2, null);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\DiskLruCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */