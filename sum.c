#include<stdio.h>
main()
{
int n,sum=0,m;
printf("\n Enter the number:");
scanf("%d",&n);
while(n>0)
{
m=n%10;
sum=sum+m;
n=n/10;
}
printf("\n The sum of number is:%d",sum);
getch();
}
