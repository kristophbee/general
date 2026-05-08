#include <stdio.h>

int main()
{
	char c;
	int done;
	float total=0;
	printf("Please make your selections:\n");
	printf("1. Beverage.\n");
	printf("2. Candy.\n");
	printf("3. Hot Dog.\n");
	printf("4. Popcorn.\n");
	printf("=  Done.\n");
// jedziemy!
	done=0;
	while(!done)
	{
		c=getchar();
		switch(c)
		{
		case '1':
			printf("Beverage\t$8.00\n");
			total+=8;
			break;
		case '2':
			printf("Candy\t$5.50\n");
			total+=5.5;
			break;
		case '3':
			printf("Hot Dog\t$10.00\n");
			total+=10;
			break;
		case '4':
			printf("Popcorn\t$7.50\n");
			total+=7.5;
			break;
		case'=':
			printf("= Total of $%.2f\n",total);
			printf("Wyskakuj z kasy!\n");
			done=1;
			break;
		default:
			printf("Oops. Try again\n");
		}
	}
	return(0);
}
