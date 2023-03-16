/*  Difference Between String class and String buffer
 
	String class														StringBuffer class
1. String class is emmutable.										1. StringBuffer class is muttable.
2. String class is not synchronised.								2. StringBuffer class is synchronised.
3. String class uses the concept of SCP( String constant pool).		3. StringBuffer class uses the concept of Heap area/Heap memory.
4. equals() method is overriden to compare the 						4. equals() method is not overriden it compares the address of the two objects.
   data of the String object.
5. String class consumes more memory when, concatination is 		5. It consumes less memory as all the changes or modification is done in the same obj.
   performed repeatedly as every time it will create new object.

*/

/*
 
 1. CharAt(int index)- return type is char
 	this method is used to return the character present at given index.
 
 2. length()- return type is int
 	This method is used to return the no of characters in current String.
 
 3. equals(String str)- return type is boolean
 	This method is used to compare the data present inside the obj.
 	The method is case sensitive
 
 4. equalsIgnoreCase(String str)- return type is boolean.
 	This method is used to compare the data of the obj.
 	This method is case sensitive.
 	
 5. trim()- return type is String
 	This method is used to remove unwanted space from the start and end of the String.
 	
 6. toCharArray()- return type is char[]
 	This method is used to convert the String type into character array.
 	
 7.	toUpperCase()- return type is String
 	This methos is used to convert lowercase String into uppercase String.
 	
 8. split(String str)- return type is String[]
 	this method is used to split the string based on the specified String.
 
 9. replace(char old, char new)- return type String
 	This method is used to replace all the occurance old character with the new characters.
 	
 10. replace(String old, String new)- return type is String
 	This method is used to replace all the occurance old String with the new String--> sequence. 
 	
 11. indexOf(char ch)- return type is int
 	 This method is used to find the index of specified character.
 	 
 12. indexOf(int index, char ch)- return type is int
     This method is used to return the index of specified character after the specified index.
  
 13. lastIndexOf(char ch)- return type is int
 	 This method is used to return index of the specified character from the end of the String.
 	 
 14. lastIndexOf(int index, char ch)- return type is int
 	 This method is used to return the indecx of the specified character from the end after the specified index of the String.
 	 
 15. toString()- return type is String
 	 This method is used to return the String value present in the String object.
 
 16. hashCode() - return type is int
 	 This method is used to return the unique integer value based on the data present in String object.
 	  
 17. toLowerCase()- return type is String
 	 This method is used to convert Uppercase into Lowercase.
 	 
 18. startsWith(String str)- return type is boolean
     This method is used to check if the String is starting with the Specified String.
     
 19. endsWith(String str)- return type is boolean
 	 This method is used to check if the String is ending with the specified String.
 	 
 20. contains(String str)- return type is boolean
 	 This method is used to check if the specified String sequence is present or not.
 	 
 21. compareTo(String str)- return type is int
 	 This methos is used compare the String `object lexographically.
 	 
 22. concat(String str)- return type is String
 	 This methos is used to join (Concatenate) two String.
 	 
 23. subString(int beginIndex)- return type is String
 	 This method is used to return a part of the String starting from the index.
 	 
 24. subString(int begin index, int end index)- return type is String
 	 This method is used to return the part of the String which starts from the given begin index and ends at the given end index. 
 	 The begin index is included but the end index is excluded.
 	 
 25. isEmpty() - return type is boolean
 	 This method is used to check if the String is empty or not.
 	
 26. compareToIgnoreCase()- return type is int 
 	 This method is used to compare Strings lexographycally irrespective of the case.
 	
 27. stripLeading()- return type is String
 	 This method is used to remove all the Spaces from Starting of the String.
 	 
 28. stripTrailing()- return type is String
 	 This methos is used to remove all the Spaces from Ending of the String. 
 
 	 
*/ 	 