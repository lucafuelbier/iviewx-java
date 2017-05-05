package de.unihannover.se.iviewxjava.iviewxapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * @struct EyePositionStruct
<br>
 * <br>
 * @brief This value represents the relative position of the eye in the tracking box.
<br>
 * The 0 is defined at the center position. The value +1 defines the upper/right/far
<br>
 * maximum while the value -1 the lower/left/near maximum.
<br>
 * The position rating is related to the tracking monitor and represents how critical
<br>
 * the tracking and the position is, related to the border of the tracking box. The 0
<br>
 * is defined as the best eye position to be tracked while the value +1 defines that
<br>
 * the eye is almost not being tracked due to extreme upper/right/far position. The
<br>
 * value -1 defines that the eye is almost not being tracked due to extreme
<br>
 * lower/left/near position.
<br>
 * If the eye isn't tracked at all the validity flag goes to 0 and all values for the
<br>
 * represented eye will be set to 0.<br>
 * <i>native declaration : C:\Program Files\SMI\iView X SDK\include\iViewXAPI.h:615</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EyePositionStruct extends Structure {
	public int validity;
	public double relativePositionX;
	public double relativePositionY;
	public double relativePositionZ;
	public double positionRatingX;
	public double positionRatingY;
	public double positionRatingZ;
	public EyePositionStruct() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("validity", "relativePositionX", "relativePositionY", "relativePositionZ", "positionRatingX", "positionRatingY", "positionRatingZ");
	}
	public EyePositionStruct(int validity, double relativePositionX, double relativePositionY, double relativePositionZ, double positionRatingX, double positionRatingY, double positionRatingZ) {
		super();
		this.validity = validity;
		this.relativePositionX = relativePositionX;
		this.relativePositionY = relativePositionY;
		this.relativePositionZ = relativePositionZ;
		this.positionRatingX = positionRatingX;
		this.positionRatingY = positionRatingY;
		this.positionRatingZ = positionRatingZ;
	}
	public EyePositionStruct(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EyePositionStruct implements Structure.ByReference {
		
	};
	public static class ByValue extends EyePositionStruct implements Structure.ByValue {
		
	};
}