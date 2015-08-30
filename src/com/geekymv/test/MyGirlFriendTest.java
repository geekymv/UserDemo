package com.geekymv.test;

import java.util.Random;

import com.geekymv.pojo.MyGirlFriend;

public class MyGirlFriendTest {
	
	public static final String[] datas = 
			new String[]{"a", "b", "c", "d", "e", "f", "g",
						"h", "i", "j", "k", "l", "m", "n",	
						"o", "p", "q", "r", "s", "t",
						"u", "v", "w", "x", "y", "z",
						"A", "B", "C", "D", "E", "F", "G",
						"H", "I", "J", "K", "L", "M", "N",	
						"O", "P", "Q", "R", "S", "T",
						"U", "V", "W", "X", "Y", "Z"
						};
		
	// 姓名在26个字母中随机抽取，姓名长度3-5之间
	
	// 年龄10-20之间
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		for(int i = 0; i < 1000; i++) {
			/* 
			 * random.nextInt(n)
			 * the next pseudorandom, uniformly distributed int value 
			 * between 0 (inclusive) and n (exclusive) from this random number  
			 * generator's sequence
			 * 返回值是[0, n) 即包含0不包含n
			 */
			int age = random.nextInt(11) + 10;	// [10, 20] 包含10和20
			
		
			String name = "";
			// 随机生成名字长度
			int nameLength = random.nextInt(3) + 3; // [0, 2] + 3 = [3, 5]
			for(int k = 0; k < nameLength; k++) {	// 随机取nameLength个字母
				// 生成一个随机数在[0-51]
				int r = random.nextInt(52);	// [0, 52) = [0, 51]
				name += datas[r];	// 拼接姓名
			}
			
			MyGirlFriend gf = new MyGirlFriend();
			gf.setAge(age);
			gf.setName(name);
			
			System.out.println(gf);
		}
		
	}

}
