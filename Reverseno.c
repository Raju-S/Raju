#include<stdio.h>
int main()
{
int n,rev=0,m;
printf("Enter the number : ");
scanf("%d",&n);
while(n>0)
{
m = n%10;
rev = rev*10+m;
n = n/10;
}
printf("The Reversed number is : %d",rev);
return 0;
}
