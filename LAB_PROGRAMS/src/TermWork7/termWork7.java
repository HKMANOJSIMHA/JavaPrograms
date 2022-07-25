package TermWork7;
import java.util.Scanner;
import java.io.*;
class StringNotPalindrome extends Exception{
String str1;
public StringNotPalindrome(String str1){
this.str1=str1;
}
public static boolean ispalin(String str1){
int i=0,j=str1.length()-1;
while(i<j){
if(str1.charAt(i)!=str1.charAt(j))
return false;
i++;
j--;
}
return true;
}
void caseChange(String str1){
System.out.println(str1.toUpperCase());
}
void stringlength(String str1){
int length=str1.length();
System.out.println("The length of string "+str1+" is:"+length);
}
}
public class termWork7{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String str1;
str1=args[0];
StringNotPalindrome p=new StringNotPalindrome(str1);
try{
if(p.ispalin(str1)){
System.out.println("Given string is palindrome");
}
else
{
throw new StringNotPalindrome(str1);
}
}catch(StringNotPalindrome snp){
System.out.println(snp);
}
p.caseChange(str1);
p.stringlength(str1);
}
}