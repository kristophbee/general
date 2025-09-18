#include <stdio.h>
#include <stdlib.h>

int main()
{
	char num[2];
	int number;

	printf("Wybierz liczbę od 0 do 9:");
	scanf("%s",num);
	number=atoi(num);

	if(number<5)
	{
		printf("Mniej niż 5!\n");
	}
	else if(number==5)
	{
		printf("Wpisałeś 5!\n");
	}
	else
	{
		printf("Ta liczba to więcej niż 5!\n");
	}

	printf("Tiruriru paczka żwiru!\n");
	return(0);
}
