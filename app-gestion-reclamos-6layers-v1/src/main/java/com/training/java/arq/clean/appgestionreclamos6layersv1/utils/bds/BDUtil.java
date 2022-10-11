package com.training.java.arq.clean.appgestionreclamos6layersv1.utils.bds;

import java.util.Objects;

public class BDUtil {

	public static String getLike(String str) {
		if(Objects.isNull(str)) {
			str="";
		}
		return "%".concat(str).concat("%");
	}

}
