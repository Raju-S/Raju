#include<stdio.h>
#include<string.h>
int main()
{
char str[20];
printf("Enter the string : ");
gets(str);

printf("The reversed string is : %s",strrev(str));
return 0;
}
