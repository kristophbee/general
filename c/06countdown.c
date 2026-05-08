#include <stdio.h>

int main()
{
	int start;
//	long delay;
//	do
//	{
//	printf("Please enter the number to start\n");
//	scanf("%d",&start);
//	}
//	while(start<1 || start>100);
	start=3;//automatyzacja startu
	do
	{
		printf("%d\n",start);
		start--;
//		for(delay=0;delay<10000000;delay++);
		sleep(1);//kimono na 1sec
	}
	while(start>0);
	printf("Offblast!!!\n");
	int a;
	char b;
	printf("Le grid:\n");
	for(a=1;a<10;a++)
	{		
		for(b='A';b<'K';b++)
		{
			printf("%d-%c ",a,b);
		}
		putchar('\n');
	}
	return(0);
}
