package me.rerere.matrix.thirdparty.com.google.gson.internal;

public class Streams$AppendableWriter$CurrentWrite implements CharSequence {
  public char[] chars;
  
  public char charAt(int paramInt) {
    return this.chars[paramInt];
  }
  
  public int length() {
    return this.chars.length;
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2) {
    return new String(this.chars, paramInt1, paramInt2 - paramInt1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\Streams$AppendableWriter$CurrentWrite.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */