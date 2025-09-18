#include <iostream>
#include <string>
using namespace std;

int main()
{
    cout << "\tGame Designers Network:\n";
    int security = 0;

    string username;
    cout << "\nUsername: ";
    cin >> username;

    string password;
    cout << "Password: ";
    cin >> password;

    if (username  == "S.Meier" && password == "civilization")
    {
        cout << "\nHey, Sid.";
        security = 5;
    }
    if (username  == "S.Miyamoto" && password == "mariobros")
    {
        cout << "\nWhats up, Shigeru?";
        security = 5;
    }
    if (username  == "W.Wright" && password == "thesims")
    {
        cout << "\nHow goes it, Will?";
        security = 5;
    }
    if (username  == "guest" && password == "guest")
    {
        cout << "\nWelcome guest.";
        security = 1;
    }
    if (!security)
        cout << "\nYour logon failed";
    return 0;
}
