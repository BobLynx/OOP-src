package wc2;
//this is a second duplicate of kutmariki

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		str.add(stdin.next());
		boolean key = true;
		if(str.get(0).length()>2) {
			for(int i=1;stdin.hasNext();i++) {
				str.add(stdin.next());
				if(str.get(i).length()>2) {
					if(str.get(i-1).charAt(str.get(i-1).length()-1) == str.get(i).charAt(0)) {
						continue;
					}
					else {
						System.out.println(str.get(i));
						key = false;
						break;
					}
				}
				else {
					System.out.println(str.get(i));
					key = false;
					break;
				}
			}
		}
		else {
			System.out.println(str.get(0));
			key = false;
		}
		if(key) {
			System.out.println("xxx");
		}
	}

}