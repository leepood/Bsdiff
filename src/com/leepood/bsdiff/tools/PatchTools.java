package com.leepood.bsdiff.tools;

public class PatchTools {

	static{
		System.loadLibrary("patch_tools");
	}
	
	public native static int applay_patch(String oldPackage,String newPack,String patch);
	
}
