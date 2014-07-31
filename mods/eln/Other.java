package mods.eln;

import cpw.mods.fml.common.Loader;

public class Other {
	public static boolean ic2Loaded = false;
	public static boolean ocLoaded = false;

	public static void check(){
		ic2Loaded = Loader.isModLoaded(modIdIc2);
		ocLoaded = Loader.isModLoaded(modIdOc);
	}
	public static double getElnToIc2ConversionRatio() {
		// TODO Auto-generated method stub
		return 1.0 / 3;
	}
	public static final String modIdIc2 = "IC2";
	public static final String modIdOc ="OpenComputers";

	public static double getElnToOcConversionRatio() {
		// TODO Auto-generated method stub
		return getElnToIc2ConversionRatio()/2.5;
	}
}
