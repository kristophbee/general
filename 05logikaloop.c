#include <stdio.h>

int main()
{
	int i;
	// okolice 200ej strony
	for(i=0;i<5;i=i+1)
		printf("Napierdalamy! %i\n",i);
	unsigned char a;
	for(a=32;a<128;a=a+1)
		printf("%3d = '%c\t",a,a);
	printf("\n");
	for(i=5;i>0;i--)
		printf("Napierdalamy--! %i\n",i);
	for(i=5;i<=1000;i=i+5)
	{
		printf("%d\t",i);
	}
	printf("\n");
	printf("Akcja\tSkrót\nx=x+5\tx+=5\nx=x+y\tx+=y\nx=x-5\tx-=5\nx=x*y\tx*=y\nx=x/5\tx/=5\nx=x/y\tx/=y\n");
	while(a!='D')
		{
		printf("What does she want? The ");
//		scanf("%s",a);
		a=getchar();
		if(a!='D')
		{
			printf("\nKnope. Try again. ");
		}
		else
		{
			printf("\nCorrect!\n");
		}
		}
/*	int ctdwn;
	printf("Odlicznko? Podaj cyferkę:");
	scanf("%c",ctdwn);
	printf("\nAchtung! Ruszamy!\n");
	do
	{
		printf("%d\t",ctdwn);
		i--;
	}
	while (ctdwn>0);
	printf("\nOffblast!\n");*/
	return(0);
}
