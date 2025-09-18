#include <iostream>
#include <cstdlib> //random
#include <ctime> //zegar do randoma
using namespace std;

int main()
{
    srand(time(0));//seed time random number
    int theNumber = rand() % 100 +1; //liczba losowa + dzielenie z resztą
    int tries = 0, guess;
    cout << "\tGuess the number \n\n";
    do
    {
        cout <<"Enter a guess: ";
        cin >> guess;
        ++tries;
        if (guess > theNumber)
            cout << "Too high!\n\n";
        if (guess < theNumber)
            cout << "Too low!\n\n";
    } while (guess != theNumber);
    cout << "\nYes! " << theNumber << " is THE number! You got it in " << tries << " attempts.\n";
    return 0;
}
