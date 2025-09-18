#include <stdio.h>


int main()
{
	char me[20];
	char color[20];

	printf("%15s","Przesunięcie!\n");
	printf("%-15s","Jak cie \"przezywaja\"? ");
/* ogarnij ksywę*/
	scanf("%s",me);
	printf("Weź podrzuć jeszcze jakiś kolor ");
/*
Pionowy koment suko!
*/
	scanf("%s",color);
/*oops*/printf("Siema %s, kolor %s jest kujowy :P\n",me,color);
//koment cpp style
	return(0);
}
