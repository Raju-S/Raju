#include<stdio.h>
int main()
{
char str1[20],str2[20],str3[50],str4[50];
printf("Enter the First string : ");
scanf("%s",str1);
printf("Enter the Second string : ");
scanf("%s",str2);
int i=0;
while(str1[i]!='\0')
{
str3[i]=str1[i]+10;
i++;
}
str3[i]=0;
int j=0;
while(str2[j]!='\0')
{
str4[j]=str2[j]-10;
j++;
}
str4[i]=0;
printf("Encoded string : %s %s",str3,str4);
return 0;
}
