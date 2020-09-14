#include <iostream>
using namespace std;
int main() 
{
  int a;
  cin>>a;
  int i = 1;
  while(a / i != 0){
    i = i * 10;
  }
  i = i / 10;  
  int result = 0;
  while(i >= 1){
    result = result + (a / i);
    a = a - (a / i)*i;
    i = i / 10;
    
  }
  cout<<result;  
}