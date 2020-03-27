// Dalio, Brian A.
// dalioba
// 2020-03-24

#include <fstream>
#include <iostream>
#include <regex>

using namespace std;

//----------------------------------------------------------
void processToken( string token )
{
  // Replace the following line with your code to classify
  // the string in 'token' according to your three Regular
  // Expressions and print the appropriate message.

  cout << ">" << token << "< is the proposed token.\n";
}

//----------------------------------------------------------
// DO NOT CHANGE anything below this line!
int main( int argc, char *argv[] )
{
  if ( argc > 1 ) {
    cout << "processing tokens from " << argv[ 1 ] << " ...\n";

    ifstream inputFile;
    string   token;

    inputFile.open( argv[ 1 ] );

    if ( inputFile.is_open() ) {
      while ( inputFile >> token ) {
        processToken( token );
      }
      inputFile.close();
    } else {
      cout << "unable to open " << argv[ 1 ] << "?\n";
    }
  } else {
    cout << "No input file specified.\n";
  }
}

//----------------------------------------------------------
