package com.oculusvr.capi;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * <i>native declaration : /usr/include/stdint.h</i><br>
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a
 * href="http://rococoa.dev.java.net/">Rococoa</a>, or <a
 * href="http://jna.dev.java.net/">JNA</a>.
 */
public class OvrVector2f extends Structure {
  public float x;
  public float y;

  public OvrVector2f() {
    super();
  }

  @Override
  protected List<?> getFieldOrder() {
    return Arrays.asList("x", "y");
  }

  public OvrVector2f(float x, float y) {
    super();
    this.x = x;
    this.y = y;
  }

  public OvrVector2f(Pointer peer) {
    super(peer);
  }

  public static class ByReference extends OvrVector2f implements Structure.ByReference {

  };

  public static class ByValue extends OvrVector2f implements Structure.ByValue {
    public ByValue() {
      super();
    }

    public ByValue(OvrVector2f v) {
      super(v.x, v.y);
    }
  };
}
