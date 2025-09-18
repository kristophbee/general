#include <stdio.h>
#include <stdlib.h>

#define TRZY 3
#define SKARPETA "Lewa"

int main()
{
	int methus,you;
	char years[8];
	float iloraz,youflot,meflot;
	const float pi = 3.14;
//jedziemy malina!
	printf("Ile masz wiosen? ");
	scanf("%s",years);
//	gets(years);
//gets jest stary?
	you=atoi(years);
//konwersja do flołta
	youflot=you;
	printf("Ile lat miał cwany pajac? ");
	scanf("%s",years);
//	gets(years);
//gets jest stary :(
	methus=atoi(years);
//konwersja do flołta
	meflot=methus;
//Fryzury, make-up i pazury :D
	printf("Masz %d lat.\n",you);
	printf("Cwany pajac ma %d lat.\n",methus);
//definiujemy wartości w locie :D
        int result;
//Drobna wklejka z warunkami
	if (you<methus)
	{
		result=methus-you;
		printf("Jesteś młodszy od cwanego pajaca o %d lat\n",result);
	}
	else if (you>methus)
	{
		result=you-methus;
		printf("Jesteś starszy o %d lat od cwanego pajaca\n",result);
	}
	else
	{
		printf("No patrz! Masz tyle lat co cwany pajac O_O\n");
	}
//część z nudną matmą
	result=you-methus;
	printf("Różnisz się %d lat od cwanego pajaca.\n",result);
	result=you+methus;
	printf("W sumie macie %d lat.\n",result);
	result=you*methus;
	printf("Iloczyn z cwanym pajacem to %d.\n",result);
	iloraz=youflot/meflot;
	printf("Iloraz to %.2f.\n",iloraz);
	printf("A przy okazji %d to trzy.\n",TRZY);
	puts(SKARPETA);
//puts nie lubi się z floatem
	printf("%.2f\n",pi);
//formatka gdzie .2 to dwa miejsca po ocinku
//Trochę bardziej hardkorowej matmy :)
	float lightyear=5.878E12;
	float jupiter=483400000;
	float distance;
	distance=jupiter/lightyear;
	printf("Jupiter is %f(lub %e w zapisie naukowym) light years from the sun.\n",distance,distance);
	float tescik=123.45678901234;
	printf("Liczba poniżej powinna wynosić 123.45678####\n");
	printf("%.10f\n",tescik);
//float zaokrągla wynniki do gory!!!
	printf("Pierdolona precyzja na flołcie to 8 cyfr :P\n");
	double drugitescik=123.45678901234567890;
	printf(" a co na to double? Spróbujmy 123.45678901234567890\n %.20f\n",drugitescik);
	printf("Jeszcze eksperyment z formatowaniem %6f\n",drugitescik);
	return(0);
}
