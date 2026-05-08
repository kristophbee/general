#include <stdio.h>

int main()
{
	char c;

	printf("Please select:");
	printf("1. Beer\n");
	printf("2. Steak\n");
	printf("3. Burger\n");
	printf("4. Cola\n");
	printf("Your choice is: ");
	c=getchar();
// Słaba pętla else if
//	if(c=='1')
//		printf("Beer\n$1.00\n");
//	else if(c=='2')
//		printf("Steak\n$4.00\n");
//	else if(c=='3')
//		printf("Burger\n$2.00\n");
//	else if(c=='4')
//		printf("Cola\n$1.50\n");
//	else
//		printf("Nothing? Next please!\n");
	switch(c)
	{
	case '1':
		printf("Beer\n$1.00\n");
		break;
	case '2':
		printf("Steak\n$4.00\n");
		break;
	case '3':
		printf("Burger\n$2.00\n");
		break;
	case '4':
		printf("Cola\n$1.50\n");
		break;
	default:
		printf("Nothing? Next please!\n");
	}
	return(0);
}
