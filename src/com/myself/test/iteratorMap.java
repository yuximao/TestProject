package com.myself.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class iteratorMap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Object,Object> map=new HashMap<Object, Object>();
		Iterator<Map.Entry<Object, Object>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Object, Object> entry = itr.next(); 
            System.out.println("Key = " + entry.getKey() +  
                                ", Value = " + entry.getValue());
		}
	}

}
