package com.myself.test;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCheck {

	public static void check(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
		 
	    char[] chars = str.toCharArray();
	    
	    for(char c:chars) {
	    	if(map.containsKey(c)) {
	    		map.put(c,map.get(c)+1);
	    	}else {
	            map.put(c, 1);
	        }
	    }
	    Set<Character> keys =map.keySet();
	    for(char key:keys) {
	    	if(map.get(key)>1) {
	    		System.out.println(key+" has duplicate");
	    	}
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="helloworld";
		check(s);
	}

}
