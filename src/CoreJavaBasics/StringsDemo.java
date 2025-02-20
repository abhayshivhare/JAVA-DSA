package CoreJavaBasics;

import java.util.Arrays;

public class StringsDemo {
	
	public static void main(String[] args) {
		String text = "\tThis text is one tab in.\r\n";
		//heap memory x object have refrence of this value and value will be saved in String constant pool
		String x= new String ("Hello World"); 
		String y= "abhay";
		String myString1 = "Hello World";
		String myString2 = "Hello World";
		System.out.println("text is  :" + text);
		System.out.println("Location of x: "+ x);
		System.out.println("Location of y: "+ y);
		System.out.println("Location of myString1: "+ myString1);
		System.out.println("Location of myString2: "+ myString2);
		
		String string1 = "HelloWorld";

		String substring = string1.substring(0,5);
		System.out.println("substring: "+ substring);
		
		String source   = "123abc";
		String replaced = source.replace('a', '@');
		System.out.println("source: "+ source);
		
		String   sources = "A man drove with a car.";
		String[] occurrences = sources.split("a");
//		System.out.println(Arrays.toString(occurrences));
//		Arrays.stream(occurrences).forEach(System.out::println);
		
		System.out.println(x==myString1); //false  as it compare address of both objects but both points to single value in string pool
		System.out.println(x.equals(myString1));//true as it compares the value
		System.out.println(myString1==myString2);//true as it compare address of both objects
		 
//		The reasoning provided in the code is mostly correct, but let's break it down in more detail to understand how it works, especially when it comes to string comparison in Java.
//
//		Here’s the code you provided:
//
//		```java
//		String x = new String("Hello World");
//		String y = "abhay";
//		String myString1 = "Hello World";
//		String myString2 = "Hello World";
//
//		System.out.println(x == myString1); // false
//		System.out.println(x.equals(myString1)); // true
//		System.out.println(myString1 == myString2); // true
//		```
//
//		### Let's analyze each line and compare the behavior of the `==` operator and the `.equals()` method when applied to `String` objects:
//
//		---
//
//		### **1. `String x = new String("Hello World");`**
//
//		This line creates a **new `String` object** called `x` using the constructor `new String("Hello World")`. The string `"Hello World"` is a string literal, which is automatically stored in the **string pool** (also called the "intern pool"). However, since you used `new String()`, Java creates a **new object** on the heap instead of reusing the interned string. So, even though `"Hello World"` exists in the string pool, `x` refers to a new object that’s not the same as the one in the pool.
//
//		---
//
//		### **2. `String y = "abhay";`**
//
//		This line creates a **string literal** `"abhay"`, which is stored in the **string pool**. If there is already a string `"abhay"` in the pool, this reference will point to the existing object. If not, a new string object will be added to the pool. This is an optimization that ensures that string literals with the same value are not duplicated.
//
//		---
//
//		### **3. `String myString1 = "Hello World";`**
//
//		This line creates a **string literal** `"Hello World"`, which is also stored in the **string pool**. Since `"Hello World"` is already a string literal, this reference points to the interned string in the pool, not a new object.
//
//		---
//
//		### **4. `String myString2 = "Hello World";`**
//
//		This line behaves similarly to `myString1`. It refers to the same string literal `"Hello World"`, which is stored in the **string pool**. In Java, string literals are automatically interned, meaning the same string literal will always point to the same object in memory.
//
//		---
//
//		### **Code Breakdown:**
//
//		#### **First Comparison: `x == myString1`**
//
//		```java
//		System.out.println(x == myString1); // false
//		```
//
//		- The `==` operator checks **reference equality**, meaning it compares whether the two references point to the same object in memory.
//		- **`x`** refers to a new `String` object created using `new String("Hello World")` on the heap.
//		- **`myString1`** refers to the string literal `"Hello World"`, which is stored in the string pool. 
//		- Even though the **values** of `x` and `myString1` are the same (`"Hello World"`), they are **two different objects** in memory. `x` points to a new object on the heap, while `myString1` points to the interned string in the pool.
//		- Hence, the result of `x == myString1` is `false` because the references are pointing to different memory locations.
//
//		#### **Second Comparison: `x.equals(myString1)`**
//
//		```java
//		System.out.println(x.equals(myString1)); // true
//		```
//
//		- The `.equals()` method in the `String` class compares **the contents (values)** of the two strings, not their memory locations.
//		- Even though `x` and `myString1` are **different objects** (in terms of memory), their **values** are the same (`"Hello World"`).
//		- Hence, the result of `x.equals(myString1)` is `true`.
//
//		#### **Third Comparison: `myString1 == myString2`**
//
//		```java
//		System.out.println(myString1 == myString2); // true
//		```
//
//		- In this case, both `myString1` and `myString2` refer to the same string literal `"Hello World"`, which is interned in the **string pool**.
//		- Since string literals are always **interned** (meaning there's only one copy of each string literal in the pool), both `myString1` and `myString2` point to the **same object** in memory.
//		- As a result, the `==` operator compares the references and returns `true` because both references point to the same object in memory.
//
//		---
//
//		### **Summary of Key Points:**
//
//		1. **String Pool (Interning):**
//		   - String literals (like `"Hello World"`) are automatically placed in the **string pool**. If the same literal already exists in the pool, any reference to that literal will point to the **same object**.
//		   - The `==` operator will return `true` for two string literals pointing to the same interned object.
//		   
//		2. **`new String()` Constructor:**
//		   - The `new String("Hello World")` creates a **new object** on the heap, even if `"Hello World"` is already in the string pool. Therefore, it won’t point to the interned object, but to a new object on the heap, resulting in `false` for `==` comparisons.
//
//		3. **`.equals()` Method:**
//		   - The `.equals()` method compares the **content** of the strings, so even if they are different objects in memory, as long as their content is the same, `.equals()` will return `true`.
//
//		---
//
//		### Conclusion:
//
//		- The reasoning in the code is mostly correct. Here's a more refined explanation:
//		  - `x == myString1` is **`false`** because `x` is a new object on the heap, and `myString1` is an interned string in the pool, so they are different references.
//		  - `x.equals(myString1)` is **`true`** because the values are the same (`"Hello World"`).
//		  - `myString1 == myString2` is **`true`** because both refer to the same interned string in the pool.
//

		String s1="abhay";
		String s2= "Shibhare";
		String s3= s1+s2;
		//s1.replace('a', 'ss');
		System.out.println(s3);
		
		
}
}
