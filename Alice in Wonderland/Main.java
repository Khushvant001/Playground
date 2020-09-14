#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int p = n/10 + (n - (n/10)*10)/1;
  cout<<"Alice must go in path-"<<p;
}