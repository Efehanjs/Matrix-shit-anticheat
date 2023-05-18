package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;

public final class pl extends zk {
  private boolean x;
  
  private double z;
  
  private double k;
  
  private int v;
  
  private boolean b;
  
  private double i;
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    long l = paramLong ^ 0x238CF82B76E6L;
    int i = (int)((paramLong ^ 0x3E73AE6D3FF4L) >>> 48L);
    int j = (int)((paramLong ^ 0x3E73AE6D3FF4L) << 16L >>> 48L);
    int k = (int)((paramLong ^ 0x3E73AE6D3FF4L) << 32L >>> 32L);
    paramLong ^ 0x3E73AE6D3FF4L;
    int m = (int)((paramLong ^ 0x4439565DFF55L) >>> 32L);
    int n = (int)((paramLong ^ 0x4439565DFF55L) << 32L >>> 48L);
    int i1 = (int)((paramLong ^ 0x4439565DFF55L) << 48L >>> 48L);
    paramLong ^ 0x4439565DFF55L;
    try {
      if (Intrinsics.areEqual(paramPacketType, PacketType.Play.Client.POSITION_LOOK) || Intrinsics.areEqual(paramPacketType, PacketType.Play.Client.POSITION)) {
        List<Number> list = l.m(paramPacketContainer, l, new IntRange(0, 2));
        double d1 = ((Number)list.get(0)).doubleValue();
        double d2 = ((Number)list.get(1)).doubleValue();
        double d3 = ((Number)list.get(2)).doubleValue();
        boolean bool = l.b(paramPacketContainer, 0);
        try {
          if (b().b().compareTo((E)q.f) >= 0)
            try {
              if (Intrinsics.areEqual(paramPacketType, PacketType.Play.Client.POSITION_LOOK)) {
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                try {
                  if ((d1 == this.k)) {
                    try {
                    
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    try {
                      if ((d2 == this.i)) {
                        try {
                        
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        } 
                        try {
                          if (((d3 == this.z)) && bool == this.x) {
                            io io = new io(d1, d2, d3);
                            in in1 = (in)b().b().b((char)i, in.class, (short)j, k);
                            in in2 = in1;
                            boolean bool1 = false;
                            in2.h();
                            in2.b(io, m, (char)n, (short)i1);
                            (in)b().b().b((char)i, in.class, (short)j, k);
                            hl hl1 = (hl)b().b().b((char)i, hl.class, (short)j, k);
                            hl hl2 = hl1;
                            bool1 = false;
                            hl2.b(1.2D);
                            (hl)b().b().b((char)i, hl.class, (short)j, k);
                          } 
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        } 
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.k = d1;
        this.i = d2;
        this.z = d3;
        this.x = bool;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (b.b() >= 17)
        try {
          if (Intrinsics.areEqual(paramPacketType, PacketType.Play.Client.BLOCK_PLACE))
            try {
              if (this.b) {
                hl hl1 = (hl)b().b().b((char)i, hl.class, (short)j, k);
                hl hl2 = hl1;
                boolean bool = false;
                hl2.b(1.2D);
                (hl)b().b().b((char)i, hl.class, (short)j, k);
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public void b(int paramInt1, int paramInt2) {
    long l1 = paramInt1 << 32L | paramInt2 << 32L >>> 32L;
    int i = (int)((l1 ^ 0x6D1642D7AFCEL) >>> 56L);
    long l2 = (l1 ^ 0x6D1642D7AFCEL) << 8L >>> 8L;
    l1 ^ 0x6D1642D7AFCEL;
    int j = this.v;
    try {
      this.v = j + 1;
      if (j > 23) {
        this.v = 0;
        this.b = b((byte)i, l2).isInsideVehicle();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(@NotNull VehicleExitEvent paramVehicleExitEvent) {
    this.b = false;
  }
  
  public pl(@NotNull yl paramyl) {
    super(paramyl);
    b(yk.y);
    this.x = true;
  }
  
  public void b(@NotNull VehicleEnterEvent paramVehicleEnterEvent, long paramLong) {
    this.b = true;
  }
  
  public boolean b(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    long l = paramLong ^ 0x72C94D9DFF02L;
    if (Intrinsics.areEqual(paramPacketType, PacketType.Play.Server.POSITION)) {
      List<Number> list = l.m(paramPacketContainer, l, new IntRange(0, 2));
      double d1 = ((Number)list.get(0)).doubleValue();
      double d2 = ((Number)list.get(1)).doubleValue();
      double d3 = ((Number)list.get(2)).doubleValue();
      this.k = d1;
      this.i = d2;
      this.z = d3;
    } 
    return false;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\pl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */