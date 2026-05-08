#include <stdio.h>

int main()
{
	char key;
	puts("Wklep literkę");
	scanf("%c",&key);
	printf("Wklepałeś %c!(kod ASCII to %d)\n",key,key);
	puts("Wklep jeszcze jedną :D");
	key=getchar();
	printf("Getchar nie łorking :(\n");
	putchar('D');
	putchar('U');
	putchar('P');
	putchar('A');
	putchar('!');
	putchar('\n');
	printf("Skrecze z Niemena!\n");
	int wynik=2+2*2;
	printf("Zobaczmy czy C ogarnia matmę:\n 2+2*2=%d\n",wynik);
	wynik=wynik+1;
	printf("Inkrementacja time! Po 6 następuje %d!\n",wynik);
	return(0);
}
