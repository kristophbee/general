#include <stdio.h>
#define COUNT 20000000
void dropBomb(void);
void delay(void)
{
	long int x;
	for(x=0;x<COUNT;x++);
}

int deaths;//globalna zmienna

int main()
{
	char x;
	deaths=0;
	for(;;)
	{
		printf("Press Enter to drop the bomb, ~ and Enter to exit.");
		x=getchar();
		fflush(stdin);
		if(x=='~')
		{
			break;
		}
		dropBomb();
		printf("%d people killed\n",deaths);
	}
	return(0);
}

void dropBomb()
{
	int x;
	for(x=20;x>1;x--)
	{
		puts("       *");
		delay();
	}
	puts("     BOOM!");
	deaths+=1500;
}
