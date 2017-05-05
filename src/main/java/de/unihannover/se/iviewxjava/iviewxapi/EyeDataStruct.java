package de.unihannover.se.iviewxjava.iviewxapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * @struct EyeDataStruct
<br>
 * <br>
 * @brief This struct provides numerical information about eye data.
<br>
 * @ref EyeDataStruct is part of @ref SampleStruct. To update information
<br>
 * in @ref SampleStruct use function @ref iV_GetSample or set the sample
<br>
 * callback with @ref iV_SetSampleCallback.<br>
 * <i>native declaration : C:\Program Files\SMI\iView X SDK\include\iViewXAPI.h:469</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EyeDataStruct extends Structure {
	public double gazeX;
	public double gazeY;
	public double diam;
	public double eyePositionX;
	public double eyePositionY;
	public double eyePositionZ;
	public EyeDataStruct() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("gazeX", "gazeY", "diam", "eyePositionX", "eyePositionY", "eyePositionZ");
	}
	public EyeDataStruct(double gazeX, double gazeY, double diam, double eyePositionX, double eyePositionY, double eyePositionZ) {
		super();
		this.gazeX = gazeX;
		this.gazeY = gazeY;
		this.diam = diam;
		this.eyePositionX = eyePositionX;
		this.eyePositionY = eyePositionY;
		this.eyePositionZ = eyePositionZ;
	}
	public EyeDataStruct(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EyeDataStruct implements Structure.ByReference {
		
	};
	public static class ByValue extends EyeDataStruct implements Structure.ByValue {
		
	};
}