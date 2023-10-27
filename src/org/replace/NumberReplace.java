package org.replace;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberReplace {
	public static void main(String[] args) {
		//Input = 200,600,100,700,900

		List<Integer> inputList = new ArrayList<>();
		inputList.add(200);
		inputList.add(600);
		inputList.add(100);
		inputList.add(700);
		inputList.add(900);
		System.out.println("ORIGINAL LIST : "+inputList);
		int numberToReplace =100;
		int replacementNumber=150;
		for (int i = 0; i < inputList.size(); i++) {
			if (inputList.get(i)==numberToReplace) {
				inputList.set(i,replacementNumber);
			}
			
		}
		System.out.println("MODIFIED LIST : "+inputList);
	}

}
