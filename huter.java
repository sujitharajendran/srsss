package test;

import java.util.Scanner;

public class huter {

 static String s3="";
int i;
String prefix1(String str1,String str25){
if(str1.length()==str25.length()){
for(i=0;i<str1.length();i++){
	if(str1.charAt(i)==str25.charAt(i)){
		s3=s3+str1.charAt(i);}}}
if(str1.length()>str25.length()){
	for(i=0;i<str1.length()-1;i++){
		if(str1.charAt(i)==str25.charAt(i)){
			s3=s3+str1.charAt(i);}}}
if(str1.length()<str25.length()){
	for(i=0;i<str25.length()-1;i++){
		if(str1.charAt(i)==str25.charAt(i)){
			s3=s3+str1.charAt(i);}}}

return s3;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str1=s.nextLine();
	String str2=s.nextLine();
	huter p=new huter();
	p.prefix1(str1, str2);
	System.out.println(s3);

}

}
	


