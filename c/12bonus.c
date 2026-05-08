#include <stdio.h>

float bonus(char x);

int main()
{
	char name[20];
	char level;
	float b;

	printf("Enter employee name:");
	scanf("%s",name);
	printf("Enter bonus level (0,1 or 2");
	fflush(stdin);
	level=getchar();
	b=bonus(level);
	b*=100;
	printf("the bonus for %s will be $%.2f.\n",name,b);
	return(0);
}

float bonus(char x)
{
	if(x=='0') return(0.33);
	if(x=='1') return(1.5);
	return(0.33);
}
