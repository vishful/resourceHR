import java.io.*;
import java.util.*;
public class test {
public static void main(String[]args) {
	String name="Vishnu R Pillai";
	byte[] str2=name.getBytes();
	byte[] rev=new byte[str2.length];

	for(int i=0;i<str2.length;i++){
		rev[i]=str2[str2.length-i-1];

	System.out.println(new String(rev));
	}
	}

}

