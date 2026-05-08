#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int rnd(void);
int rnd2(int range);
void seedrnd(void);
void behold(void);

int main()
{
	int x,ra;
	char choice;
	printf("Choose random mode:\n1. Shitty auto random\n2. Manual random\n3. Clock based random\n4. Modulus random\nYour selection: ");
	choice=getchar();
	switch(choice)
	{
	case '1':
		behold();
			for(x=0;x<100;x++)
				printf("%d\t",rnd());
		break;		
	case '2':
		seedrnda();
		behold();
			for(x=0;x<100;x++)
				printf("%d\t",rnd());
		break;		
	case '3':
		seedrndm();
		behold();
			for(x=0;x<100;x++)
				printf("%d\t",rnd());
		break;
	case '4':
//		printf("Range? ");
//		scanf("%d",ra);
		seedrndm();
		behold();
			for(x=0;x<100;x++)
				printf("%d\t",rnd2(10));
		break;
	default:
		printf("Oops! Try again. Bye now :)");
	}
	printf("\nRAND_MAX is equal to %u\n",RAND_MAX);
	return(0);
}
int rnd(void)
{
	int r;
	r=rand();
	return(r);
}
int rnd2(int range)
{
	int r;
	r=rand()%range;
	return(r);
}
// funkcja losująca na bazie inputu
void seedrnda(void)
{
	int seed;
	char s[6];
	printf("Enter a random number seed (2 - 65k)");
	seed=atoi(scanf("%s",s));
	srand(seed);
}
void seedrndm(void)
{
	srand(time(NULL));
}
void behold(void)
{
	puts("Behold! 100 random numbers!");
}
