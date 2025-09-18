#include <stdio.h>
#include <stdlib.h>

int getval(void);

int main()
{
	int age,weight,area;
	float iq;
	printf("The program will calculate your IQ:\n");
	printf("Enter your age:");
	age=getval();
	printf("Enter your weight:");
	weight=getval();
	printf("Enter your postr code");
	area=getval();
	iq=(age*weight)/area;
	printf("This computer estimates your IQ to be %f:2.",iq);
	return(0);
}

int getval(void)
{
	float input;
	int x;
// nie łorking - circa 285 strona
//	gets(input);
//	scanf(input);
//	input=getchar;
	x=atoi(input);
	return(x);
}
