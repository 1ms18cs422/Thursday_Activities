package com.Question1;

import java.util.Comparator;

public class ColorComparator implements Comparator{
	public int compare(Object o1, Object o2) {
		Color c1=(Color)o1;
		Color c2=(Color) o2;
		return (c1.getColorName()).compareTo(c2.getColorName());
	}
}
