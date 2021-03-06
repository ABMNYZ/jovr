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
public class TextureHeader extends Structure {
  /**
   * @see ovrRenderAPIType<br>
   *      C type : ovrRenderAPIType
   */
  public int API = OvrLibrary.ovrRenderAPIType.ovrRenderAPI_OpenGL;;
  /** C type : ovrSizei */
  public OvrSizei TextureSize;
  /**
   * Pixel viewport in texture that holds eye image.<br>
   * C type : ovrRecti
   */
  public OvrRecti RenderViewport;
  public int _PAD0_ = 0;
  
  public TextureHeader() {
    super();
  }

  @Override
  protected List<?> getFieldOrder() {
    return Arrays.asList("API", "TextureSize", "RenderViewport", "_PAD0_");
  }

  /**
   * @param API
   *          @see ovrRenderAPIType<br>
   *          C type : ovrRenderAPIType<br>
   * @param TextureSize
   *          C type : ovrSizei<br>
   * @param RenderViewport
   *          Pixel viewport in texture that holds eye image.<br>
   *          C type : ovrRecti
   */
  public TextureHeader(OvrSizei TextureSize, OvrRecti RenderViewport) {
    super();
    this.TextureSize = TextureSize;
    this.RenderViewport = RenderViewport;
  }

  public TextureHeader(Pointer peer) {
    super(peer);
  }

  public static class ByReference extends TextureHeader implements Structure.ByReference {

  };

  public static class ByValue extends TextureHeader implements Structure.ByValue {

  };
}
