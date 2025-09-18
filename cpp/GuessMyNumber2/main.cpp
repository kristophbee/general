//komp będzie zgadywał :D
#include <iostream>
#include <cstdlib> //random
#include <ctime> //zegar do randoma
//#include <unistd.h>//biblioteka do sleepa opd niksem
using namespace std;

int main()
{
    int theNumber;
    int tries = 0, aiguess;
    cout << "Enter the number between 1 and 100. I wont peek :D\n";
    cin >> theNumber;
    srand(time(0));//seed time random number
    do
    {
    ++tries;
    aiguess = rand() % 100 +1;
    cout << "Is it " << aiguess << " ? ";
    if (aiguess > theNumber)
        cout << "Nah, I think its less. Let me try again.\n";
    if (aiguess < theNumber)
        cout << "More? Let me try again.\n";
//spowalniacz
//    for(timer=0;timer==1000000000;timer++)
//    {
//  już działa - nie poczeba
//      cout << timer;
//    }
//    cout << "\n";
//    sleep(1);
    }//koniec cyklu
    while (aiguess != theNumber);
    cout << "Ha, I knew it was " << theNumber;
    cout << " all along and it only took me " << tries << " tries :D\n" ;
    return 0;
}
