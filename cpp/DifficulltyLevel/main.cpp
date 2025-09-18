#include <iostream>
using namespace std;
//C++ games strona 83 ćw 1
int main()
{
    enum difficulty { NOOB = 1, EASY = 2, NORMAL = 3, HARD = 4, INSANE = 5};
//  difficulty playerDifficulty;
//  zmienna dopiero  przy konwersji z tempdiff do playerDifficulty
    int tempdiff;//przelotka do pobrania poziomu trudności
    cout << "Choose your skill level:\n";
    cout << "1. Noob\n2. Easy\n3. Normall\n4. Hard\n5. Insane\n";
//  cin nie sypnie wartości do enum. Poczebny konwertor :/
//  cin >> playerDifficulty;
    cin >> tempdiff;//dobra wiadomość, można podbrać cin przez przelotkę
//  playerDifficulty = tempdiff;
//  nie łorking :(
    difficulty playerDifficulty = (difficulty)tempdiff;
    if (playerDifficulty == NOOB)
        cout << "You picked noob. Enjoy!\n";
    else if (playerDifficulty == EASY)
        cout << "You picked easy. Have fun!\n";
    else if (playerDifficulty == NORMAL)
        cout << "You picked normal. Prepare to engage.\n";
    else if (playerDifficulty == HARD)
        cout << "You picked hard. Get ready for a bumpy ride.\n";
    else if (playerDifficulty == INSANE)
        cout << "You picked insane. You're already dead.\n";
    else
        cout << "Error. Bye.\n";
    return 0;
}
