package de.unihannover.se.iviewxjava.iviewxapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * @struct SpeedModeStruct
<br>
 * <br>
 * @brief This struct provides information about the speed modes used and supported by the connected iView eye tracking server.
<br>
 * To update information in @ref SpeedModeStruct use function @ref iV_GetSpeedModes.<br>
 * <i>native declaration : C:\Program Files\SMI\iView X SDK\include\iViewXAPI.h:380</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class SpeedModeStruct extends Structure {
	public int version;
	public int speedMode;
	public int numberOfSpeedModes;
	/** C type : int[16] */
	public int[] speedModes = new int[16];
	public SpeedModeStruct() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("version", "speedMode", "numberOfSpeedModes", "speedModes");
	}
	/** @param speedModes C type : int[16] */
	public SpeedModeStruct(int version, int speedMode, int numberOfSpeedModes, int speedModes[]) {
		super();
		this.version = version;
		this.speedMode = speedMode;
		this.numberOfSpeedModes = numberOfSpeedModes;
		if ((speedModes.length != this.speedModes.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.speedModes = speedModes;
	}
	public SpeedModeStruct(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends SpeedModeStruct implements Structure.ByReference {
		
	};
	public static class ByValue extends SpeedModeStruct implements Structure.ByValue {
		
	};
}
