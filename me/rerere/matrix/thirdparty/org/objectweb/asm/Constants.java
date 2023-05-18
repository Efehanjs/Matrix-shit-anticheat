package me.rerere.matrix.thirdparty.org.objectweb.asm;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;

public final class Constants {
  public static final int ILOAD_3 = 29;
  
  public static final int ISTORE_3 = 62;
  
  public static final int LDC2_W = 20;
  
  public static final String SOURCE_FILE = "SourceFile";
  
  public static final String RUNTIME_INVISIBLE_TYPE_ANNOTATIONS = "RuntimeInvisibleTypeAnnotations";
  
  public static final int ASM_GOTO = 216;
  
  public static final String RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS = "RuntimeVisibleParameterAnnotations";
  
  public static final String ANNOTATION_DEFAULT = "AnnotationDefault";
  
  public static final int ALOAD_1 = 43;
  
  public static final int ASTORE_3 = 78;
  
  public static final int ASM_IFLT = 204;
  
  public static final int DLOAD_1 = 39;
  
  public static final String METHOD_PARAMETERS = "MethodParameters";
  
  public static final int ASM_IF_ICMPGE = 211;
  
  public static final int LSTORE_1 = 64;
  
  public static final int LDC_W = 19;
  
  public static final String LOCAL_VARIABLE_TYPE_TABLE = "LocalVariableTypeTable";
  
  public static final String SIGNATURE = "Signature";
  
  public static final int WIDE = 196;
  
  public static final int ASTORE_2 = 77;
  
  public static final int LLOAD_2 = 32;
  
  public static final int LLOAD_1 = 31;
  
  public static final int ISTORE_1 = 60;
  
  public static final int GOTO_W = 200;
  
  public static final int LSTORE_2 = 65;
  
  public static final int ASM_IFGE = 205;
  
  public static final String SOURCE_DEBUG_EXTENSION = "SourceDebugExtension";
  
  public static final int ASM_IFEQ = 202;
  
  public static final int FLOAD_1 = 35;
  
  public static final int F_INSERT = 256;
  
  public static final int ASM_IF_ICMPEQ = 208;
  
  public static final int ASM_IFNULL_OPCODE_DELTA = 20;
  
  public static final int ISTORE_0 = 59;
  
  public static final int LLOAD_0 = 30;
  
  public static final String MODULE = "Module";
  
  public static final int DLOAD_0 = 38;
  
  public static final String RUNTIME_VISIBLE_TYPE_ANNOTATIONS = "RuntimeVisibleTypeAnnotations";
  
  public static final int LLOAD_3 = 33;
  
  public static final String DEPRECATED = "Deprecated";
  
  public static final String RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS = "RuntimeInvisibleParameterAnnotations";
  
  public static final String SYNTHETIC = "Synthetic";
  
  public static final int DLOAD_2 = 40;
  
  public static final String RUNTIME_INVISIBLE_ANNOTATIONS = "RuntimeInvisibleAnnotations";
  
  public static final String RUNTIME_VISIBLE_ANNOTATIONS = "RuntimeVisibleAnnotations";
  
  public static final String CODE = "Code";
  
  public static final int ASM_IFNULL = 218;
  
  public static final int ASM_IFNONNULL = 219;
  
  public static final int ISTORE_2 = 61;
  
  public static final int FLOAD_0 = 34;
  
  public static final int ASM_JSR = 217;
  
  public static final int FSTORE_3 = 70;
  
  public static final int FSTORE_0 = 67;
  
  public static final String ENCLOSING_METHOD = "EnclosingMethod";
  
  public static final String EXCEPTIONS = "Exceptions";
  
  public static final int ASTORE_0 = 75;
  
  public static final int FLOAD_2 = 36;
  
  public static final int ALOAD_0 = 42;
  
  public static final int DSTORE_2 = 73;
  
  public static final String RECORD = "Record";
  
  public static final String NEST_MEMBERS = "NestMembers";
  
  public static final int FSTORE_1 = 68;
  
  public static final int ASM_IF_ACMPEQ = 214;
  
  public static final int ALOAD_3 = 45;
  
  public static final String LINE_NUMBER_TABLE = "LineNumberTable";
  
  public static final String MODULE_MAIN_CLASS = "ModuleMainClass";
  
  public static final int ALOAD_2 = 44;
  
  public static final int ACC_CONSTRUCTOR = 262144;
  
  public static final int DLOAD_3 = 41;
  
  public static final int ILOAD_1 = 27;
  
  public static final String MODULE_PACKAGES = "ModulePackages";
  
  public static final int JSR_W = 201;
  
  public static final String NEST_HOST = "NestHost";
  
  public static final int FLOAD_3 = 37;
  
  public static final String PERMITTED_SUBCLASSES = "PermittedSubclasses";
  
  public static final int ASM_OPCODE_DELTA = 49;
  
  public static final int FSTORE_2 = 69;
  
  public static final int ASM_IF_ICMPLT = 210;
  
  public static final String INNER_CLASSES = "InnerClasses";
  
  public static final int DSTORE_1 = 72;
  
  public static final String STACK_MAP_TABLE = "StackMapTable";
  
  public static final int LSTORE_3 = 66;
  
  public static final int ASM_IFNE = 203;
  
  public static final int DSTORE_0 = 71;
  
  public static final int WIDE_JUMP_OPCODE_DELTA = 33;
  
  public static final int ASM_IFGT = 206;
  
  public static final String CONSTANT_VALUE = "ConstantValue";
  
  public static final int ILOAD_2 = 28;
  
  public static final String LOCAL_VARIABLE_TABLE = "LocalVariableTable";
  
  public static final String BOOTSTRAP_METHODS = "BootstrapMethods";
  
  public static final int ILOAD_0 = 26;
  
  public static final int LSTORE_0 = 63;
  
  public static final int ASM_IFLE = 207;
  
  public static final int DSTORE_3 = 74;
  
  public static final int ASM_GOTO_W = 220;
  
  public static final int ASM_IF_ICMPLE = 213;
  
  public static final int ASM_IF_ACMPNE = 215;
  
  public static final int ASM_IF_ICMPGT = 212;
  
  public static final int ASTORE_1 = 76;
  
  public static final int ASM_IF_ICMPNE = 209;
  
  private static final long a = o3.a(9116586149194471137L, 1117750491005889869L, null).a(86465163084057L);
  
  public static boolean isWhitelisted(String paramString) {
    long l = a ^ 0x16560A435684L;
    try {
      if (!paramString.startsWith("me/rerere/matrix/thirdparty/org/objectweb/asm/"))
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    String str = "(Annotation|Class|Field|Method|Module|RecordComponent|Signature)";
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (paramString.contains("Test$") || Pattern.matches("me/rerere/matrix/thirdparty/org/objectweb/asm/util/Trace" + str + "Visitor(\\$.*)?", paramString) || Pattern.matches("me/rerere/matrix/thirdparty/org/objectweb/asm/util/Check" + str + "Adapter(\\$.*)?", paramString));
  }
  
  public static void checkAsmExperimental(Object paramObject) {
    long l = a ^ 0x44854E6F74FL;
    Class<?> clazz = paramObject.getClass();
    String str = clazz.getName().replace('.', '/');
    try {
      if (!isWhitelisted(str))
        checkIsPreview(clazz.getClassLoader().getResourceAsStream(str + ".class")); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public static void checkIsPreview(InputStream paramInputStream) {
    int i;
    long l = a ^ 0x3EDFA2C5E8E9L;
    try {
      if (paramInputStream == null)
        throw new IllegalStateException("Bytecode not available, can't check class version"); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      DataInputStream dataInputStream = new DataInputStream(paramInputStream);
      try {
        dataInputStream.readInt();
        i = dataInputStream.readUnsignedShort();
        dataInputStream.close();
      } catch (Throwable throwable) {
        try {
          dataInputStream.close();
        } catch (Throwable throwable1) {}
        throw throwable;
      } 
    } catch (IOException iOException) {
      throw new IllegalStateException("I/O error, can't check class version", iOException);
    } 
    try {
      if (i != 65535)
        throw new IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview"); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\Constants.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */