#include <iostream>
using namespace std;

int main()
{
    int score;
    double distance;
    char playAgain;
    bool shieldsUp;

    short lives, aliensKilled;

    score = 0;
    distance = 1200.76;
    playAgain = 'y';
    shieldsUp = true;
    lives = 3;
    aliensKilled = 10;

    double engineTemp = 6572.89;

    cout << "\nscore:\t" << score << endl;
    cout << "distance:\t" << distance << endl;
    cout << "playAgain:\t" << playAgain << endl;
    cout << "lives:\t\t" << lives << endl;
    cout << "aliensKilled:\t" << aliensKilled << endl;
    cout << "engineTemp:\t" << engineTemp << endl;
    int fuel;
    cout << "\n How much fuel?";
    cin >> fuel;
    cout << "fuel:" << fuel << endl;

    typedef unsigned short int ushort;
    ushort bonus = 10;
    cout << "\nbonus:\t" << bonus << endl;

    return 0;
}
