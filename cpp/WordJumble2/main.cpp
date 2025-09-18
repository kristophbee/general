#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>

using namespace std;

int main()
{
    enum fields {WORD, HINT, NUM_FIELDS};
//5 to suma słów w bazie
    const int NUM_WORDS = 5;
    const string WORDS[NUM_WORDS][NUM_FIELDS] =
    {
        {"wall","Do you feel youre banging again something?"},
        {"glasses", "These might help you see the answer"},
        {"labored", "Going slow, is it?"},
        {"persistent", "Keep at it"},
        {"jumble", "Its what the game is all about"}
    };
    //losujemy!
    srand(time(0));
    //wyciągamy poprzez dzielenie z resztą słowo z macierzy
    int choice =(rand()%NUM_WORDS);
    //zasysamy słowo i podpowiedź
    string theWord = WORDS[choice][WORD];
    string theHint = WORDS[choice][HINT];
    string jumble = theWord; //klonujemy wartość do mieszania
    int length = jumble.size();//rozmiar słowa
    for (int i=0; i< length; ++i)
    {
        int index1=(rand()%length);
        int index2=(rand()%length);
        char temp = jumble[index1];
        jumble[index1] = jumble[index2];
        jumble[index2] = temp;
    }
    cout << "/t/t/tWelcome to the Word Jumble!\n\n";
    cout << "Unscramble the letters to make a word.\n";
    cout << "Enter 'hint' for a hint.\n";
    cout << "Enter 'quit' to quit the game.\n";
    cout << "The jumble is: " << jumble;
    //scoring system
    int score = 100;
    string guess;
    cout << "\n\nYour guess: ";
    cin >> guess;
    while ((guess != theWord && guess !="quit"))
        {
            if (guess == "hint")
                {
                    cout << theHint;
                    score = score-50;
                }
            else
            {
                cout << "Sorry, that is not it.";
                score = score-5;
            }
            cout << "\n\nYour guess: ";
            cin >> guess;
        }
        if (guess == theWord)
            cout << "\nThats it! You guessed it! Your score is " << score;
        cout << "\nThanks for playing.\n";
    return 0;
}
