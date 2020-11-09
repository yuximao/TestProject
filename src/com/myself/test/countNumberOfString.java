package com.myself.test;

import java.util.HashMap;

public class countNumberOfString {
	
	public static HashMap counter(String s) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] token = s.split(" ");
		for(String t:token) {
			String word = t.toLowerCase();
			if(map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			}else {
				map.put(word,1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world";
		
		HashMap<String, Integer> map = counter(s);
		
	}

}
