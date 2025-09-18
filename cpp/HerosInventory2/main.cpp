#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main()
{
    vector<string> inventory;
    //wpychamy przedmioty do ruchomej tabeli
    //zamieniamy tylko kiedy wiemy że przedmiot tam jest!!!
    inventory.push_back("sword");
    inventory.push_back("armor");
    inventory.push_back("shield");

    cout << "You have " << inventory.size() << " items.\n";

    cout << "\nYour items:\n";
    for (int i = 0; i < inventory.size(); ++i)
        cout <<  inventory[i] << endl;

    cout << "\nYou trade your sword for a battle axe.\n";
    inventory[0] = "battle axe";
    cout << "\nYour items:\n";
    for (int i = 0; i < inventory.size(); ++i)
        cout <<  inventory[i] << endl;

    cout << "\nThe item name '" << inventory[0] << "' has ";
    cout << inventory[0].size() << " letters in it\n";

    cout << "\nYour shield is destroyed in a fierce battle.";
    inventory.pop_back();
    cout << "\nYour items:\n";
    for (int i=0; i<inventory.size();++i)
        cout << inventory[i] << endl;

    cout << "\nYou were robbed of all possesions by a thief.";
    inventory.clear();
    if (inventory.empty())
        cout << "\nYou have nothing.\n";
    else
        cout << "\nYou have at least one item.\n";
    return 0;
}
