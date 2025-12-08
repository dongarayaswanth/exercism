1. Java is a statically-typed language, which means that the type of a variable is known at compile-time.
2. Java is an object-oriented language and requires all functions to be defined in a class.
3. A function within a class is referred to as a method.
4. All parameters must be explicitly typed, there is no type inference for parameters. Similarly, the return type must also be made explicit. Values are returned from methods using the return keyword. To allow a method to be called by other classes, the public access modifier must be added.
5. Java supports three boolean operators:
- !(NOT)
- &&(AND)
- ||(OR)
6. The two most common numeric types in Java are int and double. An int is a 32-bit integer and a double is a 64-bit floating-point number.
7. Java has two types of numeric conversions:
 - Implicit conversions: no data will be lost and no additional syntax is required.
- Explicit conversions: data could be lost and additional syntax in the form of a cast is required.
8. Once a string has been constructed, its value can never change. Any methods that appear to modify a string will actually return a new string.
9. standard syntax for initializing an array:
  ```
 type[] variableName = new type[size];

 // Declare array with explicit size (size is 2)
 int[] twoInts = new int[2];
  // Two equivalent ways to declare and initialize an array (size is 3)
  //example
 int[] threeIntsV1 = new int[] { 4, 9, 7 };
  //example
 int[] threeIntsV2 = { 4, 9, 7 };
 ```
10. Java also provides a helpful utility class java.util.Arrays that has lots of useful array-related methods (eg. Arrays.equals).
11. for-each loop to print array elements:
```
char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
for(char vowel: vowels) {
    // Output the vowel
    System.out.print(vowel);
}
```
